package practice;

import java.util.ArrayList;

public class generics <T>{
    private  T value;
    public T getValue(){
        return  value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

