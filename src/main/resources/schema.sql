DROP TABLE IF EXISTS alcoholfree;
DROP TABLE IF EXISTS alcohol;
DROP TABLE IF EXISTS foods;
DROP TABLE IF EXISTS coctails;
DROP TABLE IF EXISTS marinades;

CREATE TABLE alcoholfree (
                         id_alcoholfree int NOT NULL AUTO_INCREMENT,
                         alcoholfree_name varchar(30) NOT NULL,
                         alcoholfree_unit double NOT NULL,
                         alcoholfree_description text (200) NOT NULL,
                     PRIMARY KEY (id_alcoholfree)
);
CREATE TABLE alcohol(
                        id_alcohol int NOT NULL AUTO_INCREMENT,
                        alcohol_name varchar(30) NOT NULL,
                        alcohol_unit double NOT NULL,
                        alcohol_description text (200) NOT NULL,
                        PRIMARY KEY (id_alcohol)
);

CREATE TABLE foods (
                       id_food int NOT NULL AUTO_INCREMENT,
                       food_name varchar(100) NOT NULL,
                       food_unit double NOT NULL,
                       food_description text (2000)  NOT NULL,
                       PRIMARY KEY (id_food)
);

CREATE TABLE coctails
(
    id_coctail         int         NOT NULL AUTO_INCREMENT,
    coctail_name        varchar(30) NOT NULL,
    id_alcohol int NOT NULL,
    id_alcoholfree int NOT NULL,
    coctail_description text   (2000)     NOT NULL,

    PRIMARY KEY (id_coctail),
    FOREIGN KEY ( id_alcohol) REFERENCES alcohol(id_alcohol),
    FOREIGN KEY ( id_alcoholfree) REFERENCES alcoholfree(id_alcoholfree)
);

CREATE TABLE marinades (
                           id_marinades int NOT NULL AUTO_INCREMENT,
                           marinades_name varchar(30) NOT NULL,
                           id_food int NOT NULL ,
                           marinades_descriprion text (2000)  NOT NULL,
                           PRIMARY KEY (id_marinades),
                           FOREIGN KEY (id_food) REFERENCES foods(id_food)
);


