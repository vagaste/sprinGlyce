# DEVELOPPERS GUIDE(English)
  __________________________
  
  
### How to maintain code of Backend JAVA

#### 1. Application : SpringGlyce source code available on https://github.com/vagaste/sprinGlyce

This project have been made on eclipse with Spring boot Starter project.    

JAVA version 8.

*Selected Dependencies :*  
Web, JPA, H2 Database.    


#### 2. About Database

Database creation automatic with JPA/HIBERNATE    
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true

DataSource URL :    
jdbc:h2:mem:DB_GLYCELIFE;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE

*Database Type for developpements :*    
H2    

*UserName and Password for devs :*    
'sa' and ''    

*Creation mode :*     
create-drop    

*Initialization-mode :*   
always    

At start the database will be created and filled by datas contained in data.sql file stored in folder src/main/recources/    

In execution, Access to Database on URL http://localhost:8090/H2-console    


#### 3. Application properties

The Server port is declared on LocalHost:8090

### How to maintain code of Frontend

#### 1. Application : angGlyce source code available on https://github.com/vagaste/angGlyce

Frontend application generated with Angular CLI version 6.0.7 Project made on Microsoft VSCode.

#### 2. Dependencies 

Initialisation with Angular Material.
Use command line at start of folder project and type 'npm install'


Addons : HammerJs.

Run on dev use command 'ng serve'    

===========================================================================

# GUIDE DE DEVELOPPEMENT(Français)
  ________________________________

### Comment gérer le code de l'application JAVA

#### 1. Application: code source SpringGlyce disponible sur https://github.com/vagaste/sprinGlyce

Ce projet a été réalisé sur eclipse avec Spring Boot Starter Project.    

La version de JAVA 8 a été utilisée pour ce projet.    

Dépendances sélectionnées: Web, JPA, H2 Database.


#### 2. À propos de la base

*Création automatique de la base de données avec JPA / HIBERNATE :*    
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation = true

*URL DataSource:*    
jdbc: h2: mem: DB_GLYCELIFE; DB_CLOSE_DELAY = -1; DB_CLOSE_ON_EXIT = FALSE

*Type de base de données pour developpements :*    
H2

*Nom d'utilisateur et mot de passe pour les devs :*       
'sa' et ''

*Mode création :*    
créer-déposer

*Initialisation-mode :*    
Always

Au début, la base de données sera créée et remplie par les données contenues dans le fichier data.sql stocké dans le dossier src / main / recources /

En cours d'exécution, Accès à la base de données sur l'URL http://localhost:8090/H2-console

#### 3. Propriétés de l'application

Le port du serveur est déclaré sur localhost:8090

### Comment gérer le code Angular Frontend

#### 1. Application: Code source angGlyce disponible sur https://github.com/vagaste/angGlyce

Application Frontend générée avec Angular CLI version 6.0.7 Projet réalisé sur Microsoft VSCode.

#### 2. Dépendances

Initialisation avec Angular Material. 

Utilisez cmd pour intitialiser le projet à la racine du dossier et tapez 'npm install'

Addons: HammerJs.

Exécuter la commande 'ng serve'

visualiser sur l'URL : http://localhost:4200

