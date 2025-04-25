@googleEmail
Feature: Enter email on google signIn page

  Scenario: user should be able to navigate to google sign in page
    Given user is on google dash boards
    When I will click on signIn buttons
    Then I should see Use your Google Account text on signin pages
    When I input email adress
    And I click on next button
    Then I should see Welcome text
