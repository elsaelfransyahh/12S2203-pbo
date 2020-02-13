/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 06-12s18050 Elsa Marbun
 * @author  06-12s18020 Dita Sihombing
 */
public class MainTest {
    
    public MainTest() {
    }
    
  @Test
  public void testAdd(){
      Main.reset();
      
      Main.add("12S17067", "Fradina");
      assertEquals(1, Main.count());
      
      Main.add("12S18001", "Cindy");
      assertEquals(2, Main.count());
      
      Main.add("12S18002", "Wiranda");
      assertEquals(3, Main.count());
      
      Main.add("12S18003", "Citra");
      assertEquals(4, Main.count());
      
      Main.add("12S18004", "Rosalia");
      assertEquals(5, Main.count());
      
  }
  
  @Test
  public void testFind(){
      String result;
      Main.reset();
      
      Main.add("12S17067", "Fradina");
      Main.add("12S18001", "Cindy");
      Main.add("12S18002", "Wiranda");
      Main.add("12S18003", "Citra");
      Main.add("12S18004", "Rosalia");
      
      result = Main.find("12S17067");
      assertEquals("12S7067 Fradina", result);
      
      result = Main.find("12S18003");
      assertEquals("12S18003 Citra", result);
      
      result = Main.find("12S18006");
      assertEquals("", result);
      
  }

  
    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] _args = null;
        Main.main(_args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Main.
     */
  

    
    @Test
    public void testCountNoData() {
       Main.reset();
       
       assertEquals(0, Main.count());
    }

    @Test
    public void testCountSomeData(){
        Main.reset();
        
      Main.add("12S17067", "Fradina");
      Main.add("12S18001", "Cindy");
      Main.add("12S18002", "Wiranda");
      Main.add("12S18003", "Citra");
      Main.add("12S18004", "Rosalia");
      
      assertEquals(5, Main.count());
    }
    /**
     * Test of reset method, of class Main.
     */
    @Test
    public void testReset() {
    Main.reset();
    assertEquals(0, Main.count());
    
    Main.add("12S17067", "Fradina");
    Main.add("12S18001", "Cindy");
    Main.reset();
    assertEquals(0, Main.count());
    
    
      Main.add("12S18002", "Wiranda");
      Main.add("12S18003", "Citra");
      Main.add("12S18004", "Rosalia");
      Main.reset();
      assertEquals(0, Main.count());
    
    }
    
}
