// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package hw4;

import java.util.Arrays;
import java.util.LinkedList;


public class task1hw {
    public static void main(String[] args) {
        LinkedList<Integer> existingList = new LinkedList(Arrays.asList(1, 2, 3));
        LinkedList<Integer> newList = new LinkedList<>();
        System.out.println(existingList);
        newList=turn(existingList);
        System.out.println(newList);

    }

    public static LinkedList<Integer> turn(LinkedList<Integer> existingList) {
        LinkedList<Integer> tempList = new LinkedList<>();
        
        while (!existingList.isEmpty()) {
            tempList.add(existingList.getLast());
            existingList.removeLast();
        }
        return tempList;
    }
}