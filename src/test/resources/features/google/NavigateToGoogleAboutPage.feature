@googleaboutPage
Feature: Google Navigation

  Scenario: Navigate To Google About Page
    Given I am on the google web page
    When I click on about button
    Then I should see the about page