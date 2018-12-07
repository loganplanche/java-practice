
import com.company.FizzBuzzConverter;
import org.junit.Test;
public class ActualFizzBuzzAppTest {


    @Test
    public void outputTheHundredFizzBuzzes(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        for(int i=1;i<=100;i++){
            System.out.println(fizzBuzz.convert(i));
        }
    }
}
