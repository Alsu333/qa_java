package com.example;
import com.example.Animal;
import java.util.List;

public interface IFeline { // создали общий интерфейс
    int getKittens();

    List<String> getFood(String animal) throws Exception;
}

