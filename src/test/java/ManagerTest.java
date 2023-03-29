import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Mike","QQ 123456 C",100.00,"CodeClan");
    }

    @Test
    public void hasName(){
        manager.setName("Mike");
        assertEquals("Mike", manager.getName());

    }

    @Test
    public void hasNI_number(){
        manager.setNI_number("QQ 123456 C");
        assertEquals("QQ 123456 C", manager.getNI_number());
    }

    @Test
    public void hasSalary(){
        manager.setSalary(100.00);
        assertEquals(100.00, 0.0, manager.getSalary());
    }

    @Test
    public void hasDeptName(){
        manager.setDeptName("CodeClan");
        assertEquals("CodeClan", manager.getDeptName());

    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(100.00);
        assertEquals(200.00, 0.0,  manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(1.00, manager.payBonus(), 0.0);
    }




}
