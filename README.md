# dms

_backend part_

Technologies: Java, Spring Boot, PostgreSQL

linked repository - _frontend part_: [https://github.com/Mad-Deuce/dms-uz-angular](https://)
Frontend Technologies: TypeScript, Angular

### Description

Automated system for metering devices in railway transport.

The project is built using Java, Spring Boot for the backend, and PostgreSQL for data storage, TypeScript, Angular for the frontend,
### Technology Stack

#### Backend

Spring Boot: open source, microservice-based Java web framework.
Spring Security: owerful and highly customizable authentication and access-control framework. It is the de-facto standard for securing Spring-based applications.

PostgreSQL: object-relational database management system (ORDBMS) based on [POSTGRES, Version 4.2]
#### Frontend

Angular: web framework that empowers developers to build fast, reliable applications.
PrimeNG: rich set of open source UI Components for Angular.
CSS: For styling the components and interface.
RxJS: Reactive Extensions Library for JavaScript
### Implemented functionality

User Login: Authentication using JWT tokens.
Navigate objects using a drop-down tree.
Add (remove) selected objects to favorites for quick access to them.
Storage favorites object in LocalStorage.
View devices by objects (pagination, filter, sort, customizable columns)
Import DB backup files. 
### Installation and running

1. Clone the Repository:

   `https://github.com/Mad-Deuce/dms-be.git`
   `cd dms-be/prod.env`
   `vagrant up`
2. Access the Application:
   [http://192.168.50.50:8080](https://)
   login:   admin
   password: user

### Requirements

```
      Installed Oracle VirtualBox.
      Installed Vagrant
```
