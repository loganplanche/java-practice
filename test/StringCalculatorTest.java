import com.company.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    private Calculator myCalc;

    @Before
    public void init() {
        myCalc = new Calculator();
    }

    @Test
    public void emptyStringReturnsZero() throws Exception {
        assertEquals(0, myCalc.calculate(""));
    }

    @Test
    public void singleNumberReturnsValue() throws Exception {
        assertEquals(2, myCalc.calculate("2"));
    }

    @Test
    public void twoNumbersCommaDelimitedReturnSum() throws Exception {
        assertEquals(17, myCalc.calculate("10,7"));
    }

    @Test
    public void twoNumbersNewLineDelimitedReturnSum() throws Exception {
        assertEquals(13, myCalc.calculate("10\n3"));
    }

    @Test
    public void threeNumbersDelimitedEitherWayReturnSum() throws Exception {
        assertEquals(20, myCalc.calculate("13\n5,2"));
    }
/*
    @Test(expected = Exception.class)
    public void negativeInputThrowsException() throws Exception {
        myCalc.calculate("-1");
    }*/

    @Test
    public void ignoresNumbersGreaterThan1000() throws Exception {
        assertEquals(20, myCalc.calculate("10,10,1001"));
    }

}
