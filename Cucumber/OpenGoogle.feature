Feature: Google Search
  As a user
  I want to open google
  So that i can search for information

  Scenario: Open google and search for a keyword
    Given the user opens the google homepage
    When user enter "Deepak Jeyan" into the search box
    And clicks the search button
    Then User should see results related to "Deepak Jeyan"