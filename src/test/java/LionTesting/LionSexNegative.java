package LionTesting;

import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

public class LionSexNegative {
    @Test
    public void TestCheckSex()throws Exception {
        boolean expected = false;
        Lion lion = new Lion("Самка");
        boolean actual = lion.doesHaveMane();
        try {
            lion = new Lion("Сам");
        } catch (Exception e) {
            System.out.print("Используйте допустимые значения пола животного - самец или самка");
        }

        Assert.assertEquals(expected, actual);
    }
}
