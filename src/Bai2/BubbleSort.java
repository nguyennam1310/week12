package Bai2;

public class BubbleSort implements SortInterface {
    @Override
    public void sortInc(int[] inputArray) {
        int temp;
        for (int i = 0; i < inputArray.length; i++)
            for (int j = 0; j < inputArray.length-1; j++)
                if (inputArray[j] > inputArray[j+1])
                {
                    temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }
    }

    @Override
    public void sortDec(int[] inputArray) {
        int temp;
        for (int i = 0; i < inputArray.length; i++)
            for (int j = 0; j < inputArray.length-1; j++)
                if (inputArray[j] < inputArray[j+1])
                {
                    temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }
    }
}
