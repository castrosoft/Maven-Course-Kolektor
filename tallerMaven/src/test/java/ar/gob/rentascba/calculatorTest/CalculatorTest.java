package ar.gob.rentascba;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class CalculatorTest{

    Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void addTest(){
        int result = calculator.add(4, 2);
        assertEquals(6, result);
    }

    @Test
    public void subsTest(){
        int result = calculator.subs(4, 2);
        assertEquals(2, result);
    }

    @Test
    public void mulTest(){
        int result = calculator.mult(4, 2);
        assertEquals(8, result);
    }

    @Test
    public void divTest(){
        int result = calculator.div(4, 2);
        assertEquals(2, result);
    }

}
