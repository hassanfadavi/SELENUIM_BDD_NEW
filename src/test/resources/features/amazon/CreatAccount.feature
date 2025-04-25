Feature: Create amazon account with phone number

#  Background:
#    Given I am on the amazon web page
#    When I click on signIn button
#    Then I  click on Create amazon account button
  Scenario Outline: Successfully create an account with valid credential
    Given I am on the amazon web page
    When I click on signIn button
    Then I click on Create amazon account button
    Then I will enter username as value for your name field
    Then I will enter valid "<inputType>" as input
    Then I will enter password as a valid password value for password field
    Then I will  re-enter-password as a valid password value
    Then I click on continue button
    Examples:
      | inputType         |
      | s.hasanf@gmail.com |
      | 240408556          |

