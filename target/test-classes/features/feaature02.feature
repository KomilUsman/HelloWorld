@ft2
Feature:  As a librarian, I want to know who browed books.

  @db @ui
  Scenario: verify the amount of people who borrowed books

    Given Establish the database connection
    When I execute query to inner join users and book_borrow on Id
    Then verify amount of people who had borrowed books