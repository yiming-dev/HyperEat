HyperEat

Description：
Simple model of a distributed food ordering system design for restaurant and users。The application is used by 
Client and administrators both these two roles have the same function like login in and log out the system so the project is designed in the following parts:
Account Service：login logout for user and administrators
Menu Service：add delete update and search menus.
Order Service：add delete update and search order. 
User Service：add delete update and search user. 
These four services only provide data and access to the database.
To use these data on different occasions we need a consumer service to call the service API and generate pages. Feign used to call APIs from services and also implement load balance.
Overall the system is designed as one consumer and four providers and all services should be registered in Eureka.

Tech-stack:
IDEA + JDK1.8 + SpringCloud + Eureka + Maven + Mybatis + Mysql + Thymeleaf

Keypoint:
.Use spring cloud config server API to make configuration files and service apart for easy maintaining.
.Use Eureka as register center.
.Use Spring Feign to call service APIs from other services and implement load balance.
.Use Thymeleaf to generate dynamic HTML pages.
.Use Mybatis to get access to the database.
