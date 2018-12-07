import org.junit.Before;
import org.junit.Test;
import com.company.RomanNumeral;

import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {

    @Test
    public void arabicToRoman() {
        assertEquals("I", RomanNumeral.convert(1));
    }

    @Test
    public void oneTwo() {
        assertEquals("I", RomanNumeral.convert(1));
        assertEquals("II", RomanNumeral.convert(2));
    }

    @Test
    public void oneTwoThreeRepeatIs() {
        assertEquals("I", RomanNumeral.convert(1));
        assertEquals("II", RomanNumeral.convert(2));
        assertEquals("III", RomanNumeral.convert(3));
    }

    @Test
    public void four(){
        assertEquals("IV", RomanNumeral.convert(4));
    }

    @Test
    public void five(){
        assertEquals("V", RomanNumeral.convert(5));
    }

    @Test
    public void six(){
        assertEquals("VI", RomanNumeral.convert(6));
    }

    @Test
    public void seven(){
        assertEquals("VII", RomanNumeral.convert(7));
    }

    @Test
    public void eight(){
        assertEquals("VIII", RomanNumeral.convert(8));
    }

    @Test
    public void nine(){
        assertEquals("IX", RomanNumeral.convert(9));
    }

}