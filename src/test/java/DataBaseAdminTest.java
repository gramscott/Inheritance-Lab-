import management.DataBaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void setUp() {
        dataBaseAdmin = new DataBaseAdmin("Taylor", "GG 123456 C", 50.00);
    }

    @Test
    public void hasName(){
        assertEquals("Taylor", dataBaseAdmin.getName());

    }

    @Test
    public void hasNI_number(){
        assertEquals("GG 123456 C", dataBaseAdmin.getNI_number());
    }

    @Test
    public void hasSalary(){
        assertEquals(50.00, 0.0,dataBaseAdmin.getSalary());
    }

}
