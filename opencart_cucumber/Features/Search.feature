Feature: Search feature

  #@sanity
  #Scenario: Search with valid ProductName
    #Given the user navigates to login page
    #When user enters email as "pavanoltraining@gmail.com" and password as "test@123"
    #And the user clicks on the Login button
    #Then the user should be redirected to the MyAccount Page
    #And  Enter any existing Product name "iMac" into the Search text box field
    #Then Click on the button having search icon
    #And Searched product "iMac" should be displayed in the search results
  
@sanity
  Scenario: Search with invalid ProductName
    Given the user navigates to login page
    When user enters email as "pavanoltraining@gmail.com" and password as "test@123"
    And the user clicks on the Login button
    Then the user should be redirected to the MyAccount Page
    And  Enter any existing Product name "Fitbit" into the Search text box field
    Then Click on the button having search icon
    And Searched product "Fitbit" should not be displayed in the search results