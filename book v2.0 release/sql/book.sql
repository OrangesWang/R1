drop database if exists book;

create database book;

use book;

create table t_user(
                       `id` int primary key auto_increment,
                       `username` varchar(20) not null unique,
                       `password` varchar(32) not null,
                       `email` varchar(200),
                       `priority` int default('1')
);

insert into t_user(`username`,`password`,`email`,priority) values('admin','admin','admin@wjp.com',0);

select * from t_user;