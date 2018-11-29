package Bai2;

public class Main {
    public static void main (String[] args){
        int[] a = {1,3,-6,2,-9,15};
        BubbleSort bs = new BubbleSort();
        bs.sortInc(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("\n");
        InsertionSort is = new InsertionSort();
        is.sortDec(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
