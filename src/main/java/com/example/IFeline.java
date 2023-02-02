package com.example;
import java.util.List;

public interface IFeline { // создали общий интерфейс
    public int getKittens();
    public List<String> getFood(String animal) throws Exception;
}

