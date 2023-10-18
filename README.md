# Microsserviços de User e Email

## Objetivo do Projeto

O objetivo deste projeto é criar dois microsserviços que se comunicam por filas utilizando RabbitMQ. O microsserviço de User é responsável por cadastrar os usuários, e o serviço de Email dispara os e-mails através do broker utilizando o microsserviço de emails.

## Informações Importantes

### Tecnologias Utilizadas

- Ambos os Microsserviços foram desenvolvidos utilizando Spring Boot 3, Java 17, Maven e PostgreSQL.

### Configuração

Antes de executar os microsserviços, siga as etapas de configuração a seguir:

#### Para o Microsserviço de Users:

- A porta utilizada é a 8081.
- Verifique a configuração de conexão com o banco no arquivo `application.properties` e faça as alterações necessárias de acordo com sua configuração de banco de dados.
- Substitua o conteúdo de `spring.rabbitmq.addresses` no arquivo `application.properties` pelo endereço real do RabbitMQ.

#### Para o Microsserviço de Email:

- A porta utilizada é a 8082.
- Verifique a configuração de conexão com o banco no arquivo `application.properties` e faça as alterações necessárias de acordo com sua configuração de banco de dados.
- Altere `spring.mail.username` para o endereço de e-mail real que será usado para enviar e-mails.
- Altere `spring.mail.password` para a senha de APP do GMAIL (gerada no suporte da Google).
- Substitua o conteúdo de `spring.rabbitmq.addresses` no arquivo `application.properties` pelo endereço real do RabbitMQ.

## Execução

Para executar os microsserviços, você pode utilizar as ferramentas e comandos padrão do Spring Boot. Certifique-se de que os serviços estejam configurados corretamente conforme as instruções acima.
