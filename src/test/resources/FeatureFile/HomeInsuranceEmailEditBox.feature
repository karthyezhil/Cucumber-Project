@EmailEditBox
Feature: To Validate Email edit box Functionality of Home Insurance Policy Bazaar

  Background: 
    Given To enter PolicyBazaar Home Insurance through Chrome browser

  @EmailId
  Scenario Outline: To validate scenario by using different credentials
    When To fill Email edit box "<emailId>"
    Then validating Email edit box

    Examples: 
      | emailId           |
      | abc123@gmail.com  |
      | erty.ertg@ty.df   |
      | ak47@gmail.com    |
      | 12345@yahho.co.in |
      | abc_abcqwe@yu.in  |
      | uhj#$87@a.co      |
      | a@you.in          |
      | t@yahoo.in        |
      | 123.234@co        |
      | @drft@gmail.com   |
      |                   |
