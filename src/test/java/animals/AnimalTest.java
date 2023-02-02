package animals;
import com.example.Animal;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnimalTest {
    @Test
    public void GetFamilyShouldBeOk() {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        assertEquals(expected, actual);
    }
}

