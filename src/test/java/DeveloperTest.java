import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Augusta Ada", "AA300", 30000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Augusta Ada", developer.getName());
    }

    @Test
    public void canChangeName(){
        developer.setName("Grace Hopper");
        assertEquals("Grace Hopper", developer.getName());
    }

    @Test
    public void hasNInumber(){
        assertEquals("AA300", developer.getNINumber());
    }

    @Test
    public void canChangeNINumber(){
        developer.setNINumber("GH200");
        assertEquals("GH200", developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.00, developer.getSalary());
    }

    @Test
    public void canGetARaise(){
        developer.raiseSalary(20000.00);
        assertEquals(50000.00, developer.getSalary());
    }

    @Test
    public void cannotGetNegativeRaise(){
        developer.raiseSalary(-555.55);
        assertEquals(30000.00, developer.getSalary());
    }

    @Test
    public void checkBonus(){
        assertEquals(300.0, developer.payBonus());
    }
}
