@RoomCreate
Feature: room_crear
  Scenario: TC01_Room_Crear
    Given kullanici Medunnaya "https://www.medunna.com/" gider
    When kullanici Login olur
    And kullanici room olusturur
    Then kullanici olusturdugu roomun oldugunu dogrular