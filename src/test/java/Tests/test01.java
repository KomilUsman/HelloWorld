package Tests;

import Utilities.DB_Util;
import Utilities.Testbase;
import org.junit.jupiter.api.Test;

import java.util.List;

public class test01 extends Testbase {


    @Test
    public void testUserCount() {

        String query2 = "select * from employees WHERE first_name ='Martha'";
        DB_Util.runQuery(query2);

        List<String> rowData = DB_Util.getRowDataAsList(1);

        System.out.println("rowData = " + rowData);
    }


}
