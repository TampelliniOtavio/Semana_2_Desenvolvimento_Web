create database if not exists pais;
use pais;

create table if not exists pais(
	id int auto_increment primary key,
    nome varchar(100) not null,
    populacao bigint not null,
    area double(15,2) not null
);