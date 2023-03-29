import management.DataBaseAdmin;
import management.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {


    Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Connor", "SS 123456 C", 50.00);
    }


    @Test
    public void hasName(){
        assertEquals("Connor", developer.getName());

    }

    @Test
    public void hasNI_number(){
        assertEquals("SS 123456 C", developer.getNI_number());
    }

    @Test
    public void hasSalary(){
        assertEquals(50.00, 0.0,developer.getSalary());
    }



}
