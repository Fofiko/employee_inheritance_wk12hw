import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Sandra Bullock", "SB111", 150000.00, "Branding", 10.80);
    }
    
    @Test
    public void hasName(){
        assertEquals("Sandra Bullock", director.getName());
    }

    @Test
    public void canChangeName(){
        director.setName("Regina");
        assertEquals("Regina", director.getName());
    }

    @Test
    public void hasNInumber(){
        assertEquals("SB111", director.getNINumber());
    }

    @Test
    public void canChangeNINumber(){
        director.setNINumber("R1234");
        assertEquals("R1234", director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(150000.00, director.getSalary());
    }

    @Test
    public void canGetARaise(){
        director.raiseSalary(20000.00);
        assertEquals(170000.00, director.getSalary());
    }

    @Test
    public void checkBonus(){
        assertEquals(1500.0, director.payBonus());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Branding", director.getDeptName());
    }

    @Test
    public void canChangeDeptName(){
        director.setDeptName("Sales");
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(10.80, director.getBudget());
    }


}
