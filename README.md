# Spring boot + ldap + apache DS
## Plantilla/Ejemplo de autenticacion ldap desde spring boot


plantilla/ejemplo base de autenticacion ldap.

- permite autenticar con la pagina de login que genera por defecto spring
- sirve para probar contra un server ldap apache directory 

*esto es un ejemplo propio para guiarme en futuros proyectos.

1. descargar el apache DS : https://directory.apache.org/studio/downloads.html
## crear un server
   - al iniciar el ApacheDS, ir a la vista de servers y agregar un server nuevo 
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/01.png?raw=true)
   - seleccionar el ApachaDS
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/02.png?raw=true)
   - luego clic derecho en Open Configuration
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/03.png?raw=true)
   - tomar nota del puerto que abrio del ldap Apache DS : 10389
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/04.png?raw=true)
   - clic derecha e iniciar el server 
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/05.png?raw=true)
   - agregar una nueva conexion, en la vista : Connections.
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/06.png?raw=true)
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/07.png?raw=true)
   - usuario y clave por defecto (https://directory.apache.org/apacheds/basic-ug/1.4.2-changing-admin-password.html)
     - uid=admin,ou=system
     - secret
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/08.png?raw=true)
   - deberia verse el arbol del directorio : 
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/09.png?raw=true)
## Agregar un usuario nuevo
   - clic derecho en la rama ou=users,ou=system
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/10.png?raw=true)
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/11.png?raw=true) 
   - seleccionar el objeto inetOrgPerson
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/12.png?raw=true) 
   - el cn sera el nombre de usuario, esto sera la base para cuando busquemos los usuarios en el directorio. 
     este *userDnPatterns* puede ser diferente dependiendo de cada organizacion.
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/13.png?raw=true) 
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/14.png?raw=true)
   *el sn, lo pide para completar el nombre, es el apellido del usuario*
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/15.png?raw=true)
## Agregar un grupo con un usuario.
   - clic derecho en la rama ou=groups,ou=system.
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/16.png?raw=true)
   - agregar un objeto de tipo groupOfUniqueName.
     Esto es unicamente para este ejercicio, puede diferir del ldap de otras organizaciones.
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/17.png?raw=true)
   - asignar un commun name (cn) al grupo
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/18.png?raw=true)
   - el apache directory exije incluir un primer usuario al grupo, en el parametro uniqueMember agregamos el usuario que creamos en el paso anterior.
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/19.png?raw=true)
   ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/20.png?raw=true)