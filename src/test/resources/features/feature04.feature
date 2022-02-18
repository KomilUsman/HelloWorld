@ft4
Feature: As a librarian, I want to know all the students who brewed books.
  @db
  Scenario: verify who borrowed which books

    Given Establish the database connections
    When I execute query to full join books and book_categories on user_id
    Then verify the "Test Student 344" data result set