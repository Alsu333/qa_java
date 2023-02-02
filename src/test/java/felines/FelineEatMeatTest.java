package felines;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class FelineEatMeatTest {
    @Test
    public void Test() throws Exception {
        Feline feline = new Feline();
        List<String> actual;
        try {
            actual = feline.eatMeat();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        List<String> expected = new ArrayList<>();
        expected.add("Животные");
        expected.add("Птицы");
        expected.add("Рыба");
        Assert.assertEquals(expected, actual);
    }
}
