-- Работа с MySQL

-- В MySQL создана база данных с названием "final_specialization".
-- Cозданы таблицы pet_animals и pack_animals, cоответствующие классам проекта


CREATE DATABASE final_specialization;
USE final_specialization;

CREATE TABLE Animal
(
	id INT AUTO_INCREMENT PRIMARY KEY,
    pets_pack VARCHAR(15),
    type_of_animal VARCHAR(15)

);

INSERT Animal(pets_pack, type_of_animal) 
VALUES
('pack_animals', 'Horse'),
('pack_animals', 'Camel'),
('pack_animals', 'Donkey'),
('pet_animals', 'Dog'),
('pet_animals', 'Cat'),
('pet_animals', 'Hamster');


#TRUNCATE Animal;

USE final_specialization;
CREATE TABLE IF NOT EXISTS pet_animals (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name_animal VARCHAR(50) NOT NULL,
    type_of_animal VARCHAR(20) NOT NULL,
    date_of_birth DATE,
    commands VARCHAR(100)
);


INSERT INTO pet_animals (name_animal, type_of_animal, date_of_birth, commands) 
VALUES 
('Fido', 'Dog', '2020-01-01', 'Sit, Stay, Fetch'),
('Whiskers', 'Cat', '2019-05-15', 'Sit, Pounce'),
('Hammy', 'Hamster', '2021-03-10', 'Roll, Hide'),
('Buddy', 'Dog', '2018-12-10', 'Sit, Paw, Bark'),
('Smudge', 'Cat', '2020-02-20', 'Sit, Pounce, Scratch'),
('Peanut', 'Hamster', '2021-08-01', 'Roll, Spin'),
('Bella', 'Dog', '2019-11-11', 'Sit, Stay, Roll'),
('Oliver', 'Cat', '2020-06-30', 'Meow, Scratch, Jump');

USE final_specialization;
CREATE TABLE IF NOT EXISTS pack_animals (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name_animal VARCHAR(50) NOT NULL,
    type_of_animal VARCHAR(20) NOT NULL,
    date_of_birth DATE,
    commands VARCHAR(100)
);


INSERT INTO pack_animals (name_animal, type_of_animal, date_of_birth, commands) 
VALUES 
('Thunder', 'Horse', '2015-07-21', 'Trot, Canter, Gallop'),
('Sandy', 'Camel', '2016-11-03', 'Walk, Carry Load, Bray'),
('Eeyore', 'Donkey', '2017-09-18', 'Roll, Hide'),
('Storm', 'Horse', '2014-05-05', 'Trot, Canter'),
('Dune', 'Camel', '2018-12-12', 'Walk, Sit'),
('Burro', 'Donkey', '2019-01-23', 'Walk, Bray, Kick'),
('Blaze', 'Horse', '2016-02-29', 'Trot, Jump, Gallop'),
('Sahara', 'Camel', '2022-08-14', 'Walk, Run');


-- Создание таблиц по видам животных в соответствии с классами в проекте 
USE final_specialization;
CREATE TABLE IF NOT EXISTS dog (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name_animal VARCHAR(50) NOT NULL,
    date_of_birth DATE,
    commands VARCHAR(100)
);

INSERT INTO dog (name_animal, date_of_birth, commands) 
VALUES 
('Fido', '2020-01-01', 'Sit, Stay, Fetch'),
('Buddy', '2018-12-10', 'Sit, Paw, Bark'),
('Bella', '2019-11-11', 'Sit, Stay, Roll');

USE final_specialization;
CREATE TABLE IF NOT EXISTS cat (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name_animal VARCHAR(50) NOT NULL,
    date_of_birth DATE,
    commands VARCHAR(100)
);

INSERT INTO cat (name_animal, date_of_birth, commands) 
VALUES 
('Whiskers', '2019-05-15', 'Sit, Pounce'),
('Smudge', '2020-02-20', 'Sit, Pounce, Scratch'),
('Oliver', '2020-06-30', 'Meow, Scratch, Jump');

CREATE TABLE IF NOT EXISTS hamster (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name_animal VARCHAR(50) NOT NULL,
    date_of_birth DATE,
    commands VARCHAR(100)
);

INSERT INTO cat (name_animal, date_of_birth, commands) 
VALUES 
('Hammy', '2021-03-10', 'Roll, Hide'),
('Peanut', '2021-08-01', 'Roll, Spin');

USE final_specialization;
CREATE TABLE IF NOT EXISTS horse (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name_animal VARCHAR(50) NOT NULL,
    date_of_birth DATE,
    commands VARCHAR(100)
);

INSERT INTO horse (name_animal, date_of_birth, commands) 
VALUES 
('Thunder', '2015-07-21', 'Trot, Canter, Gallop'),
('Storm', '2014-05-05', 'Trot, Canter'),
('Blaze', '2016-02-29', 'Trot, Jump, Gallop');

CREATE TABLE IF NOT EXISTS camel (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name_animal VARCHAR(50) NOT NULL,
    date_of_birth DATE,
    commands VARCHAR(100)
);

