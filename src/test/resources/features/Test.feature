
  Feature: User is on the Test page
    Scenario: Verify Test Page Navigation
      Given user is on page "https://codewise.studymate.us/student"
      And user is logged in with valid credentials "kalambekova.b@gmail.com" "030200aikol"
      When user navigates to the Test page
      Then verify that the Test page is displayed

#    Scenario: Start Test
#      Given user on "https://codewise.studymate.us/student" page
#      And user is logged in with valid "kalambekova.b@gmail.com" "030200aikol" credentials
#      When user navigates to the Test page
#      And user clicks on the "Start Test" button
#      Then verify that the test begins
#
#    Scenario:Submit Test
#      Given user on "https://codewise.studymate.us/student" page
#      And user is logged in with valid "kalambekova.b@gmail.com" "030200aikol" credentials
#      When user navigates to the Test page
#      And user clicks on the "Start Test" button
#      And user has completed answering all the test questions
#      And user clicks on the "Submit" button
#      Then verify that the test is submitted successfully
