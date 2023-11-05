package DataStructures;

import java.util.Arrays;

public class Vector {
    private Object[] data;
    private int count;

    public Vector(int capacity) {
        data = new Object[capacity];
        count = 0;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Object get(int index) {
        return data[index];
    }

    public void set(int index, Object obj) {
        data[index] = obj;
    }

    public boolean contains(Object obj) {
        for (int i = 0; i < count; i++) {
            if (data[i] == obj) return true;
        }
        return false;
    }

    public void addFirst(Object item) {
        // add your code
        for (int i = count; i > 0; i--) {
            data[i] = data[i - 1];
        } // shift all element to the right 1 digit
        data[0] = item;
        count++;
    }

    public void addLast(Object o) {
        data[count] = o;
        count++;
    }

	/*
	public boolean binarySearch(Object key)
	{
	int start = 0;
	int end = count - 1;
	while(start <= end)
	{
		int middle = (start + end + 1) / 2;
		if(key < data[middle]) end = middle -1;
		else if(key > data[middle]) start = middle + 1;
		else return true;
	}
	return false;
	}
	*/

    public Object getFirst() {
        // add your code
        return data[0];
    }

    public Object getLast() {
        // add your code
        return data[count - 1];
    }

    public void removeLast() {
        // add your code
        data[count - 1] = null;
        count--;
    }

    public void removeFirst() {
        // add your code
        data[0] = null;
        for (int i = 1; i < count; i++) {
            data[i - 1] = data[i];
        } // shift all elements to the left 1 digit
        data[count - 1] = null;
        count--;
    }

    public void printAll() {
        for (Object element : data
        ) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

}