INSERT INTO camel (name_animal, date_of_birth, commands) 
VALUES 
('Sahara', '2015-08-14', 'Walk, Run'),
('Sandy', '2016-11-03', 'Walk, Carry Load, Bray'),
('Dune', '2018-12-12', 'Walk, Sit');

CREATE TABLE IF NOT EXISTS donkey (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name_animal VARCHAR(50) NOT NULL,
    date_of_birth DATE,
    commands VARCHAR(100)
);

INSERT INTO donkey (name_animal, date_of_birth, commands) 
VALUES 
('Burro', '2019-01-23', 'Walk, Bray, Kick'),
('Eeyore', '2017-09-18', 'Roll, Hide');

-- Удаление записи о верблюдах

-- Удаление таблицы camel
DROP TABLE camel;

-- Стереть записи о верблюдах из таблицы pack_animals
UPDATE pack_animals
SET type_of_animal = NULL
WHERE type_of_animal = 4;

-- Объединение таблицы лошадей и ослов
# решение первое - через создание новой таблицы horse_donkey
CREATE TABLE IF NOT EXISTS horse_donkey
SELECT id, name_animal, date_of_birth, commands FROM horse
UNION SELECT id, name_animal, date_of_birth, commands FROM donkey;

# вторым решением будет копирование строк с таблицы donkey в таблицу horse
INSERT INTO horse (name_animal, date_of_birth, commands)
SELECT name_animal, date_of_birth, commands
FROM donkey;

-- Создать новую таблицу для животных в возрасте от 1 до 3 лет и вычислить их возраст с точностью до месяца

USE final_specialization;
CREATE TABLE IF NOT EXISTS young_animals (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name_animal VARCHAR(50) NOT NULL,
    type_of_animal VARCHAR(15) NOT NULL,
    date_of_birth DATE,
    commands VARCHAR(100)
);

# создание новой таблицы для животных в возрасте от 1 до 3-х лет
INSERT INTO young_animals (name_animal, type_of_animal, date_of_birth, commands) 
SELECT name_animal, type_of_animal, date_of_birth, commands
FROM pet_animals
WHERE TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) BETWEEN 1 AND 3;
INSERT INTO young_animals (name_animal, type_of_animal, date_of_birth, commands) 
SELECT name_animal, type_of_animal, date_of_birth, commands
FROM pack_animals
WHERE TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) BETWEEN 1 AND 3;

# выборка по возрасту животных (в месяцах)
SELECT id, name_animal, type_of_animal, date_of_birth, TIMESTAMPDIFF(MONTH, date_of_birth, CURDATE()) AS age
FROM young_animals;

# можно сделать отдельную выборку из таблицы с домашними животными pet_animals
SELECT id, name_animal, type_of_animal, date_of_birth, TIMESTAMPDIFF(MONTH, date_of_birth, CURDATE()) AS age
FROM pet_animals;

# можно сделать отдельную выборку из таблицы с вьючными животными pack_animals
SELECT id, name_animal, type_of_animal, date_of_birth, TIMESTAMPDIFF(MONTH, date_of_birth, CURDATE()) AS age
FROM pack_animals;


-- Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам
# объединяю таблицы при помощи LEFT JOIN для левостороннего внешнего объединения таблиц, который позволяет извлекать 
# данные из таблицы, дополняя их данными из другой таблицы

SELECT dog.name_animal, dog.date_of_birth, dog.commands, pet_animals.type_of_animal, animal.type_of_animal
FROM dog
LEFT JOIN pet_animals ON pet_animals.name_animal = dog.name_animal
LEFT JOIN animal ON animal.type_of_animal = pet_animals.type_of_animal
UNION
SELECT cat.name_animal, cat.date_of_birth, cat.commands, pet_animals.type_of_animal, animal.type_of_animal
FROM cat
LEFT JOIN pet_animals ON pet_animals.name_animal = cat.name_animal
LEFT JOIN animal ON animal.type_of_animal = pet_animals.type_of_animal
UNION
SELECT hamster.name_animal, hamster.date_of_birth, hamster.commands, pet_animals.type_of_animal, animal.type_of_animal
FROM hamster
LEFT JOIN pet_animals ON pet_animals.name_animal = hamster.name_animal
LEFT JOIN animal ON animal.type_of_animal = pet_animals.type_of_animal
UNION
SELECT horse.name_animal, horse.date_of_birth, horse.commands, pack_animals.type_of_animal, animal.type_of_animal
FROM horse
LEFT JOIN pack_animals ON pack_animals.name_animal = horse.name_animal
LEFT JOIN animal ON animal.type_of_animal = pack_animals.type_of_animal
UNION
SELECT camel.name_animal, camel.date_of_birth, camel.commands, pack_animals.type_of_animal, animal.type_of_animal
FROM camel
LEFT JOIN pack_animals ON pack_animals.name_animal = camel.name_animal
LEFT JOIN animal ON animal.type_of_animal = pack_animals.type_of_animal
UNION
SELECT donkey.name_animal, donkey.date_of_birth, donkey.commands, pack_animals.type_of_animal, animal.type_of_animal
FROM donkey
LEFT JOIN pack_animals ON pack_animals.name_animal = donkey.name_animal
LEFT JOIN animal ON animal.type_of_animal = pack_animals.type_of_animal;
