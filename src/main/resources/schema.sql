create table if not exists CUSTOMERS
(
    id           serial primary key,
    name         varchar,
    surname      varchar,
    age          int,
    phone_number text
);

create table if not exists ORDERS
(
    id           serial primary key,
    date         varchar,
    product_name varchar,
    customer_id  int,
    phone_number text,
    FOREIGN KEY (customer_id) references customers (id)
);

INSERT INTO CUSTOMERS (name, surname, age, phone_number)
VALUES ('Ivan', 'Petrov', 30, '+1234567890');

INSERT INTO ORDERS (date, product_name, customer_id, phone_number)
VALUES ('2024-09-23', 'Laptop', 1, '+1234567890');


