package com.ms.user.services;

import com.ms.user.models.UserModel;
import com.ms.user.producers.UserProducer;
import com.ms.user.repositories.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserProducer userProducer;
    private final UserRepository userRepository;

    @Transactional
    public UserModel save(UserModel userModel) {

        userModel = userRepository.save(userModel);

        userProducer.publishMessageEmail(userModel);

        return userModel;
    }
}
