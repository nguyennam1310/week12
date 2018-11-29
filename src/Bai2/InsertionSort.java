package Bai2;

public class InsertionSort implements SortInterface {
    @Override
    public void sortInc(int inputArray[]){
        int n = inputArray.length;
        for (int i=1; i<n; ++i)
        {
            int key = inputArray[i];
            int j = i-1;

            while (j>=0 && inputArray[j] > key)
            {
                inputArray[j+1] = inputArray[j];
                j = j-1;
            }
            inputArray[j+1] = key;
        }
    }

    @Override
    public void sortDec(int[] inputArray) {
        int n = inputArray.length;
        for (int i=1; i<n; ++i)
        {
            int key = inputArray[i];
            int j = i-1;

            while (j>=0 && inputArray[j] < key)
            {
                inputArray[j+1] = inputArray[j];
                j = j-1;
            }
            inputArray[j+1] = key;
        }
    }
}
