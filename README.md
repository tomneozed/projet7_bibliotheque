# Projet7_Bibliothèque

Projet 7 du parcours OpenClassrooms "Développeur Java EE" : Développer le nouveau système d'information de la bibliothèque d'une grande ville 

## Contenu 

Le dossier **Conception** comprend 3 sous dossiers :

* Dossier ***Diagrammes*** qui contient les différents diagrammes (UML) :
	* Le *diagramme de package*, qui décrit le découpage de l'application
	* Le *diagramme de cas d'utilisation des clients* qui liste les fonctionnalités pouvant être opérées par les clients
	* Le *diagramme de cas d'utilisation du web service* qui liste les différentes opérations réalisables
	* Le *diagramme de classes* qui répertorie les différentes classes de l'application

*(Le fichier .mdj contient les diagrammes cités ci-dessus et à été créé via StarUML)*

* Dossier ***Modèle Physique de Données*** qui contient le MPD sous format .architect [SQL Power Architect] et .png

* Dossier ***Scripts SQL*** qui contient les scripts sql de création de la base de données sous PostgreSQL

Pour déployer l'application : 

- Déployer le bibliothek.war contenu dans Application/WebService/target sur tomcat

- Déployer la bibliothekWebapp.war contenu dans Application/WebApp/target sur tomcat

- Lancer l'exécutable batch contenu dans Application/batch

