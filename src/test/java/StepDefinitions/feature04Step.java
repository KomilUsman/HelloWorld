package StepDefinitions;

import Utilities.DB_Util;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class feature04Step {

    String actualBookName;

    @When("I execute query to full join books and book_categories on user_id")
    public void i_execute_query_to_full_join_books_and_book_categories_on_user_id() {

        String query = "select full_name, count(*) from users u inner join" +
                " book_borrow bb  on u.id = bb.user_id" +
                " group by full_name order by count(*) desc";

        DB_Util.runQuery(query);
        actualBookName = DB_Util.getCellValue(1, 1);
        System.out.println(actualBookName);


    }

    @Then("verify the {string} data result set")
    public void verify_the_data_result_set(String expectedBook) {
        assertEquals(actualBookName, expectedBook);


    }


}
