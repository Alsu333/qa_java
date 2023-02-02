package cats;
import com.example.Cat;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CatTest {
    @Test
    public void GetSoundShouldBeReturn() {
        Cat cat = new Cat(null);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }
}
