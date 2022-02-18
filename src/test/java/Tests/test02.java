package Tests;

import Utilities.ConfigReader;
import Utilities.DB_Util;
import org.junit.jupiter.api.Test;

public class test02 {


    @Test
    public void testAmountOfBB(){


        DB_Util.createConnection(ConfigReader.read("DBurl"),
                ConfigReader.read("DBusername"),
                ConfigReader.read("DBpassword"));

        String query = "select count(*) from book_borrow where is_returned=0";
        DB_Util.runQuery(query);
        String actualBB = DB_Util.getCellValue(1, 1); // BB means Borrowed Books

        System.out.println("actual Borrowed Books = " + actualBB);



    }

}
