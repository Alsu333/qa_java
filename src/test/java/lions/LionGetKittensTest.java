package lions;
import com.example.IFeline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionGetKittensTest {
    @Mock
    IFeline felineInter;
    @Test
    public void TestLionKittens(){
        Lion lion = new Lion(felineInter);
        Mockito.when(lion.getKittens()).thenReturn(10);
        Assert.assertEquals("Fail, please try again", 10, lion.getKittens());
    }
}
