package CatTesting;

import com.example.Cat;
import com.example.Predator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {
    @Test
    public void catGetFood() {
        ///Arrange
        Predator predator;
        Cat cat = new Cat(null);
        String expectedSound = "Мяу";

        ///Act
        String actualSound = cat.getSound();

        ///Assert
        assertEquals(expectedSound, actualSound);
    }


}
