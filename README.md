plantilla/ejemplo base de autenticacion ldap.

- permite autenticar con la pagina de login que genera por defecto spring
- sirve para probar contra un server ldap apache directory 

*esto es un ejemplo propio para guiarme en futuros proyectos.

1. descargar el apache DS : https://directory.apache.org/studio/downloads.html
2. crear un server
   - al iniciar el ApacheDS, ir a la vista de servers   
   - ![alt text](https://github.com/aceherdz/spring-ldap-apacheDS/blob/main/readmeimg/01.png?raw=true)


   * clave : https://directory.apache.org/apacheds/basic-ug/1.4.2-changing-admin-password.html
     - uid=admin,ou=system
     - secret