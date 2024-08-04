@regression_qa @sign_up

  Feature: Sign up

    Scenario: Register a new user with valid details information
      Given the user registration details with username as "thaochiclair_2008", and password as "abCd@1234", and email as "thaochiclair_2008@gmail.com"
      When I perform the POST request to register the user
      Then the status code 201 should return
      And the user should be registered successfully with the "username" as "thaochiclair_2008"
      And the user should be registered successfully with the "email" as "thaochiclair_2008@gmail.com"
      When I perform the POST request to log in the user
      Then the status code 200 should return
      And the user should signed in successfully into the system with the "username" as "thaochiclair_2008"