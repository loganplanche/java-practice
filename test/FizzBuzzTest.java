import com.company.FizzBuzzConverter;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzConverterLeavesNormalNumbersAlone() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    public void fizzBuzzConverterMultipleOfThree() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    public void fizzBuzzConverterMultipleOfFive() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    public void fizzBuzzConverterMultipleOfBothThreeAndFive() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }

}
