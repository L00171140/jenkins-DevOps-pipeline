package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticOperationsTest {

	ArithmeticOperations obj=new ArithmeticOperations();  
    @Test  
    public void testSum() {  
      
        assertEquals(25,obj.sum(10, 15));  
    } 
    @Test
    public void subtract() {
    	assertEquals(5, obj.subtract(15, 10));
		
	}
    @Test
    public void multiply() {
    	assertEquals(150, obj.multiply(10, 15));
		
	}
    @Test
    public void division() {
    	assertEquals(25, obj.division(10, 15));
		
	}
    

}

