# this is blah blah
# Author : Bitan Sarkar
@Registration @Sanity
Feature: registering user to the application - StackTooFlow

	@BitanRegister
  Scenario: 
    Given the application is loaded on the site stacktooflow.come
     When the user clicks on the RegButton
      And enter user name as "Bitan"
      And enter password as "secret123"
     Then validate the format
      And submit it to server

  Scenario: 
    Given the application is loaded on the site stacktooflow.come
     When the user clicks on the RegButton
      And enter user name as "Baba"
      And enter password as "secret457"
     Then validate the format
      And submit it to server

  Scenario: 
    Given the application is loaded on the site stacktooflow.come
     When the user clicks on the RegButton
      And enter user name as "Maa"
      And enter password as "hehehe321"
     Then validate the format
      And submit it to server
