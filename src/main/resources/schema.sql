DROP TABLE IF EXISTS alcohol;
DROP TABLE IF EXISTS alcoholfree;
DROP TABLE IF EXISTS cakes;
DROP TABLE IF EXISTS grill;
DROP TABLE IF EXISTS coctails;
DROP TABLE IF EXISTS marinades;
DROP TABLE IF EXISTS snacks;
CREATE TABLE alcohol (
                         id_alcohol int NOT NULL AUTO_INCREMENT,
                         alcohol_name varchar(30) NOT NULL,
                         alcohol_unit double NOT NULL,
                         alcohol_description text NOT NULL,
                     PRIMARY KEY (id_alcohol)
);

CREATE TABLE alcoholfree (
                             id_alcoholfree int NOT NULL AUTO_INCREMENT,
                             alcoholfree_name varchar(30) NOT NULL,
                             alcoholfree_unit double NOT NULL,
                             alcoholfree_description text NOT NULL,
                             PRIMARY KEY (id_alcoholfree)
);

CREATE TABLE cakes (
                       id_cakes int NOT NULL AUTO_INCREMENT,
                       cakes_name varchar(30) NOT NULL,
                       cakes_unit double NOT NULL,
                       cakes_description text NOT NULL,
                       PRIMARY KEY (id_cakes)
);

CREATE TABLE grill (
                       id_grill int NOT NULL AUTO_INCREMENT,
                       grill_name varchar(20) NOT NULL,
                       grill_unit double NOT NULL,
                       grill_description text NOT NULL,
                       PRIMARY KEY (id_grill)
);

CREATE TABLE coctails
(
    id_coctails          int         NOT NULL AUTO_INCREMENT,
    coctail_name        varchar(30) NOT NULL,
    coctail_description text        NOT NULL,
    PRIMARY KEY (id_coctails),
    FOREIGN KEY ( id_alcohol) REFERENCES alcohol(id_alcohol),
    FOREIGN KEY ( id_alcoholfree) REFERENCES alcoholfree(id_alcoholfree)
);

CREATE TABLE marinades (
                           id_marinades int NOT NULL AUTO_INCREMENT,
                           marinades_name varchar(30) NOT NULL,
                           marinades_descriprion text NOT NULL,
                           PRIMARY KEY (id_marinades),
                           FOREIGN KEY (marinades_idgrill) REFERENCES grill(id_grill)
);

CREATE TABLE snacks (
                        id_snacks int NOT NULL AUTO_INCREMENT,
                        snacks_name varchar(30) NOT NULL,
                        snacks_unit double NOT NULL,
                        snacks_description text NOT NULL,
                        PRIMARY KEY (id_snacks)
);

