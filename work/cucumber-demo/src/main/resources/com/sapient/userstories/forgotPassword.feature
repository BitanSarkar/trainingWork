@Sanity
Feature: Forgot password test

  Scenario: The task for forgetting password
    Given the site is up
     When check the password forgot for
      | login    | password   |
      | bitan    | natib321   |
      | sushruth | htursus321 |
      | sanjana  | anajnas321 |
      | joker    | batman<3   |
     Then show relevant message
