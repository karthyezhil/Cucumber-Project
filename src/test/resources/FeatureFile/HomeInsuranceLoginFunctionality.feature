@LogIn
Feature: To validate login functionality of policybazaar homeinsurance application

  Background: 
    Given To enter PolicyBazaar Home Insurance through Chrome browser

  @OneDLidst
  Scenario: To validate login by using firstname, mobileNo and emailidusing One dimensional list
     
    When Automatically fetch data from one dimensional list
      | Bala | 6385129735 | canbean@gmail.com | Daniel | 8546129 | t@123.com |
    And To click continue button
    Then validating credantials

  @TwoDList
  Scenario: To validate login by using firstname, mobileNo and emailidusing two dimensional list

    When Automatically fetch data from two dimensional list
      | Daniel |    8546129 | t@123.com         |
      | Arjun  | 8546129735 | derf234@yahoo.com |
      | Bala   | 6385129735 | canbean@gmail.com |
    And To click continue button
    Then validating credantials

  @OneDMap
  Scenario: To validate login by using firstname, mobileNo and emailidusing One dimensional map
    
    When Automatically fetch data from one dimensional map
      | firstname | Alean      |
      | mobileNo  | 8546129735 |
      | emailid   | …@@        |
    And To click continue button
    Then validating credantials

  @TwoDMap
  Scenario: To validate login by using firstname, mobileNo and emailid using two dimensional map
    
    When Automatically fetch data from two dimensional map
      | firstname | mobileNo   | emailid           |
      | Arjun     | 8546129735 | derf234@yahoo.com |
      | Bala      | 6385129735 | canbean@gmail.com |
      | Arjun     | 8546129735 | derf234@yahoo.com |
    And To click continue button
    Then validating credantials
