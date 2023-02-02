package lions;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionGetFoodNegativeTest {
    @Mock
    Lion lion;
    @Test
    public void LionGetFoodTestWithNull() throws Exception {
        Mockito.when(lion.getFood()).thenThrow(NullPointerException.class);
        assertThrows(NullPointerException.class, () -> {
            lion.getFood();
        });
    }
}
