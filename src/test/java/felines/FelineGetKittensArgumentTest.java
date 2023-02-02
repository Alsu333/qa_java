package felines;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class FelineGetKittensArgumentTest {
    @Test
    public void FelineGetKittensShouldBeOk() {
        Feline feline = new Feline();
        int actual = feline.getKittens(10);// вызвали метод с аргументом
        int expected = 10;
        Assert.assertEquals("Fail", expected, actual);//проверили
    }
}
