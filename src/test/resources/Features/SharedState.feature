Feature: Verify SharedState

  Scenario: Check sharedStateIn2Steps
    Given CheckInitialValueOfSharedState
    Then CheckSharedStateValueAfterChange