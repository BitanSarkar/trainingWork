@Login @Sanity
Feature: testing for login feature

  Scenario Outline: 
    Given application is running
     When user enters valid email id as "<email>"
      And password as "<password>"
     Then take user to home page

    Examples: 
      | email           | password |
      | hello@gmail.com | hello123 |
      | bita@gmail.com  | bitan25  |
      | admin@gmail.com | admin115 |
