import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = new Director("Randolph", "AA 123456 C", 120.00, "CodeClan", 500.00);
    }

    @Test
    public void hasName() {
        assertEquals("Randolph", director.getName());

    }

    @Test
    public void hasNI_number() {
        assertEquals("AA 123456 C", director.getNI_number());
    }

    @Test
    public void hasSalary() {
        assertEquals(120.00, 0.0, director.getSalary());
    }

    @Test
    public void hasDeptName() {
        assertEquals("CodeClan", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        director.setBudget(500.00);
        assertEquals(500.00, 0.0, director.getBudget());
    }}
}
