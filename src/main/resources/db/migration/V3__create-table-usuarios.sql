
create table usuarios(
    id bigint not null auto_increment,
    login varchar(100) not null,
    contra varchar(350) not null,
    primary key(id)
);