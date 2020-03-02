[![Build Status](https://travis-ci.org/leogallotti/ponto-inteligente.svg?branch=master)](https://travis-ci.org/leogallotti/ponto-inteligente)
# Ponto-inteligente
API do sistema com Java e Spring Boot

### Detalhes da API RESTful
A API RESTful de Ponto Inteligente contém as seguintes características:  
* Projeto criado com Spring Boot e Java 8
* Banco de dados MySQL com JPA e Spring Data JPA
* Autenticação e autorização com Spring Security e tokens JWT (JSON Web Token)
* Migração de banco de dados com Flyway
* Testes unitários e de integração com JUnit e Mockito
* Caching com EhCache
* Integração contínua com TravisCI


#comandos para criar database no oracle
* create user ponto_inteligente identified by 123456 default tablespace users quota 20M on Users;
* grant create table, create view, create procedure, create trigger, connect, create session, create sequence to ponto_inteligente;

#comando para criar database no mysql
* create database if not exists ponto_inteligente
