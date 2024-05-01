create schema if not exists public;

create table if not exists public.products
(
    id   serial primary key,
    name varchar(255) not null
);

insert into public.products (name)
values ('Beer'),
       ('Chocolate');