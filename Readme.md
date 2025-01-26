# E-commerce API

Esta é uma API desenvolvida com base no curso Java COMPLETO Programação Orientada a Objetos + Projetos ofertado pelo professor Nelio Alves na Udemy. Ela permite gerenciar produtos, categorias, usuários,
pedidos e pagamentos.

## Funcionalidades

- Gerenciamento de Produtos
- Gerenciamento de Categorias
- Gerenciamento de Usuários
- Gerenciamento de Pedidos
- Gerenciamento de Pagamentos

## Tecnologias Utilizadas

- Java 11
- Spring Boot
- JPA / Hibernate
- Maven
- Docker
- MySQL

## Requisitos

- Java 11 ou superior
- Maven
- Docker (opcional, para executar com Docker Compose)
- MySQL

## Instalação

### Clonar o Repositório

git clone https://github.com/seu-usuario/ecommerce-api.git
cd ecommerce-api

### Configurar o Banco de Dados

1. Edite o arquivo `src/main/resources/application.yml` com as credenciais do seu banco de dados MySQL.

spring:
datasource:
url: jdbc:mysql://localhost:3306/ecommerce
username: seu-usuario
password: sua-senha
jpa:
hibernate:
ddl-auto: update

### Executar a Aplicação

Você pode executar a aplicação de duas maneiras:

#### Usando Maven

mvn spring-boot:run

#### Usando Docker Compose

docker-compose up

## Documentação

### Swagger

A documentação da API pode ser acessada através do Swagger em:
http://localhost:8080/swagger-ui/index.html#/

