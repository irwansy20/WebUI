Feature: Login

  @valid-login
  Scenario: Login with valid username and password
    Given user is on login page
    When user input username text box with "standard_user"
    And user input password text box with "secret_sauce"
    And user click login button
    Then user will redirect to homepage

  @invalid-login
  Scenario: Login with invalid username and password
    Given user is on login page
    When user input username text box with "standard_user"
    And user input password text box with "invalid"
    And user click login button
    Then user see error message "Epic sadface: Username and password do not match any user in this service"

    @batas
    Scenario: Login with blank username and valid password
      Given user is on login page
      When user input username text box with ""
      And user input password text box with "secret_sauce"
      And user click login button
      Then user see error message if blank "Epic sadface: Username is required"