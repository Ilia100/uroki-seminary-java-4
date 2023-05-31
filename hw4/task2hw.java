// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя

package hw4;

import java.util.Arrays;
import java.util.LinkedList;

public class task2hw {
    private static LinkedList<Integer> existingList = new LinkedList(Arrays.asList(1, 2, 3));

    public static void main(String[] args) {
        enqueue(4);
        int number = dequeue();
        int firstnum = first();
        System.out.println(number);
        System.out.println(firstnum);
        System.out.println(existingList);

        System.out.printf("Size = %d\n", size());
    }

    public static int size() {
        return existingList.size();
    }

    public static void enqueue(int element) {
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = 0; i < size(); i++)
            newList.add(existingList.get(i));
        newList.add(element);
        existingList = newList;
    }

    public static int dequeue() {
        LinkedList<Integer> newList = new LinkedList<>();
        int num;
        for (int i = 1; i < size(); i++)
            newList.add(existingList.get(i));
        num = existingList.get(0);
        existingList = newList;
        return num;
    }

    public static int first() {
        int firstNumber;
        firstNumber = existingList.get(0);
        return firstNumber;
    }
}
