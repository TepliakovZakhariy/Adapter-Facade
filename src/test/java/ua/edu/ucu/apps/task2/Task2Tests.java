package ua.edu.ucu.apps.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task2Tests {

    @Test
    public void testDatabaseMethods() {
        
        Database db = new Database();

        
        String userData = db.getUserData();
        String statisticalData = db.getStatisticalData();

        
        assertEquals("hello", userData);
        assertEquals("hello2", statisticalData);
    }

    @Test
    public void testAuthAuthentication() {
        
        Database db = new Database();
        Auth auth = new Auth();

        
        boolean isAuthenticated = auth.authenticate(db);

        
        assertTrue(isAuthenticated);
    }

    @Test
    public void testReportBuilderInitialization() {
        
        Database db = new Database();

        
        ReportBuilder reportBuilder = new ReportBuilder(db);

        
        assertEquals(db, reportBuilder.getDb()); 
    }
}
