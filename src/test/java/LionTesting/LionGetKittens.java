package LionTesting;


import com.example.Feline;
import com.example.IFeline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionGetKittens {
    @Mock
    IFeline feline;
    @Test
    public void TestLionKittens(){
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1,lion.getKittens());
    }

}
