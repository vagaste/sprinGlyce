# DEVELOPPERS GUIDE
  _________________
  

  
### How to maintain code of Backend

#### 1. Application : SpringGlyce source code available on https://github.com/vagaste/sprinGlyce

This project have been made on eclipse with Spring boot Starter project.

Selected Dependencies :
Web, JPA, H2 Database.


#### 2. About Database

Database creation automatic with JPA/HIBERNATE
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true

DataSource URL :
jdbc:h2:mem:DB_GLYCELIFE;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE

Database Type for developpements :
h2.Driver

UserName and Password for devs :
'sa' and ''

Creation mode : 
create-drop

Initialization-mode
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



