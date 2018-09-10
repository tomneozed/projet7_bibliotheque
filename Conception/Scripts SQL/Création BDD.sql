

CREATE SEQUENCE public.utilisateur_id_seq;

CREATE TABLE public.Utilisateur (
                id INTEGER NOT NULL DEFAULT nextval('public.utilisateur_id_seq'),
                nom VARCHAR NOT NULL,
                prenom VARCHAR NOT NULL,
                pseudo VARCHAR NOT NULL,
                mot_de_passe VARCHAR NOT NULL,
                email VARCHAR NOT NULL,
                numero_telephone VARCHAR(10) NOT NULL,
                adresse VARCHAR NOT NULL,
                departement VARCHAR NOT NULL,
                ville VARCHAR NOT NULL,
                pays VARCHAR NOT NULL,
                CONSTRAINT utilisateur_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.utilisateur_id_seq OWNED BY public.Utilisateur.id;

CREATE SEQUENCE public.auteur_id_seq;

CREATE TABLE public.Auteur (
                id INTEGER NOT NULL DEFAULT nextval('public.auteur_id_seq'),
                nom VARCHAR NOT NULL,
                prenom VARCHAR NOT NULL,
                nationalite VARCHAR NOT NULL,
                date_naissance DATE,
                date_deces DATE,
                CONSTRAINT auteur_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.auteur_id_seq OWNED BY public.Auteur.id;

CREATE SEQUENCE public.ouvrage_id_seq;

CREATE TABLE public.Ouvrage (
                id INTEGER NOT NULL DEFAULT nextval('public.ouvrage_id_seq'),
                nombre_exemplaires_dispo INTEGER,
                titre VARCHAR(60) NOT NULL,
                editeur VARCHAR NOT NULL,
                nature VARCHAR NOT NULL,
                date_parution DATE NOT NULL,
                resume VARCHAR,
                nombre_pages INTEGER NOT NULL,
                prix DOUBLE PRECISION,
                nombre_exemplaires INTEGER,
                CONSTRAINT ouvrage_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.ouvrage_id_seq OWNED BY public.Ouvrage.id;

CREATE TABLE public.Auteur_Ouvrage (
                id_auteur INTEGER NOT NULL,
                id_ouvrage INTEGER NOT NULL,
                CONSTRAINT auteur_ouvrage_pk PRIMARY KEY (id_auteur, id_ouvrage)
);


CREATE SEQUENCE public.pret_id_seq;

CREATE TABLE public.Pret (
                id INTEGER NOT NULL DEFAULT nextval('public.pret_id_seq'),
                date_debut_pret DATE NOT NULL,
                date_fin_pret DATE NOT NULL,
                prolongation BOOLEAN NOT NULL,
                etat VARCHAR NOT NULL,
                id_utilisateur INTEGER NOT NULL,
                id_ouvrage INTEGER NOT NULL,
                CONSTRAINT pret_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.pret_id_seq OWNED BY public.Pret.id;

ALTER TABLE public.Pret ADD CONSTRAINT utilisateur_pret_fk
FOREIGN KEY (id_utilisateur)
REFERENCES public.Utilisateur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Auteur_Ouvrage ADD CONSTRAINT auteur_auteur_ouvrage_fk
FOREIGN KEY (id_auteur)
REFERENCES public.Auteur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Pret ADD CONSTRAINT ouvrage_pret_fk
FOREIGN KEY (id_ouvrage)
REFERENCES public.Ouvrage (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Auteur_Ouvrage ADD CONSTRAINT ouvrage_auteur_ouvrage_fk
FOREIGN KEY (id_ouvrage)
REFERENCES public.Ouvrage (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;