package cats;
import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTestMock {
    @Mock
    Feline feline;
    @Test
    public void GetFoodCatShouldBeOk() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Хищник"));
        Assert.assertEquals("Fail, try again", List.of("Хищник"), cat.getFood());
    }
}