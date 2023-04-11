@TC01_Api
Feature: Room Creation

  Scenario: TC01_Post_Room
    Given user sends post request for room data
    #kullanici post request gonderir
    Then user gets the room data and assert
    #room datayi alir ve dogrular