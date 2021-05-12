package demo05;

import java.util.ArrayList;
import java.util.List;

public class Demo05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List tempList =list ; //泛型的擦除
        tempList.add(1212);
        System.out.println(tempList);
    }
}
