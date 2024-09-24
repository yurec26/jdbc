create table if not exists PERSONS
(
    name           text,
    surname        text,
    age            int,
    phone_number   text,
    city_of_living text,
    PRIMARY KEY (name, surname, age)
);



INSERT  INTO  PERSONS (name, surname, age, phone_number, city_of_living)
VALUES ('Ivan', 'Petrov', 30, '+1234567890', 'Moscow')
ON CONFLICT (name, surname, age) DO NOTHING;


INSERT INTO PERSONS (name, surname, age, phone_number, city_of_living)
VALUES ('Artem', 'Petrov', 30, '+1234567890', 'Astana')
ON CONFLICT (name, surname, age) DO NOTHING;


INSERT INTO PERSONS (name, surname, age, phone_number, city_of_living)
VALUES ('Bibi', 'Petrova', 25, '+1234567890', 'Moscow')
ON CONFLICT (name, surname, age) DO NOTHING;