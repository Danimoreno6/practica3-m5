
package myutils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MyUtilsTest {
    
    public MyUtilsTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
   
    @org.junit.jupiter.api.Test
    public void testInverteix() {
        System.out.println("inverteix");
        String cadena = "Hola";
        String expResult = "aloH";
        String result = MyUtils.inverteix(cadena);
        assertEquals(expResult, result);
        
    }
    public void testInverteix2() {
        System.out.println("inverteix");
        String cadena = null;
        String expResult = null;
        String result = MyUtils.inverteix(cadena);
        assertEquals(expResult, result);
        
    }

    
    @org.junit.jupiter.api.Test
    public void testEdat() {
        System.out.println("edat");
        int day = 7;
        int month = 3;
        int year = 1996;
        int expResult = 26;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
       
    }
    public void testEdat2() {
        System.out.println("edat");
        int day = 7;
        int month = 3;
        int year = 1000;
        int expResult = -1;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
       
    }
    public void testEdat3() {
        System.out.println("edat");
        int day = 7;
        int month = 3;
        int year = 2060;
        int expResult = -2;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
       
    }

    
    @org.junit.jupiter.api.Test
    public void testFactorial() {
        System.out.println("factorial");
        double numero = 3.0;
        double expResult = 6.0;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
       
    }
    public void testFactorial2() {
        System.out.println("factorial");
        double numero = 0.0;
        double expResult = 1.0;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
       
    }
    public void testFactorial3() {
        System.out.println("factorial");
        double numero = -5.0;
        double expResult = -1.0;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
       
    }
    
}
