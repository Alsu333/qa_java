package FelineTesting;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetKittensTest2 {

    @Test
    public void ReturnKittensTest() {
        Feline feline = new Feline();
        int actualKittens = feline.getKittens();
        int expectedKittens = 1;
        assertEquals(expectedKittens, actualKittens);
    }
}