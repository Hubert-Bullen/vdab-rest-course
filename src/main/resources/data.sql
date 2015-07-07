
/*INSERT INTO car_make(id, brand) VALUES (1,'BMW');
INSERT INTO car_make(id, brand) VALUES (2,'AUDI');
INSERT INTO car_make(id, brand) VALUES (3,'MERCEDES');

INSERT INTO car_model(id, name, engine, pk, make_id) VALUES (1,'A3','BIO', 140, 2);
INSERT INTO car_model(id, name, engine, pk, make_id) VALUES (2,'X2','HYBRID', 120, 1);
INSERT INTO car_model(id, name, engine, pk, make_id) VALUES (3,'318','DIESEL', 135, 3);

INSERT INTO car(id, license_plate, model_id) VALUES (1,'RLX-666',3);
INSERT INTO car(id, license_plate, model_id) VALUES (2,'PTY-999',2);
INSERT INTO car(id, license_plate, model_id) VALUES (3,'SLP-333',1);*/

INSERT INTO car_make(brand) VALUES ('BMW');
INSERT INTO car_make(brand) VALUES ('AUDI');
INSERT INTO car_make(brand) VALUES ('MERCEDES');

INSERT INTO car_model(name, engine, pk, make_id) VALUES ('A3','BIO', 140, 2);
INSERT INTO car_model(name, engine, pk, make_id) VALUES ('X2','HYBRID', 120, 1);
INSERT INTO car_model(name, engine, pk, make_id) VALUES ('318','DIESEL', 135, 3);

INSERT INTO car(license_plate, model_id) VALUES ('RLX-666',3);
INSERT INTO car(license_plate, model_id) VALUES ('PTY-999',2);
INSERT INTO car(license_plate, model_id) VALUES ('SLP-333',1);