# Introduction

Dans le cadre de ce projet, nous avons développé une application 
Spring Boot pour gérer des produits. L'application utilise différentes
technologies telles que Spring Data JPA, Lombok, Spring Web, Spring Boot
Dev Tools, et une base de données H2.

# Développement de l'Application

### Création du Projet Spring Boot et Configuration des Dépendances
Nous avons créé un projet Spring Boot en utilisant Spring Initializr.
Les dépendances ajoutées au projet incluent Spring Data JPA, Lombok, 
Spring Web, Spring Boot Dev Tools et H2 Database.

### Création de l'Entité JPA Product
Nous avons créé l'entité JPA Product avec les champs suivants : 
id (de type Long), name (de type String), description (de type String), 
et price (de type double).

### Configuration du Data Source
La configuration du Data Source a été réalisée dans le fichier
application.properties pour utiliser la base de données H2.

### Création de l'Interface ProductRepository
Nous avons créé une interface ProductRepository basée sur Spring 
Data JPA pour gérer les opérations CRUD (Create, Read, Update, Delete)
sur l'entité Product.

### Tests de l'Application
Nous avons testé l'application en effectuant des opérations d'ajout,
de consultation, de mise à jour et de suppression des produits à l'aide 
des fonctionnalités fournies par Spring Data JPA et Spring Web.

# Conclusion
Ce projet nous a permis de développer une application Spring Boot pour la gestion 
de produits en utilisant différentes technologies telles que Spring Data JPA, Lombok, 
Spring Web, Spring Boot Dev Tools, et la base de données H2. 
Cette application peut être étendue pour inclure davantage de fonctionnalités 
et être déployée dans un environnement de production pour une utilisation réelle.
