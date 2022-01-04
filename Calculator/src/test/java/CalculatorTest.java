import jdk.jfr.StackTrace;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void calculatorCanAdd(){
        assertEquals(9, Calculator.calculatorAdd(6,3));
    }

    @Test
    public void calculatorCanSubtract(){
        assertEquals(3,Calculator.calculatorSubtract(6,3));
    }

    @Test
    public void calculatorCanMultiply(){
        assertEquals(18,Calculator.calculatorMultiply(6,3));
    }

    @Test
    public void calculatorCanDivide(){
        assertEquals(2.0,Calculator.calculatorDivide(6.0,3.0),0.0);
    }

}
