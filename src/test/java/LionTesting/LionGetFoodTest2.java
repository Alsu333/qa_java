package LionTesting;

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
public class LionGetFoodTest2 {
    @Mock
    IFeline feline; //создали мок класса Feline который описывает интерфейс IFeline

    @Test
    public void LionGetFoodTest2() throws Exception {

        Lion lion = new Lion(feline); // //создали объект с этой зависимым моком
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        System.out.println(lion.getFood());
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
