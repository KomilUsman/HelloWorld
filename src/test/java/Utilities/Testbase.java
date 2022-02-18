package Utilities;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class Testbase {

    @BeforeAll
    public static void setUp(){
        DB_Util.createConnection();
    }

    @AfterAll
    public static void tearDown(){
        DB_Util.destroy();

    }
}