@NameEditBox
Feature: To Validate Name edit box Functionality of Home Insurance Policy Bazaar

  Background: 
    Given To enter PolicyBazaar Home Insurance through Chrome browser

  @FirstName
  Scenario Outline: To validate scenario by using different credentials
    When To fill Name edit box "<firstName>"
    Then validating Name edit box

    Examples: 
      | firstName                                           |
      | aa                                                  |
      | ABI                                                 |
      | Ramu                                                |
      | Adolph Blaine Charles David Earl Frederick Gerald   |
      | Adolph  Blaine Charles David Earl Frederick Gerald  |
      | Adolph  Blaine  Charles David Earl Frederick Gerald |
      | Christopher                                         |
      | Adolph Blaine Charles David Earl Freder             |
      | JeffreyDahmer                                       |
      | Adolph Blaine Charles David Ear Frederick Geral     |
      | %$@!&                                               |
      |                                              854236 |
      | A_b                                                 |
      | R__u                                                |
      | Test852                                             |
      | %$#Rec                                              |
      | Yr65$#fg%^                                          |
