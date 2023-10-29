import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ISortsFactory sortFactory = new SortsFactory();
        int[] testData = new int[]{10, 3, 5, -4, 7};
        System.out.println(Arrays.toString(sortFactory.bubbleSort(testData)));
        int[] testData2 = new int[]{10, 3, 5, -4, 7};
        System.out.println(Arrays.toString(sortFactory.selectionSort(testData)));
        int[] testData3 = new int[]{10, 3, 5, -4, 7};
        System.out.println(Arrays.toString(sortFactory.mergeSort(testData)));
    }

}
