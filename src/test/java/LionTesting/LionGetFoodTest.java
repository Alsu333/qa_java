package LionTesting;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionGetFoodTest {
    @Mock
    Lion lion;

    @Test
    public void LionGetFoodTest() throws Exception{
    Mockito.when(lion.getFood()).thenThrow(NullPointerException.class);
    assertThrows(NullPointerException.class, () ->{
        lion.getFood();
    } );
   }
}
