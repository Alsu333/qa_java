package FelineTesting;
import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;


public class FelineGetFamilyTest {

    @Test
    public void FelineGetFamilyTest() {
        ///Arrange
        Feline feline = new Feline();

        String expectedReturn = "Кошачьи";
        String actualReturn = feline.getFamily();
        assertEquals(expectedReturn,actualReturn);// проверили что метод работает
    }
}