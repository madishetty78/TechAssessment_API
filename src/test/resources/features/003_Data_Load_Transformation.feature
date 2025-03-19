Feature: Generate Position Report by transforming data from Instrument Details and Position Details tables

  @ETL @Regression
  Scenario: Generate Position Report from input files

    When I upload the file "InstrumentDetails" to Database
    And I upload the file "PositionDetails" to Database
    Then I generate the PositionReport from after processing




