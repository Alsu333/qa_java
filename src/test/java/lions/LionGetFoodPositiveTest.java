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
public class LionGetFoodPositiveTest {
    @Mock
    IFeline feline; //создали мок класса Feline который описывает интерфейс IFeline
    @Test
    public void LionGetFoodShouldBeOk() throws Exception {
        Lion lion = new Lion(feline); // //создали объект с этой зависимым моком
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals("Fail, please try again", List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
