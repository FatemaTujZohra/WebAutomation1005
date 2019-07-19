 @Runme
Feature: Mercury Tours Registration
  #@Runme
    Scenario: Verification of user's Registration
    Given User goes to http://newtours.demoaut.com
    When User click on the Register link on top
    And  User fills up the registration details
    
    |First Name|sling|
    |Last Name |CHO|
    |Phone |5960122345|
    |Email|abc123@gmail.com|
    |Address|123 Hadson Rd|
    |City|Saltlake|
    |State/Province|UT|
    |Postal Code|22304-2015|
    |Country|USA|
    |User Name|abc123@gmail.com|
    |Password|demo123|
    |Confirm Password|demo123|
    And  User clicks on submit button
    Then User verifies the registration is complete
    

  
