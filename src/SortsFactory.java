public class SortsFactory implements ISortsFactory {
    /**
     * @see ISortsFactory#BubbleSort(int[])
     */
    @Override
    public int[] BubbleSort(int[] data) {
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
     * @see ISortsFactory#SelectionSort(int[])
     */
    @Override
    public int[] SelectionSort(int[] data) {
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
}
