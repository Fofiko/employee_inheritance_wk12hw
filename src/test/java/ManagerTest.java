import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bossy Bob", "BB100", 100000.00, "Marketing");
    }

    @Test
    public void hasName(){
        assertEquals("Bossy Bob", manager.getName());
    }

    @Test
    public void canChangeName(){
        manager.setName("Sassy Sarah");
        assertEquals("Sassy Sarah", manager.getName());
    }

    @Test
    public void hasNInumber(){
        assertEquals("BB100", manager.getNINumber());
    }

    @Test
    public void canChangeNINumber(){
        manager.setNINumber("SS200");
        assertEquals("SS200", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000.00, manager.getSalary());
    }

    @Test
    public void canGetARaise(){
        manager.raiseSalary(20000.00);
        assertEquals(120000.00, manager.getSalary());
    }

    @Test
    public void checkBonus(){
        assertEquals(1000.0, manager.payBonus());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Marketing", manager.getDeptName());
    }

    @Test
    public void canChangeDeptName(){
        manager.setDeptName("Sales");
        assertEquals("Sales", manager.getDeptName());
    }


}
