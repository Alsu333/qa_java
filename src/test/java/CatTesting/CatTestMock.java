package CatTesting;
import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

@RunWith(MockitoJUnitRunner.class)

public class CatTestMock {
   @Mock
   public Feline feline;


    @Test
   public void getsFoodTest() throws Exception {

        Cat cat = new Cat(feline) ;
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Хищник"));
        Assert.assertEquals(List.of("Хищник"),cat.getFood());
        System.out.println(cat.getFood());
    }
}