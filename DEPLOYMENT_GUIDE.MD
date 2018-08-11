# DEPLOYMENT GUIDE - GLYCE & LIFE(English)

### *1. How to deploy the application GLYCE & LIFE*    

You can launch the application by running the executable JAR file from the command line.

##### *1. download.*    
the latest [release](https://github.com/vagaste/sprinGlyce/releases/tag/v2.0) of the executable JAR file (springGlyce-0.0.1-SNAPSHOT.jar) from GITHUB

##### *2. from the command line*    
in the local downloaded folder of the executable JAR file, type :    
**java -Dfile.encoding=UTF-8 -jar springGlyce-0.0.1-SNAPSHOT.jar**    
(the command dfile.encoding allows to keep special characters of the file used by the database H2).

##### *3. In the web browser*    
type : http://localhost:8090    

### *2. How to refresh the executable jar file*

If modifications are made on the code of the front end AngGlyce and back end SprinGlyce, the executable jar file must be made again.

##### *1. To integrate the front part with the back.*

The front is developped with angular 6.    
To integrate it with the back end, type in the command line on the folder project AngGlyce :

**NG BUILD --PROD**

A folder « dist » is created.
Copy contents of the folder « anglyce » that is inside the folder « dist »,
 and paste it in a new folder « src/main/recources/static » in the project SprinGlyce.

Make an update maven project of the project SprinGlyce in eclipse.

##### *2. To create a new executable jar file.*

On the pom.xml of SprinGlyce:

- « run as clean » to delete the existing executable jar    
- « run as install » to create a new executable jar (snapshot.jar) in the folder target.    

##### *3. To create a new release in GitHub.*

Zip the snapshot.jar to make a new release in gitHub.
In GitHub, draft a new release : https://github.com/vagaste/sprinGlyce/releases

Follows the instructions, select the zipped snapshot.jar file and publish release.

### *3. About Database*

The database (H2) contains 4 tables:    

- the table « aliment »:    
contains the aliments, number of calories, the categorie of the aliment (foreign key on category’s table), etc.    
This table is automatically filled at lauching of the application with the file « data.sql ».

- the table « category »:    
repository of the aliment’s category (identifier and name).    
This table is automatically filled at lauching of the application with the file « data.sql ».

- the table « portions »:    
contains the portions needed to constitute a recipe with the quantity of aliment, a foreign key on the aliment used et a foreign key on the recipe which contains the portion.    
This table is updated whith the application GLYCE & LIFE.

- the table « recette » (recipe):    
contains the name of the recipe and the overall value of glycemic load and nutritional values.    
This table is updated whith the application GLYCE & LIFE.

![CLASS DIAGRAM](/guide_src/diagram.JPG)

==============================================================

# GUIDE DE DEPLOIEMENT - GLYCE & LIFE(Francais)

### *1. Comment déployer l'application GLYCE & LIFE*    

Vous pouvez lancer l'application avec le fichier executable JAR à partir de l'invite de commande.

##### *1. Télécharger.*    
la dernière version du fichier exécutable [release](https://github.com/vagaste/sprinGlyce/releases/tag/v2.0) (springGlyce-0.0.1-SNAPSHOT.jar) à partir de GITHUB

##### *2. dans l'invite de commande*    
sous le répertoire du fichier fat jar, tapez :    
**java -Dfile.encoding=UTF-8 -jar springGlyce-0.0.1-SNAPSHOT.jar**    
(la commande dfile.encoding permet de garder les caractères spéciaux du fichier utilisé pour charger la base H2).

##### *3. dans le navigateur*    
tapez : http://localhost:8090

### *2. Comment mettre à jour le fichier fat jar*

Si des modifications sont faites dans le code du front end AngGlyce et back end SprinGlyce, le fichier fat jar doit être regénéré.

##### *1. Pour intégrer la partie front au back.*

Le front est développé avec angular 6.    
Pour l'ingégrer au back end, tapez dans la ligne de commande du répertoire du projet AngGlyce :

**NG BUILD --PROD**

Un répertoire « dist » est créé, avec un sous-répertoire anglyce.    
Copiez le contenu du répertoire « anglyce » et collez-le dans un répertoire « static » qu'il faut créer dans le projet SprinGlyce.

Faire un "update maven project" du projet SprinGlyce dans eclipse.

##### *2. Pour générer un nouveau fat jar.*

Sur le pom.xml de SprinGlyce :

- « run as clean » pour supprimer le fat jar existant,
- « run as install » pour créer un nouvel exécutable jar (snapshot.jar) dans le répertoire target.
  
##### *3. Pour créér une nouvelle version "release" dans GitHub.*

Zippez le fichier snapshot.jar pour créer un nouveau release sous gitHub.
Dans GitHub, "draft a new release" :    
https://github.com/vagaste/sprinGlyce/releases
Alimentez les champs selon les instructions, sélectionnez le fichier snapshot.jar zippé et cliquez sur "publish release".


### *3. Base de données*

La base H2 est composée de 4 tables :   

- la table « aliment » :    
contient les aliments, le nombre de calories, la catégorie de l'aliment    
(clé étrangère sur l'identifiant de la table catégorie), etc.    
Cette table est mise à jour automatiquement lors du lancement de l'application avec le fichier « data.sql ».

- la table « category » :    
référentiel de la catégorie de l'aliment (identifiant et nom).    
Cette table est mise à jour automatiquement lors du lancement de l'application avec le fichier « data.sql ».

- la table « portions » :    
contient les portions nécessaire à la constitution d'une recette avec la quantité de l'aliment, une clé étrangère sur l'identifiant de l'aliment utilisé et une clé étrangère sur l'identifiant de la recette dont la portion fait partie. Cette table est mise à jour avec l'application GLYCE & LIFE.

- la table « recette » :    
contient le nom de la recette et les valeurs globales de la charge glycémique et des valeurs nutritionnelles. Cette table est mise à jour avec l'application GLYCE & LIFE.

![CLASS DIAGRAM](/guide_src/diagram.JPG)
