package FelineTesting;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineGetKittensTest {
    @Mock
    Feline feline;

    @Test
    public void FelineGetKittensTest() {
        feline.getKittens(10); // вызвали метод с аргументом
        Mockito.verify(feline).getKittens(10); //проверили, что метод вызван с этим параметром
    }
}
