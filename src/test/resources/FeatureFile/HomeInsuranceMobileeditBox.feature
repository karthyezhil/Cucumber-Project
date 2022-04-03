@MobileEditBox
Feature: To Validate MobileNo edit box Functionality of Home Insurance Policy Bazaar

  Background: 
    Given To enter PolicyBazaar Home Insurance through Chrome browser

  @MobileNo
  Scenario Outline: To validate scenario by using different credentials
    When To fill MobileNo edit box "<mobileNo>"
    Then validating MobileNo edit box

    Examples: 
      | mobileNo    |
      |  8542695874 |
      |   658742356 |
      | 95367482453 |
      |        7542 |
      |             |
      |  0000000000 |
      |  8888888888 |
      | 785 986 85  |
      | Abcdefghij  |
      | !@#$%^&**@  |
      | Ab$%rd^&t@  |
      | 87654#$%^&  |
      |  1238569745 |
      |  2254687741 |
      |  3587496125 |
      |  4875698231 |
      |  5789461234 |
      | 63744607764 |
      |  7708506788 |
      |  9964626620 |
      |  9994466709 |
