#MyTab



Description [still under construction]:



MyTab is a backend service developed using Java and Spring Boot, designed to manage tabs for a bar or restaurant. The application exposes RESTful APIs that allow front-end applications or third-party services to interact with it.



This project makes use of the following technologies:



*Spring Boot*: Used for creating the RESTful APIs and handling the business logic of the application. Spring Boot's embedded Tomcat server allows this application to be a standalone service.



*Spring Data JPA*: Utilized to simplify the data access layer. It provides helpful methods out of the box to interact with our PostgreSQL database.



*PostgreSQL*: An advanced open-source relational database. The project uses PostgreSQL for data persistence, ensuring that the state of the application is saved even after a system restart.



The application allows users to create new tabs, add orders to an existing tab, view all tabs, and close a tab (i.e., pay the bill). Each tab holds information about the customer and the orders associated with that tab. The orders contain details about the ordered items, such as the item name, quantity, and price.


