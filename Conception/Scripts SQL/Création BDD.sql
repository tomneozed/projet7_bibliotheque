
CREATE SEQUENCE utilisateur_id_seq;

CREATE TABLE Utilisateur (
                id INTEGER NOT NULL DEFAULT nextval('utilisateur_id_seq'),
                nom VARCHAR NOT NULL,
                prenom VARCHAR NOT NULL,
                pseudo VARCHAR NOT NULL,
                mot_de_passe VARCHAR NOT NULL,
                email VARCHAR NOT NULL,
                numero_telephone INTEGER NOT NULL,
                adresse VARCHAR NOT NULL,
                departement VARCHAR NOT NULL,
                ville VARCHAR NOT NULL,
                pays VARCHAR NOT NULL,
                CONSTRAINT utilisateur_pk PRIMARY KEY (id)
);


ALTER SEQUENCE utilisateur_id_seq OWNED BY Utilisateur.id;

CREATE SEQUENCE bibiotheque_id_seq;

CREATE TABLE Bibiotheque (
                id INTEGER NOT NULL DEFAULT nextval('bibiotheque_id_seq'),
                nom VARCHAR NOT NULL,
                adresse VARCHAR NOT NULL,
                ville VARCHAR NOT NULL,
                departement VARCHAR NOT NULL,
                horaires VARCHAR NOT NULL,
                email VARCHAR NOT NULL,
                numero_telephone INTEGER NOT NULL,
                CONSTRAINT bibiotheque_pk PRIMARY KEY (id)
);


ALTER SEQUENCE bibiotheque_id_seq OWNED BY Bibiotheque.id;

CREATE SEQUENCE auteur_id_seq;

CREATE TABLE Auteur (
                id INTEGER NOT NULL DEFAULT nextval('auteur_id_seq'),
                nom VARCHAR NOT NULL,
                prenom VARCHAR NOT NULL,
                nationalite VARCHAR NOT NULL,
                date_naissance DATE,
                date_deces DATE,
                CONSTRAINT auteur_pk PRIMARY KEY (id)
);


ALTER SEQUENCE auteur_id_seq OWNED BY Auteur.id;

CREATE SEQUENCE ouvrage_id_seq;

CREATE TABLE Ouvrage (
                id INTEGER NOT NULL DEFAULT nextval('ouvrage_id_seq'),
                titre VARCHAR(40) NOT NULL,
                editeur VARCHAR NOT NULL,
                nature VARCHAR NOT NULL,
                date_parution DATE NOT NULL,
                resume VARCHAR,
                nombre_pages INTEGER NOT NULL,
                prix DOUBLE PRECISION,
                CONSTRAINT ouvrage_pk PRIMARY KEY (id)
);


ALTER SEQUENCE ouvrage_id_seq OWNED BY Ouvrage.id;

CREATE TABLE Auteur_Ouvrage (
                id_auteur INTEGER NOT NULL,
                id_ouvrage INTEGER NOT NULL,
                CONSTRAINT auteur_ouvrage_pk PRIMARY KEY (id_auteur, id_ouvrage)
);


CREATE TABLE Ouvrage_Bibliotheque (
                id_ouvrage INTEGER NOT NULL,
                id_bibliotheque INTEGER NOT NULL,
                nombre_exemplaire INTEGER NOT NULL,
                CONSTRAINT ouvrage_bibliotheque_pk PRIMARY KEY (id_ouvrage, id_bibliotheque)
);


CREATE TABLE Pret (
                id INTEGER NOT NULL,
                date_debut_pret DATE NOT NULL,
                date_fin_pret DATE NOT NULL,
                prolongation BOOLEAN NOT NULL,
                etat VARCHAR NOT NULL,
                id_utilisateur INTEGER NOT NULL,
                id_bibliotheque INTEGER NOT NULL,
                id_ouvrage INTEGER NOT NULL,
                CONSTRAINT pret_pk PRIMARY KEY (id)
);


ALTER TABLE Pret ADD CONSTRAINT utilisateur_pret_fk
FOREIGN KEY (id_utilisateur)
REFERENCES Utilisateur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE Pret ADD CONSTRAINT bibiotheque_pret_fk
FOREIGN KEY (id_bibliotheque)
REFERENCES Bibiotheque (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE Ouvrage_Bibliotheque ADD CONSTRAINT bibiotheque_ouvrage_bibliotheque_fk
FOREIGN KEY (id_bibliotheque)
REFERENCES Bibiotheque (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE Auteur_Ouvrage ADD CONSTRAINT auteur_auteur_ouvrage_fk
FOREIGN KEY (id_auteur)
REFERENCES Auteur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE Pret ADD CONSTRAINT ouvrage_pret_fk
FOREIGN KEY (id_ouvrage)
REFERENCES Ouvrage (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE Ouvrage_Bibliotheque ADD CONSTRAINT ouvrage_ouvrage_bibliotheque_fk
FOREIGN KEY (id_ouvrage)
REFERENCES Ouvrage (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE Auteur_Ouvrage ADD CONSTRAINT ouvrage_auteur_ouvrage_fk
FOREIGN KEY (id_ouvrage)
REFERENCES Ouvrage (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;