# Catalog-service

Serviço em RESTFul CRUD que gerencia produtos, categorias e seus fornecedores em modelagem JPA.

## Funcionalidades
* adicionar fornecedores para um produto;
* alterar a categoria de um produto;
* listar produtos por categorias;
* listar produtos por fornecedor;
* listar os produtos com desconto acima de um valor informado por parâmetro -
ex: 30 (para 30%)

## Modelagem
![This is a alt text.](/image/bd.jpeg "This is a sample image.")

# Getting Started
`> maven clean install` 
* ` Build project`

## Resources
* H2: http://localhost:8080/h2-console (adicionar DataBase gerado em H2ConsoleAutoConfiguration)

### Stack
Informações sobre as tecnologias usada na aplicação:
* Java 11
* Spring boot 2.5.1
* Banco de dados em memória H2 
* JPA/Hibernate ORM core version 5.4.32.Final

## TODO
* Aumentar a cobertura de testes unitários
* Adicionar documentação Swagger - Spring Fox
* Adicionar tratamento de erros com ExpectionHandler
