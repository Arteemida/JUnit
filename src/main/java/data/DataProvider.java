package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataProvider {
    static List<String> stringList = new ArrayList<>();
    static List<Integer> integerList = new ArrayList<>();

    static {
        stringList.add("Canada");
        stringList.add("USA");
        stringList.add("Ukraine");

        integerList.add(15);
        integerList.add(20);
        integerList.add(33);
    }

    public static String getRandomString() {
        return stringList.get(new Random().nextInt(stringList.size()));
    }

    public static Integer getRandomInt() {
        return integerList.get(new Random().nextInt(integerList.size()));
    }
}
