Feature: book information verification

  @db
  Scenario: Verify book information with DB
    Given Navigate to DB URL
    And User should be able to login to DB as a "librarian"
    And Users should be able to navigate to "Books" page
    When Users should be able to open book "Do Not Worry, Be Happy"
    Then UI book information should match the DB book information for book "Do Not Worry, Be Happy"