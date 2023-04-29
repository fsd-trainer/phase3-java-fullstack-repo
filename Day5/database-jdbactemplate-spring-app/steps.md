1. You need a databbase (Mysql)
2. Create database
     create database studentmgmt
     
3. open database

      use studentmgmt
      
 4. Created table in the databse
 
 create table students(

    id int NOT NULL,
    name varchar(45) NULL,
    mobile BIGINT NULL,
    country varchar(45) NULL,
    PRIMARY KEY(id));
    
 5. Added one record in the table
   insert into students values(1, 'jack rojer', 1234567, 'UK');
   
   
 6. select * from students;
   
 
 