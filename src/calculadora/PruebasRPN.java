package calculadora;

import org.junit.Test;

import junit.framework.TestCase;
import calculadora.RPN;

public class PruebasRPN extends TestCase {
	RPN rpn = new RPN("4 + 1");
	 @Test
	    public void test() {
	        
	        assertEquals(5.0, rpn.resultado());
	    }
}
