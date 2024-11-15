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
Feature: Registration in the website Juice Shop
  I want to Registration to juice shop

  @tag1
  Scenario Outline: Resgistration Successfullly to the website Juice Shop
    Given The Juice Shop URL
    And 	I clik on the Menu Account
    Then The login menu butten will be displayed1 
    And 	I clik on the Register Link
    Then The Register menu will be displayed 
    When I input <Email>,<Password>,<Password_repeat>, and <Question> in the fields
    And I click on the register button
    Then The login menu butten will be displayed2 
    

    Examples: 
      | Email  | Password | Password_repeat | Question | 
      | Dian5@gmail.com  | Puc6xyeJOtC8SghT7Dz9yA== | Puc6xyeJOtC8SghT7Dz9yA==  | Dilan1991 |
      
      
      