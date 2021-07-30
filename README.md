# Jade-SampleManagementServices
Maven - Dependency Management

JDK - Java™ Platform, Standard Edition Development Kit

Spring Boot - Framework to ease the bootstrapping and development of new Spring Applications

OracleDB - OracleDB is a document database with the scalability and flexibility that you want with the querying and indexing that you need       

Lombok - Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.

External Tools Used
Postman - API Development Environment (Testing Docmentation)

Requirements
For building and running the application you need:

JDK 11

Maven 4

Oracle Tables Information
idt_surveys---All the survey information 
msp_sample_jobs-- SampleJob Data information
idt_status_codes-- status codes which are assing to each sample job.


Docker

Docker-compose

Running the application locally
There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the com.raghu.fta.FeatureToggleApplication class from your IDE.

Download the zip or clone the Git repository.

Unzip the zip file (if you downloaded one)

Open Command Prompt and Change directory (cd) to folder containing pom.xml (root)

Run the below commands

mvn clean install

mvn spring-boot:run

The application uses the port: 8082
