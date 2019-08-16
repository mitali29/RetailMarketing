Feature: I like to test facebook login page

  Background:
    Given I am on facebook login page

    Scenario: I like to login in my facebook
      When I type my email and password
      And I click sign in button
      Then I should be able to login in my facebook account

