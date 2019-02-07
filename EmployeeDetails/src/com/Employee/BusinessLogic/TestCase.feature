#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Creating Employee
    Given id,name,address
    And some other precondition
    When createEmployee method is invoked
    And some other action
    And yet another action
    Then save method is invoked and the dtails are saved in map and employee is created successfully
   

  @tag2
  Scenario: the id of employee is null while creating the employee
    Given id of the employee is null
    When createEmployee method is invoked
    Then System should through an IdNullException
   
  @tag3
  Scenario: the name of employee is null while creating the employee
    Given name of the employee is null
    When createEmployee method is invoked
    Then System should through an NameNullException
    
  @tag4
  Scenario: If the employee is duplicate
    Given id of the new employee, id os excisting employee
    When createEmployee method is invoked
    Then System should through an IdAlreadyExistException
    
  @tag5
  Scenario:  While creating employee all field of address ae mandatory and object should not bu null
  	Given city entered is null
  	When  createEmployee method is invoked
  	Then  system should through an CanNotBeEmptyException
  	
  @tag6
  Scenario: searching the employee by name successfully
  Given name enter by user to search 
  When searchByName method is invoked
  Then System should return the detail of employee
  
  @tag7
  Scenario: the name user searching is not exist
  Given name enter by user
  When searchByName method is invoked
  Then System should through an NameDoesNotExistException
  
  @tag8
  Scenario: name entered is null
  Given name is entered by user is null
  When searchByName method is invoked
  Then System should through an NameNullException
  
  
