INSERT INTO tb_pet_type(id, name) VALUES (1, 'cat');
INSERT INTO tb_pet_type(id, name) VALUES (2, 'dog');
INSERT INTO tb_pet_type(id, name) VALUES (3, 'lizard');
INSERT INTO tb_pet_type(id, name) VALUES (4, 'snake');
INSERT INTO tb_pet_type(id, name) VALUES (5, 'bird');
INSERT INTO tb_pet_type(id, name) VALUES (6, 'hamster');

INSERT INTO tb_owner(id, name, address, city, cellphone) VALUES (1, 'George', '110 W. Liberty St.', 'Madison', '6085551023');
INSERT INTO tb_owner(id, name, address, city, cellphone) VALUES (2, 'Betty', '638 Cardinal Ave.', 'Sun Prairie', '6085551749');
INSERT INTO tb_owner(id, name, address, city, cellphone) VALUES (3, 'Eduardo', '2693 Commerce St.', 'McFarland', '6085558763');
INSERT INTO tb_owner(id, name, address, city, cellphone) VALUES (4, 'Harold', '563 Friendly St.', 'Windsor', '6085553198');
INSERT INTO tb_owner(id, name, address, city, cellphone) VALUES (5, 'Peter', '2387 S. Fair Way', 'Madison', '6085552765');
INSERT INTO tb_owner(id, name, address, city, cellphone) VALUES (6, 'Jean', '105 N. Lake St.', 'Monona', '6085552654');
INSERT INTO tb_owner(id, name, address, city, cellphone) VALUES (7, 'Jeff', '1450 Oak Blvd.', 'Monona', '6085555387');
INSERT INTO tb_owner(id, name, address, city, cellphone) VALUES (8, 'Maria', '345 Maple St.', 'Madison', '6085557683');
INSERT INTO tb_owner(id, name, address, city, cellphone) VALUES (9, 'David', '2749 Blackhawk Trail', 'Madison', '6085559435');
INSERT INTO tb_owner(id, name, address, city, cellphone) VALUES (10, 'Carlos', '2335 Independence La.', 'Waunakee', '6085555487');

INSERT INTO tb_pet(id, name, birth_date, type_id, owner_id) VALUES (1, 'Leo', '2000-09-07', 1, 1);
INSERT INTO tb_pet(id, name, birth_date, type_id, owner_id) VALUES (2, 'Basil', '2002-08-06', 6, 2);
INSERT INTO tb_pet(id, name, birth_date, type_id, owner_id) VALUES (3, 'Rosy', '2001-04-17', 2, 3);
INSERT INTO tb_pet(id, name, birth_date, type_id, owner_id) VALUES (4, 'Jewel', '2000-03-07', 2, 3);
INSERT INTO tb_pet(id, name, birth_date, type_id, owner_id) VALUES (5, 'Iggy', '2000-11-30', 3, 4);
INSERT INTO tb_pet(id, name, birth_date, type_id, owner_id) VALUES (6, 'George', '2000-01-20', 4, 5);
INSERT INTO tb_pet(id, name, birth_date, type_id, owner_id) VALUES (7, 'Samantha', '1995-09-04', 1, 6);
INSERT INTO tb_pet(id, name, birth_date, type_id, owner_id) VALUES (8, 'Max', '1995-09-04', 1, 6);
INSERT INTO tb_pet(id, name, birth_date, type_id, owner_id) VALUES (9, 'Lucky', '1999-08-06', 5, 7);
INSERT INTO tb_pet(id, name, birth_date, type_id, owner_id) VALUES (10, 'Mulligan', '1997-02-24', 2, 8);
INSERT INTO tb_pet(id, name, birth_date, type_id, owner_id) VALUES (11, 'Freddy', '2000-03-09', 5, 9);
INSERT INTO tb_pet(id, name, birth_date, type_id, owner_id) VALUES (12, 'Lucky', '2000-06-24', 2, 10);
INSERT INTO tb_pet(id, name, birth_date, type_id, owner_id) VALUES (13, 'Sly', '2002-06-08', 1, 10);

INSERT INTO tb_visit(id, pet_id, visit_date, description) VALUES (1, 7, '2010-03-04', 'rabies shot');
INSERT INTO tb_visit(id, pet_id, visit_date, description) VALUES (2, 8, '2011-03-04', 'rabies shot');
INSERT INTO tb_visit(id, pet_id, visit_date, description) VALUES (3, 8, '2009-06-04', 'neutered');
INSERT INTO tb_visit(id, pet_id, visit_date, description) VALUES (4, 7, '2008-09-04', 'spayed');