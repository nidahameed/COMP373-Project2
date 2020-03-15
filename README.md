# COMP373-P1

Project 1 Submission by Molly Dunn and Nida Hameed

## To Run
To Run: add this project to your workspace in Eclipse. Then, run the Client.java file to run the project and see the output. 
   
To Run Tests: if you would like to specifically run the JUnit tests for this project, they can be found under Tests and model.testing. 

### Summary
We created a Facility in which there are units/apartments a person can rent out. We followed the specifications provided in class to create all of our methods. The project is divided up into proper packages for good practice and better code organization. We have packages for model.facility, model.maintenance, model.use, and also model.view in which our Client.java file is. The facility has apartments that a person can rent our for a specific lease with the ability of maintenance requests/orders.

### Testing
Testing: We used JUnit to create tests for our project. TestFacility.java includes all the tests for methods used in the model.facility package. TestMaintenace.java tests the methods found in the model.maintenance package. And, TestUse.java has tests for methods found in out model.use package. 


# Specifications
System Name: Facility Management System

System Description: Facilities are the building units (buildings and rooms inside) that a company
uses to support the activities of the business. This system will support the management of buildings,
their constant use, and maintenance support when it is needed. The following are the three main
functionalities of this system:
1. Facility and its description - this will cover the functionalities such as adding a new facility to
be managed; removing a facility from being managed; getting general information such as
the number and capacity of facilities and their current statuses.
2. Facility use – this covers the functionalities of managing the facility such as reserving a
facility; the cost of using and maintaining it; assigning and de-assigning a facility for use.
3. Facility maintenance – this functionality covers the maintenance of a facility such as
scheduling a facility for maintenance; checking maintenance status; listing maintenance
requests; calculating down time of a facility and many more functionalities.

