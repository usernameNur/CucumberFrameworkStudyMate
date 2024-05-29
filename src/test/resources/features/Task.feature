Feature: User is on Task Page
  Scenario: Verify user can update Task page
    Given user on "https://codewise.studymate.us/student" page
    And user logs in with valid "ab.nurzada@gmail.com" "12345678" credentials
    And user goes to Task page
    And user clicks on update button
    And user provides input "this is the one"
    And user clicks on submit button
    Then verify user was able to update Task