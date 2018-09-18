INSERT INTO public.utilisateur
	(id, prenom, nom, email, pseudo, mot_de_passe, numero_telephone, adresse, departement, ville, pays)
VALUES
	(1, 'Alain', 'Terrieur', 'alainTerrieur@email.com', 'alainTerrieur', 'motDePasse', '0606060606', '43 rue des fleurs', 'Haute Garonne', 'Toulouse', 'France'),
	(2, 'Alex', 'Terrieur', 'alexTerrieur@email.com', 'alexTerrieur', 'motDePasse', '0707070707', '28 avenue du Chene', 'Haute Garonne', 'Toulouse', 'France'),
	(3, 'Georges', 'Washington', 'georgesWashington@email.com','alainTerrieur', 'motDePasse', '0808080808', '56 route  des glands', 'Haute Garonne', 'Toulouse', 'France'),
	(4, 'Marie', 'Curry', 'marieCurry@email.com', 'alainTerrieur', 'motDePasse','0635412547', '2 impasse Olignon', 'Haute Garonne', 'Toulouse', 'France'),
	(5, 'Josephine', 'Langegardien', 'josephineLangegardien@email.com', 'alainTerrieur', 'motDePasse', '0658974563', '17 avenue du midi' , 'Haute Garonne', 'Toulouse', 'France'),
	(6, 'Marilyn', 'Monroe', 'marilynMonroe@email.com', 'alainTerrieur', 'motDePasse', '0632569874', '96 rue Avignon', 'Haute Garonne', 'Toulouse', 'France'),
	(7, 'Gaston', 'Lagaffe', 'gastonLagaffe@email.com', 'alainTerrieur', 'motDePasse', '0632541225', '45 avenue de la liberté', 'Haute Garonne', 'Toulouse', 'France'),
	(8, 'Shtroumpf', 'Farceur', 'shtroumpfFarceur@email.com', 'alainTerrieur', 'motDePasse', '0600541235', '34 impasse de la fortune', 'Haute Garonne', 'Toulouse', 'France'),
	(9, 'Gunter', 'Pauli', 'gunterPauli@email.com', 'alainTerrieur', 'motDePasse', '0699875498', '85 avenue Charles de Gaulle', 'Haute Garonne', 'Toulouse', 'France'),
	(10, 'Madame', 'Columbo', 'madameColumbo@email.com', 'alainTerrieur', 'motDePasse', '0656323256', '74 rue des plantes', 'Haute Garonne', 'Toulouse', 'France')
;

INSERT INTO public.ouvrage
	(id, titre, editeur, nature, date_parution, resume, nombre_pages, prix, nombre_exemplaires, nombre_exemplaires_dispo)
VALUES
	(1, 'Les fleurs du mal', 'petits classiques', 'poesie', '01/01/1857', 'resume',  126,  9.95, 20, 20, 18),
	(2, 'Le spleen de Paris', 'De Vecchi', 'poesie', '01/01/2018', 'resume', 200,  9.95, 20, 19),
	(3, 'Le Seigneur des Anneaux, La communauté de l''Anneau', 'Hachette', 'roman', '01/01/1995', 'resume', 1278,  19.95, 20, 19),
	(4, 'Le Seigneur des Anneaux, Les deux Tours', 'Hachette', 'roman', '01/01/1995', 'resume', 1278,  19.95, 15, 13),
	(5, 'Le Seigneur des Anneaux, Le retour du Roi', 'Hachette', 'roman', '01/01/1995', 'resume', 1278,  19.95, 10, 9),
	(6, 'Bilbo le Hobbit', 'Hachette', 'roman', '01/01/1980', 'resume', 323,  14.95, 10, 9),
	(7, 'Harry Potter à l''Ecole des Sorciers', 'Gallimard', 'roman', '01/01/2002', 'resume', 304,  9.95, 10, 9),
	(8, 'Harry Potter et la Chambre des Secrets', 'Gallimard', 'roman', '01/01/2002', 'resume', 361,  9.95, 15, 14),
	(9, 'Harry Potter et le prisionier d''Azkaban', 'Gallimard', 'roman', '01/01/1999', 'resume', 349,  9.95, 10, 9),
	(10, 'Harry Potter et la coupe de feu', 'Gallimard', 'roman', '01/01/2002', 'resume',  651,  9.95, 10, 9)
;

INSERT INTO public.auteur
	(id, nom, prenom, nationalite, date_naissance, date_deces)
VALUES
	(1, 'Baudelaire', 'Charles-Pierre', 'francais', '09/04/1821', '31/08/1867'),
	(2, 'Tolkien', 'John Ronald Reuel', 'anglais', '03/01/1892', '02/09/1973'),
	(3, 'Rowling', 'Joanne K', 'anglais', '31/07/1965', null)
;

INSERT INTO public.auteur_ouvrage
	(id_auteur, id_ouvrage)
VALUES
	(1, 1),
	(1, 2),
	(2, 3),
	(2, 4),
	(2, 5),
	(2, 6),
	(3, 7),
	(3, 8),
	(3, 9),
	(3, 10)
;


INSERT INTO public.pret
	(id_utilisateur, id_ouvrage, date_debut_pret, date_fin_pret, prolongation, etat)
VALUES
	(1, 1, '20/08/2018', '03/09/2018', false, 'en cours'),
	(1, 5, '20/08/2018', '17/09/2018', true, 'en cours'),
	(2, 2, '06/08/2018', '20/08/2018', false, 'termine'),
	(3, 4, '08/08/2018', '22/08/2018', false, 'termine'),
	(4, 6, '08/08/2018', '22/08/2018', false, 'non rendu'),
	(5, 9, '12/08/2018', '28/08/2018', false, 'en cours'),
	(6, 3, '08/08/2018', '22/08/2018', false, 'termine'),
	(7, 7, '08/08/2018', '22/08/2018', false, 'termine'),
	(8, 10, '08/08/2018', '22/08/2018', false, 'termine'),
	(9, 1, '08/08/2018', '22/08/2018', false, 'termine'),
	(9, 4, '08/08/2018', '22/08/2018', false, 'termine'),
	(10, 8, '08/08/2018', '22/08/2018', false, 'termine')
;
	
	




