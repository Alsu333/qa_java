package com.example;
import java.util.List;

public class Lion {
    private IFeline felineInter; // создали в зависимом классе поле того же типа что интерфейс, теперь объект Feline это поле класса Lion
    private boolean hasMane;
    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
    public Lion(IFeline felineInter){ // внедрение зависимости через конструктор
        this.felineInter = felineInter; // объект попадает в переменную класса
    }
    public int getKittens() {
        return felineInter.getKittens();
    }
    public boolean doesHaveMane() {
        return hasMane;
    }
    public List<String> getFood() throws Exception {
        return felineInter.getFood("Хищник");
    }
}
