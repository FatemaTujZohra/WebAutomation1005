

Feature: Data Table immplementation
  Background: 
    Given I go to ToolsQA page
  @Runme
  Scenario: Checking the default coloumn
    When I see ToolsQA webtable page
    Then I verified the ToolsQA table default
      | Automation Tool | Licensing | Market response |