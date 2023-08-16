
# Customer Registration

this is  a simple customer registartion web app , that allows to add , delete and edit customers records

## Installation

1. clone this repo

```bash
  git clone git@github.com:TyronRusty/CustomerRegistration.git
  
```
2. downoald MySql workbench by following these steps :
the username and password of Mysql should be root.
https://www.simplilearn.com/tutorials/mysql-tutorial/mysql-workbench-installation 
```bash
  user : root
  password:root
  
```
3. download intellij : 

https://www.jetbrains.com/idea/download/?section=windows


## Tech Stack

**Front-End:** HTML, Thymleaf, Bootstrap

**Back-End:** Spring, java,




## Deployment

- To deploy this project run the maven project on intellij
- the projet will be runing on : http://localhost:8080/customers
-  MySQL has to be running for the web app to work
  
## Notes for mac users :
follow this link to download MySQL server and workbench , the process is different from windows 
link : https://www.youtube.com/watch?v=DVVVSlGDpuw
- While installing MySQL you will prompted to inter a password.(save the passord for later)
- open the project on IntelliJ and go under src/main/resource/application.properties and change the "spring.datasource.password" to be the password from the above step
- this is what the project will display before the password change "spring.datasource.password=root" just replace "root" by your password.

## Screenshots

 ### Customers List
 
<img width="928" alt="CUSTOMERS" src="https://github.com/TyronRusty/CustomerRegistration/assets/118769952/e850385d-94e9-48e3-8a11-3b779ed64ef4">


### Add Customer

<img width="880" alt="addcustomer" src="https://github.com/TyronRusty/CustomerRegistration/assets/118769952/483d2ee9-f4f1-4f1b-8513-404d3e0a275b">



## Video demo


https://github.com/TyronRusty/CustomerRegistration/assets/118769952/fd0b1980-266e-4b00-b722-ee238f1a9baa


