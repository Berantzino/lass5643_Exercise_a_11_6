import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class a_11_6 {

    /*
    6. Write a method countUnique that accepts a list of integers as a parameter and returns the number of unique integer
    values in the list. Use a set as auxiliary storage to help you solve this problem. For example, if a list contains the values
    [3, 7, 3, –1, 2, 3, 7, 2, 15, 15], your method should return 5. The empty list contains 0 unique values.
     */

    public static void main(String[] args) {

        List<Integer> testList = new LinkedList<>();

        testList.add(0,3);
        testList.add(1,7);
        testList.add(2,3);
        testList.add(3,-1);
        testList.add(4,2);
        testList.add(5,3);
        testList.add(6,7);
        testList.add(7,2);
        testList.add(8,15);
        testList.add(9,15);

        System.out.println("Expected number of unique values in testList: 5");
        System.out.println("Number of unique values in testList: " + countUnique(testList));


    }

    public static int countUnique(List<Integer> list) {

        Set<Integer> testSet = new HashSet<>(list);

        return testSet.size();
    }
}
