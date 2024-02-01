Back end Development Process:

1- Set up the database tables
2- Create a Spring Boot starter project (start.spring.io)
    spring-boot-starter-data-jpa
    spring-boot-starter-data-rest
    mysqlo-connector-java
    lombok
3- Develop the Entity: Book
4- Create REST API's with Sring DATA JPA Repositories and Spring Data REST.

=======================================================================================================================================
1- Set up the Database.
=======================================================================================================================================
*******************************************************************************
En caso de tener que instalar en LinuxMint la Base de datos seguir este video:
https://www.youtube.com/watch?v=pxwH7kvNSWo
*******************************************************************************

PC OMSED -
    user -root
    pass -792919

=======================================================================================================================================
2- Create a Spring Boot starter project (start.spring.io)
=======================================================================================================================================

HEADS UP: Modify app to use Spring Boot 2.x
This course is based on Spring Boot 2.x. However, with recent releases of Spring Boot 3.2, the Spring Initializr website also removed options for selecting Spring Boot 2.x. This is due to their End of open source support for Spring Boot 2.x

To continue with this course using Spring Boot 2.x, then you need to apply the following workaround.

1. Generate an app using the Spring Boot 3.2.x version listed on the website. Download the app and unzip it.

2. Edit the pom.xml file, make the following updates:

Replace: <version>3.2.0</version>

With: <version>2.7.18</version>

3. In IntelliJ, in the left-hand panel, right-click your pom.xml and select Maven > Reload Project
