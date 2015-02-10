/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.*;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import static sun.swing.MenuItemLayoutHelper.max;

/**
 *
 * @author 211150142
 */
public class NewEmptyTestNGTest {
    
    public NewEmptyTestNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("in before class");

    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("in after class");
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void checkValue() {
        System.out.println("in test checkValue()");
        assertEquals(6,6);
       
    }
    
    @Test
    public void checkSums() {
        System.out.println("in test checkSums()");
        assertEquals(8,sum(5,3));
        assertEquals(2.00,minus(5,3));
    }
    
    @Test
    public void notSame() {
        System.out.println("in test notSame()");
        assertNotSame("Peter","Alex");
    }
    
    @Test
    public void multiply() {
        fail("multiply function()");
        //assertEquals(6,multiply(5,2));
    }
    
    public int sum(int a,int b)
    {
       return  a + b;
    }
    
    public double minus(double a,double b)
    {
        return a - b;
    }
    
     public int multiply(int a,int b)
    {
        return a * b;
    }
    
    
    

    
}
