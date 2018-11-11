create table animal(
    idanimal bigint auto_increment,
    nome varchar(100) not null,
    raca varchar(100) not null,
    idade int not null,
    peso double not null,
    dono varchar(100) not null,
    primary key (idanimal)
);

create table cliente(
    idcliente bigint auto_increment,
    nome varchar(100) not null,
    endereco varchar(200) not null,
    complemento varchar(20) not null,
    numero int not null,
    cpf bigint not null,
    primary key (idcliente)
);

create table funcionario(
    idfuncionario bigint auto_increment,
    nome varchar(100) not null,
    endereco varchar(200) not null,
    funcao varchar(100) not null,
    cpf bigint not null,
    salario double not null,
    primary key (idfuncionario)
);