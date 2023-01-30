package FelineTesting;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FelineGetFamilyTest {

    @Test
    public void FelineGetFamilyTest() {
        ///Arrange
        Feline feline = new Feline();

        String expectedReturn = "Кошачьи";
        String actualReturn = feline.getFamily();
        assertEquals(expectedReturn, actualReturn);// проверили что метод работает
    }
}