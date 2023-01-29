package FelineTesting;

import com.example.Animal;
import com.example.Feline;
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
public class FelineEatMeatNegative {
    @Mock
    Animal animal;

    @Test
    public void TestNegative() throws Exception {
        Animal animal1 = new Animal();
        try{
        animal1.getFood("something");
        }
        catch (Exception e){
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
        Mockito.when(animal.getFood(null)).thenThrow(NullPointerException.class);
        assertThrows(NullPointerException.class, () ->{
            animal.getFood(null);
        });
    }
}
