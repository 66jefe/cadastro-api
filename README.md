# API Cadastro de pessoas

## Sobre o projeto
API Cadastro de pessoas é um crud back-end. 
A aplicação consiste em fazer a criação de cadastro de pessoas. Listar todos as pessoas criados e por ID. Alterar qualquer funcionario e deletar por ID.

## Tecnologias utilizadas
- Java
- Spring Boot
- Spring Security
- JPA / Hibernate
- Project Lombok
- Maven
- H2(banco de dados em memoria)
- Postman

# Endpoints

Pré-requisito: Java 17

### criar pessoas
Para criar uma pessoa, dentro do postman, utilizar o verbo POST para fazer o envio utilizando o caminho http://localhost:8080/cadastrar. Passando no JSON nome, idade, CPF, sexo e telefone.

### lista pessoas
Para listar todos basta apenas seguir a rota http://localhost:808/listar ou caso queira por id basta apenas seguir http://localhost:808/listar/{id}.

### alterar pessoas
Altera o pessoas utilizando no postman o metodo PUT, passando o caminho com o ID, exemplo: http://localhost:8080/alterar/{id}, e alterando os dados necessarios.

### deletar pessoas
Para deletar, precisa passar o ID, onde dentro do postman utiliza o verbo DELETE e passa o caminho com o id no final, exemplo http://localhost:8080/remover/{id}.
