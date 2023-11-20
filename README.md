# API Escola
Sistema para cadastro de turma, professor, aluno e seu responsável.

### ✔️ Técnicas e tecnologias utilizadas
- ``Java 17``
- ``Spring Boot 3.0.6``
- ``Maven``
- ``JPA``
- ``H2``
- ``PostgreSQL``
- ``PGAdmin``
- ``IntelliJ IDEA``
- ``Postman - para teste da APi local e na cloud Railway``
- ``Swagger - para teste da API local e na cloud Railway``
- ``Git e GitHub - Cloud Sincronizando na branch dev a cada merge fazendo deploy``
- ``Cloud Railway``

### Clone Projeto
```
git clone https://github.com/matheusprata/Escola.git
```
### Cloud Railway
```

```

****Postman realizando consulta ao banco de dados e realizando as implementações da API Escola****

## Swagger
***http://localhost:8080/escola/api/public/swagger***

**Responsavel:**
![tela swagger 1](https://github.com/matheusprata/Escola/assets/103780607/41df2312-945f-4fab-9f46-ea2e044a772f)
**Professor e aluno:**
![tela swagger 2](https://github.com/matheusprata/Escola/assets/103780607/5fd6fc18-77fd-4e26-9a8b-0fa81ecc1667)
**Turma:**
![tela swagger 3](https://github.com/matheusprata/Escola/assets/103780607/7233882a-62a8-4bc5-a9e9-08bb4a3afd05)

## Postman

- ``Criação da Turma, necessaria para criação de Aluno e Professor.``
- ``Criação do Professor utilizando o idTurma.``
- ``Criação do Aluno utilizando o idTurma.``
- ``Criação do Responsável do Aluno utilizando o idAluno.``

### Turma
**Criação da Turma:**
![Post Turma id 2 6 serie](https://github.com/matheusprata/Escola/assets/103780607/b91091cd-65f7-4dab-90fa-e137b61df77e)
**Altera Turma através do idTurma:**
![patch turma por id 1](https://github.com/matheusprata/Escola/assets/103780607/e9f5348e-6534-4b12-8548-6dc14685d731)
**Busca Turma através do idTurma 2:**
![get turma id 2](https://github.com/matheusprata/Escola/assets/103780607/1b0829be-1549-4e08-80b1-d01f87e958cf)
**Busca Turma através do ano 2023:**
![get turma all ano 2023](https://github.com/matheusprata/Escola/assets/103780607/8385c1c9-0fe5-4aae-bd5a-cd027c93d534)
**Busca todas as Turmas:**
![get turma all](https://github.com/matheusprata/Escola/assets/103780607/f5814407-4a7d-4f4a-afcc-c45b920ff469)

### Professor
**Criação do Professor através IdTurma 2:**
![post professor turma id 2](https://github.com/matheusprata/Escola/assets/103780607/4291da19-ecf4-4112-a480-55b402de54fb)
**Criação do segundo Professor através IdTurma 2:**
![post 2 professor turma id 2](https://github.com/matheusprata/Escola/assets/103780607/8856f9d9-6663-44c6-bd39-5d3a2ba8e295)
**Busca Professor através do idProfessor:**
![get professor por id](https://github.com/matheusprata/Escola/assets/103780607/0e777905-5ca5-44c6-8dda-6551e0b1472c)
**Busca todos os Professores:**
![get all professor](https://github.com/matheusprata/Escola/assets/103780607/868723ba-1d71-4330-8f1d-4f399f8d0605)
**Busca Professor através do idTurma 2:**
![get all professor por id turma 2](https://github.com/matheusprata/Escola/assets/103780607/93cbfb34-31fb-4c1e-8302-a61a794ef3b5)
**Busca Professor através do idTurma 1:**
![get all professor por id turma 1](https://github.com/matheusprata/Escola/assets/103780607/b0c33a6b-96e9-4265-b5b9-1ea6c5e81ec2)
**Altera Professor atraves do idProfessor**
![patch professor por id](https://github.com/matheusprata/Escola/assets/103780607/f67a0163-12aa-489b-a548-95bd6353b166)

### Aluno
**Criação do Aluno na turma atraves do idTurma 2:**
![post aluno turma 2](https://github.com/matheusprata/Escola/assets/103780607/2dc0c9db-334f-4373-88a9-afd26a1ca971)
**Aluno ja cadastrado na Turma, idTurma 2:**
![post erro aluno ja cadastrado turma 2](https://github.com/matheusprata/Escola/assets/103780607/4c28c2c0-1e94-4373-9508-d18e5074c1a6)
**Busca todos os Alunos Turma, idTurma 1:**
![get all alunos turma 1](https://github.com/matheusprata/Escola/assets/103780607/ed0d0d2b-e554-4422-a500-c21483c0309d)
**Busca todos os Alunos Turma, idTurma 2:**
![get all alunos turma 2](https://github.com/matheusprata/Escola/assets/103780607/2d478108-a233-4444-b533-83c738dcbd18)
**Busca Aluno através do CPF:**
![get cpf aluno](https://github.com/matheusprata/Escola/assets/103780607/e90ac72b-650f-4d62-81f6-8c12377aa8c9)
**Altera Aluno através do CPF:**
![patch cpf aluno](https://github.com/matheusprata/Escola/assets/103780607/79e3c8b2-3fcb-4cad-b5a8-1cb62344f9cb)
**Busca todos os Alunos cadastrados na API:**
![get all alunos](https://github.com/matheusprata/Escola/assets/103780607/ee5fedfa-f820-4da6-9f49-af64c973b0c4)

### Responsável
**Criação do Responsável do Aluno através do idAluno:**
![post responsavel id aluno](https://github.com/matheusprata/Escola/assets/103780607/11e87e91-de7a-467e-a434-ffb9b7fb8871)
**Criação do segundo Responsável do Aluno através do idAluno:**
![post 2 responsavel id aluno](https://github.com/matheusprata/Escola/assets/103780607/6825185b-4243-453b-9316-5130ee479192)
**Busca todos os Responsaveis do Aluno através do idAluno:**
![get all responsaveis do aluno por id](https://github.com/matheusprata/Escola/assets/103780607/68ce79d2-5f4e-4e42-8364-904a5fc919a1)
**Busca todos os Responsaveis cadastrados na API:**
![get all responsaveis](https://github.com/matheusprata/Escola/assets/103780607/c1c5b6cd-9123-405d-822f-8696bf1cd2ca)
**Altera Responsável através do idResponsavel:**
![patch responsavel por id](https://github.com/matheusprata/Escola/assets/103780607/4cca84ed-9bff-4a85-8737-d09c03f84d8d)

## Diagrama Entidade Relacionamento API Escola
![API escola - DER](https://github.com/matheusprata/Escola/assets/103780607/fca22177-5109-4b12-80bf-50c0e52ed046)

## Trechos de código
### ⚠️ Profile é uma variável de ambiente para banco de dados
- ``banco test spring.profiles.active=${APP_PROFILE:test}``
- ``banco dev spring.profiles.active=${APP_PROFILE:dev}``
- ``banco prod spring.profiles.active=${APP_PROFILE:prod}``

**application.yml**
```
spring:
  profiles:
    active: ${SPRING_PROFILES_ACTIVE:dev}
cors:
  origins: http://localhost:5173,http://localhost:3000
server:
  servlet:
    context-path: /escola/api
springdoc:
  swagger-ui:
    path: /public/swagger
```
**application-test.yml**
```
spring:
  datasource:
    url: jdbc:h2:mem:demodb
    username: sa
    password:
    driverClassName: org.h2.Driver
  h2:
    console:
      enabled: true
      path: /h2-console
```
**application-dev.yml**
```
spring:
  datasource:
    driverClassName: org.postgresql.Driver
    url: jdbc:postgresql://localhost:5432/escola?createDatabaseIfNotExist=true
    username: postgres
    password: 852456
  jpa:
    generate-ddl: true
    show-sql: true
    hibernate:
      ddl-auto: update
```
**application-prod.yml**
```
spring:
  datasource:
    driverClassName: org.postgresql.Driver
    url: ${DB_URL}
    username: ${DB_USERNAME}
    password: ${DB_PASSWORD}
  jpa:
    generate-ddl: true
    properties:
      hibernate:
        ddl-auto: update
        show_sql: true
        format_sql: true
        dialect: org.hibernate.dialect.PostgreSQLDialect
    open-in-view: false
```
**system.properties**``importante para definir no cloud a versão do java``
```
java.runtime.version=17
```
