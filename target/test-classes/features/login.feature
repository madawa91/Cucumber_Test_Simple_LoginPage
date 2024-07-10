Feature: Test login Page

  Scenario Outline: Check login is successful with valid credentias
    Given Browser is open
    And user is on login page
    When user enter <username> and <password>
    And user click on the login button
    Then user is navigated to the main page

    Examples: 
      | username | password    |
      | student  | Password123 |
     # | studsd   | Password123 |
