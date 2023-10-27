public interface ISortsFactory {
    /**
     * One of the most common used sort: The idea is:
     * Step 1: Compare the first pair of element and swap if the first is larger than the second
     * Step 2: Compare the sub pairs and swap if needed, ensure the largest is at the end of the list
     * Step 3: Keep repeating Step 1 and Step 2 until there are no more pairs to compare
     * Complexity: n^2
     * Properties: In-place and stable
     * @param data: unsorted list
     * @return: sorted list
     */
    public int[] BubbleSort(int[] data);

    /**
     * Idea: Divide the unsorted list into sorted part at the front and sorted part at the end
     * Step 1: Find the smallest element in the unsorted list by selecting the first element then comparing with each element until finding the candidate
     * Step 2: Swap the smallest element found with the first element in the unsorted list
     * Step 3: Repeat Step 1 and Step 2 until only one element remains in the sorted list
     * Complexity: n^2
     * Properties: In-place and stable
     * @param data: unsorted list
     * @return: sorted list
     */
    public int[] SelectionSort(int[] data);
}
