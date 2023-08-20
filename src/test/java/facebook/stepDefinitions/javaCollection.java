package facebook.stepDefinitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class javaCollection {
    public static void main(String args[]) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Java");
        myMap.put(2, "JavaFX");
        myMap.put(3, "CoffeeScript");
        myMap.put(4, "TypeScript");

        ArrayList<String> valueList = new ArrayList<String>(myMap.values());
        System.out.println(valueList.get(0));

        for (String value: valueList){
            System.out.println(value);
        }
    }
}
