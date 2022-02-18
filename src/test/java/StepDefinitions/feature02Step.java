package StepDefinitions;

import Pages.LoginPage;
import Utilities.BrowserUtil;
import Utilities.DB_Util;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class feature02Step {

    LoginPage loginPage = new LoginPage();


    @Given("Establish the database connection")
    public void establish_the_database_connection() {

        System.out.println("*******************************************");
        System.out.println("***** Connection is DONE via HOOKS ********");
        System.out.println("*******************************************");

    }

    @When("I execute query to inner join users and book_borrow on Id")
    public void i_execute_query_to_inner_join_users_and_book_borrow_on_id() {

        String query = "select count(*) from book_borrow where is_returned=0";
        DB_Util.runQuery(query);
    }

    @Then("verify amount of people who had borrowed books")
    public void verify_amount_of_people_who_had_borrowed_books() {

        loginPage.login();
        BrowserUtil.waitFor(3);
        String databaseBorrowedBook = DB_Util.getCellValue(1, 1);
        String UIBorrowedBooks = loginPage.borrowedBooksNumber.getText();

        System.out.println("databaseBorrowedBook = " + databaseBorrowedBook);
        System.out.println("UIBorrowedBooks = " + UIBorrowedBooks);

        assertEquals(databaseBorrowedBook, UIBorrowedBooks);


        Driver.getDriver().quit();
        DB_Util.destroy();


    }


}
