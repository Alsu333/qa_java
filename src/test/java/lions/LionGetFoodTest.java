package lions;
import com.example.IFeline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionGetFoodTest {
    @Mock
    IFeline feline;
    @Test
    public void LionTest() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals("Fail, try again",List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }
}
