import jdk.jfr.StackTrace;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void calculatorCanAdd(){
        assertEquals(8, Calculator.calculatorAdd(5,3));
    }

    
}
