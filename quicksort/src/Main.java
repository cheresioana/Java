public class Main {
    private int array[];
    private int length;
    public void sort_main(int lowerIndex, int higherIndex)
    {
        int i = lowerIndex;
        int j = higherIndex;


        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];

        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int v = array[i];
                array[i] = array[j];
                array[j] = v;
                i++;
                j--;
            }
        }

        if (lowerIndex < j)
            sort_main(lowerIndex, j);
        if (i < higherIndex)
            sort_main(i, higherIndex);

    }
    public void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;

       sort_main(0,inputArr.length - 1);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] i = {24,2,45,20,56,75,2,56,99,53,12};
        Main wht = new Main();
        wht.sort(i);
        for (int x: wht.array
             ) {
            System.out.println(x);

        }
    }


}
