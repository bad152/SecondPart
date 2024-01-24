package ru.app.logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Model implements Serializable{

    private static final Model instance = new Model();
    private final Map<Integer, Math> model;




    public static Model getInstance(){
        return instance;
    }
    public Model() {
        model = new HashMap<>();

    }

    int result = 0;

    public void itog(Integer a, Integer b, Character math) {

        if (math == '*'){
            result = a * b;
        }else if(math == '/'){
            result = a / b;
        }else if(math == '+') {
            result = a + b;
        } else {
            result = a - b;
        }

    }

    public int getFromList(){
        return result;
    }

}
