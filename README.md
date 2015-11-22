# Spring3MVCHibernateCRUD
a simple web based application with CRUD  operation using Spring3 MVC Framwork with Hibernate3 using Annotation, which can handle CRUD inside its controllers

create a schema with name: DAVDB 

    CREATE TABLE Employee(  
       EMPID   INT NOT NULL AUTO_INCREMENT,  
       EMPNAME VARCHAR(20) NOT NULL,  
       EMPAGE  INT NOT NULL,  
       SALARY BIGINT NOT NULL,  
       empADDRESS VARCHAR(20) NOT NULL,  
       PRIMARY KEY (EMPID)  
    );  
