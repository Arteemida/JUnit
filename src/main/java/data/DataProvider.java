package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataProvider {
    public static String getRandomString() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Canada");
        stringList.add("USA");
        stringList.add("Ukraine");
        return stringList.get(new Random().nextInt(stringList.size()));
    }

    public static Integer getRandomInt() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(15);
        integerList.add(20);
        integerList.add(33);
        return integerList.get(new Random().nextInt(integerList.size()));
    }
}
