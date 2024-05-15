Feature: Verify user is able to login

  @login
  Scenario Outline: User can successfully login with valid credentials
    Given User is on the login page
    When User enters <userName>
    And User provides <password>
    Then User clicks on the login button
    And Verify user is redirected to the home page
    Examples:
      | userName               | password   |
      | "ab.nurzada@gmail.com" | "12345678" |

