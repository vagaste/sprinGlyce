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

![CLASS DIAGRAM]()
