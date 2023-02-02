package animals;
import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalGetFoodTest {
    private final String animalKind;
    private final List<String> foodAnimals;
    public AnimalGetFoodTest(String animalKind, List<String> foodAnimals) {
        this.animalKind = animalKind;
        this.foodAnimals = foodAnimals;
    }
    @Parameterized.Parameters(name = "{index}: animal({0})={1}")
    public static Object[] Data() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }
    @Test
    public void GetFoodParameterizedShouldBeOk() throws Exception {
        Animal animal = new Animal();
        List<String> expected = foodAnimals;
        List<String> actual = animal.getFood(animalKind);
        try {
            actual = animal.getFood(animalKind);
        } catch (Exception exception) {
            System.out.print("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
        assertEquals("Fail", expected, actual);
    }
}
