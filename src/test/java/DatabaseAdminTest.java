import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Niko", "NN500", 31000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Niko", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("NN500", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(31000.00, databaseAdmin.getSalary());
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Taki");
        assertEquals("Taki", databaseAdmin.getName());
    }

    @Test
    public void canChangeNINumber(){
        databaseAdmin.setNINumber("TT500");
        assertEquals("TT500", databaseAdmin.getNINumber());
    }

    @Test
    public void canGetARaise(){
        databaseAdmin.raiseSalary(20000.00);
        assertEquals(51000.00, databaseAdmin.getSalary());
    }

    @Test
    public void checkBonus(){
        assertEquals(310.00, databaseAdmin.payBonus() );
    }
}
