@AddAndDeleteUser
Feature: Add and Delete User

  Scenario Outline: In order to add and delete user

    When user should be able to go main page
    Then user should be able to add new user with "<firstName>""<lastName>""<username>""<password>""<email>""<cellPhone>"
    And user should be able to delete existing user
    Examples:
      | firstName | lastName | username | password | email               | cellPhone  |
      | Mustafa   | K        | mustafak | 636363   | mustafa@teladoc.com | 6363636363 |






