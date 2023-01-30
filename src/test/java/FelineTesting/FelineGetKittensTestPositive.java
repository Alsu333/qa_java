package FelineTesting;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineGetKittensTestPositive {

    @Test
    public void FelineGetKittensTest() {
        Feline feline = new Feline();
        int actualKittens = feline.getKittens();
        int expectedKittens = 1;
        assertEquals("Fail, please try again",expectedKittens, actualKittens);
    }
}