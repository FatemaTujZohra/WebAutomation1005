Feature: Google Footer list Checkup

  Background: 
    Given I go to Google Home page

  @Runme
  Scenario: Selecting different footer links and checking the corresponding page
    When I see google home page
    Then I verified the Google footer list text
     
      | Privacy  |
      | Terms    |
      | Settings |
