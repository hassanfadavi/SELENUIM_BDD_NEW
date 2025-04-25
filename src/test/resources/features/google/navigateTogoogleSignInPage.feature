@googleSignIn
Feature: Navigate to google signIn page

  Scenario: user should be able to navigate to google sign in page
    Given user is on google dash board
    When I will click on signIn button
    Then I should see Use your Google Account text on signin page
