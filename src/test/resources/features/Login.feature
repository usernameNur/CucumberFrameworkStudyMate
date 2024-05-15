@login
Feature: Verify user is able to login
  Background:
    Given User is on login page
    When User enters "<userName>"
    And User enters "<password>"
    Then User click on login button




  @loginPositive
  Scenario Outline: User can successfully login with valid credentials

    Then Verify user redirected to the home page
    Examples:
      | userName             | password |
      | ab.nurzada@gmail.com | 12345678 |
      |                      |          |
      |                      |          |
      |                      |          |
      |                      |          |
      |                      |          |

  @loginNegative
  Scenario Outline: User logs in with invalid credentials

    Then Verify user fails to log in
    Examples:
      | userName    | password        |
      | Mike        | 12345           |
      | invalidUser | invalidPassword |
      | Sara        |                 |
      |             | 134234          |
      |             |                 |
      |             |                 |

