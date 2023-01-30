package LionTesting;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;


@RunWith(Parameterized.class)
public class LionTest { // создали тестовый класс
    private final String sex; // создали поля тестового класса
    private final boolean hasMane; // создали поля тестового класса

    public LionTest(String sex, boolean hasMane) { // создали конструктор тестового класса
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "{index}: sex({0})={1}")
    public static Object[] getSumData() { // передали тестовые данные
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
public void SexTestAnimal(){
        Lion lion = null;
        try {
            lion = new Lion(sex); // опасный код, из-за которого может произойти исключение
        } catch (Exception e) { // класс исключения
            System.out.println("Используйте допустимые значения пола животного - самец или самка");

        }
        boolean doesHaveMane = lion.doesHaveMane();
        assertEquals(hasMane, doesHaveMane); // сравнили ожидаемый и фактический результат
    }
}
