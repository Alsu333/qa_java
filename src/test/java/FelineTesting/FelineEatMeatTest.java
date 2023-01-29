package FelineTesting;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;


public class FelineEatMeatTest {
    @Test
    public void Test(){
        //Arrange
    Feline feline = new Feline();
        List<String> actual = null;
        try {
            actual = feline.eatMeat();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        ///Act
    List<String> expected = new ArrayList<>();
    expected.add("Животные");
    expected.add("Птицы");
    expected.add("Рыба");
    Assert.assertEquals(expected,actual);
}
}
