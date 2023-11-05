import DataStructures.Vector;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ISortsFactory sortFactory = new SortsFactory();
        int[] testData = new int[]{10, 3, 5, -4, 7};
        System.out.println(Arrays.toString(sortFactory.bubbleSort(testData)));
        int[] testData2 = new int[]{10, 3, 5, -4, 7};
        System.out.println(Arrays.toString(sortFactory.selectionSort(testData)));
        int[] testData3 = new int[]{10, 3, 5, -4, 7};
        System.out.println(Arrays.toString(sortFactory.mergeSort(testData)));

        vectorTest();

//        UserInput user = new UserInput();
//        user.getUserAge();

    }

    public static void vectorTest() {
        Vector vector = new Vector(4);
        System.out.println("--Current size: " + vector.size() + "---");

        System.out.println("---Testing addFirst(5)---");
        vector.addFirst(5);
        System.out.println("---Current size: ---" + vector.size() + "---");
        System.out.println("---Current vector---");
        vector.printAll();

        System.out.println("---Testing addFirst(6)---");
        vector.addFirst(6);
        System.out.println("---Current size: ---" + vector.size() + "---");
        System.out.println("---Current vector---");
        vector.printAll();

        System.out.println("---Testing addLast(2)---");
        vector.addLast(2);
        System.out.println("---Current size: ---" + vector.size() + "---");
        System.out.println("---Current vector---");
        vector.printAll();

        System.out.println("---Testing addLast(7) while array is full---");
        vector.addLast(7);
        System.out.println("---Current size: ---" + vector.size() + "---");
        System.out.println("---Current vector---");
        vector.printAll();

        System.out.println("---Testing get(0)---");
        System.out.println(vector.get(0));

        System.out.println("---Testing set(1, 10)---");
        vector.set(1, 10);
        System.out.println("---Current vector---");
        vector.printAll();

        System.out.println("---Testing contains(10)---");
        System.out.println(vector.contains(10));

        System.out.println("---Testing getFirst()---");
        System.out.println(vector.getFirst());

        System.out.println("---Testing getLast()---");
        System.out.println(vector.getLast());

        System.out.println("---Testing removeFirst()---");
        vector.removeFirst();
        System.out.println("---Current size: ---" + vector.size() + "---");
        System.out.println("---Current vector---");
        vector.printAll();

        System.out.println("---Testing removeLast()---");
        vector.removeLast();
        System.out.println("---Current size: ---" + vector.size() + "---");
        System.out.println("---Current vector---");
        vector.printAll();
    }

}
