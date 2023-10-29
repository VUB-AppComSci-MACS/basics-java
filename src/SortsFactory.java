import java.util.Arrays;

public class SortsFactory implements ISortsFactory {
    /**
     * @see ISortsFactory#bubbleSort(int[])
     */
    @Override
    public int[] bubbleSort(int[] data) {
        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp; //do the swap
                }
            }
        }
        return data;
    }

    /**
     * @see ISortsFactory#selectionSort(int[])
     */
    @Override
    public int[] selectionSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int candidate = data[i];
            int candidate_index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < candidate) {
                    candidate = data[j];
                    candidate_index = j; // replace the candidate if there's smaller element
                }
            }
            int temp = data[i];
            data[i] = candidate;
            data[candidate_index] = temp; // do the swap
        }
        return data;
    }

    /**
     * @see ISortsFactory#mergeSort(int[])
     */
    @Override
    public int[] mergeSort(int[] data) {
        if (data.length <= 1) {
            return data;
        }
        int middle = data.length / 2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[data.length - middle];
        System.arraycopy(data, 0, leftArr, 0, middle);
        System.arraycopy(data, middle, rightArr, 0, data.length - middle);

        mergeSort(leftArr);
        mergeSort(rightArr);

        int i = 0, j = 0, k = 0; // merge 2sub-lists
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                data[k++] = leftArr[i++];
            } else {
                data[k++] = rightArr[j++];
            }
        }
        while (i < leftArr.length) {
            data[k++] = leftArr[i++];
        }

        while (j < rightArr.length) {
            data[k++] = rightArr[j++];
        }

        return data;
    }
}
