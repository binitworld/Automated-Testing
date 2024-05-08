
package Junit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class DatesTest {

	@Test
    public void testConstructorWithArguments() {
        Date date = new Date(2024, 3,13);
        assertEquals(2024, date.getYear());
        assertEquals(3, date.getMonth());
        assertEquals(13, date.getDay());
    }

    @Test
    public void testDefaultConstructor() {
        Date date = new Date();
        assertNotNull(date);
    }

    @Test
    public void testAddDays() {
        Date date = new Date(2024, 3, 13);
        date.addDays(5);
        assertEquals("2024-03-18", date.toString());
    }

    @Test
    public void testDaysInMonth() {
        Date date = new Date(2024, 3, 13);
        assertEquals(31, date.daysInMonth());
    }

    @Test
    public void testDayOfWeek() {
        Date date = new Date(2024, 3, 13);
        assertEquals("WEDNESDAY", date.dayOfWeek());
    }

    @Test
    public void testLeapYear() {
        Date date = new Date(2024, 3, 13); 
        assertTrue(date.isLeapYear(2024));
    }
    @Test
    public void testNotLeapYear() {
    	Date date  = new Date(2023, 3, 15);
    	assertFalse(date.isLeapYear(2023));
    }
    	
    
    @Test
    public void testNextDay() {
        Date date = new Date(2024, 3, 13);
        date.nextDay();
        assertEquals("2024-03-14", date.toString());
    }

    @Test
    public void testEquals() {
        Date date1 = new Date(2024, 3, 13);
        Date date2 = new Date(2024, 3, 13);
        assertEquals(date1, date2);
    }

//    @Test
//    public void testvalidDate(int year, int month, int day) {
//        Date date = new Date(2024, 01, 03);
//        assertEquals("valid date", date.toString());
//    }

}