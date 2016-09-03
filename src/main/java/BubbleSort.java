import java.util.Random;

public class BubbleSort {

    public void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int[] arrayA = bubbleSort.generateRandomIntArray(1000);
        int[] arrayB = bubbleSort.generateRandomIntArray(10000);
        int[] arrayC = bubbleSort.generateRandomIntArray(100000);

        bubbleSort.sort(arrayA);
        bubbleSort.sort(arrayB);
        bubbleSort.sort(arrayC);
    }

    public BubbleSort() {

    }

    public int[] sort(int[] intArray) {

        int n = intArray.length;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (intArray[j - 1] > intArray[j]) {
                    swapValues(intArray, j);
                }
            }
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Bubble sort took " + executionTime + "ms");

        return intArray;
    }

    public int[] generateRandomIntArray(int size) {
        int[] randomArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt();
        }
        return randomArray;
    }

    private void swapValues(int[] intArray, int j) {
        int temp;
        temp = intArray[j - 1];
        intArray[j - 1] = intArray[j];
        intArray[j] = temp;
    }

}