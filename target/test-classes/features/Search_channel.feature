Feature: search a channel feature

  Background: user need to enter in to channel
    Given user entered in to channel

  Scenario: verify that user can able to search Jhansi S2
    Given user navigates to the TV page
    When the user enter the HotstarSpecials
    Then the Jhansi S2 video should be displayed

  Scenario: verify that user can able to search Dance to Dare
    Given user navigates to the Tv page
    When the user enter the StarBharat
    Then the Dance to Dare video  should be played


  Scenario: verify that user can able to xyijklopmn
    Given user navigate to the tv's page
    When the user enter the StarVijay
    Then the xyijklopmn video  should be played

  Scenario: verify that user can able to search BB Jodi
    Given user navigate to the Tv page
    When user enter the StarMaa
    Then the BB Jodi should be played

@smoke
  Scenario Outline: verify that user can able to search Star Jalsha
    Given User navigate to the tV page
    When User able to "<search>" video
    And User can click on enter
    Then  User redirected to the relavant page
    Examples:
      |search|
      |Rakhi Bandhan|
      |Mahabarat Bangla|





