public class MergeSort {
    int [] array;

    public MergeSort(int [] arr){
        this.array = arr;
    }

    /**
     * This method will help merging
     * the left and the right sorted
     * array into one sorted array
     */
    public void mergeSubArrays(int m, int l, int r){
        //sizes of both the arrays
        int leftArraySize = m - l + 1;
        int rightArraySize = r - m;

        int []left = new int[leftArraySize];
        int []right = new int[rightArraySize];

        for (int i = 0; i < leftArraySize; i++) {
            left[i] = array[l + i];
        }

        for (int i = 0; i < rightArraySize; i++) {
            right[i] = array[m + i + 1];
        }

        int lI = 0;
        int rI = 0;
        int mI = l;

        while(lI < leftArraySize && rI < rightArraySize){
            if (left[lI] <= right[rI]){
                array[mI] = left[lI];
                lI++;
            } else {
                array[mI] = right[rI];
                rI++;
            }
            mI++;
        }

        while(lI < leftArraySize){
            array[mI] = left[lI];
            lI++;
            mI++;
        }

        while(rI < rightArraySize){
            array[mI] = right[rI];
            rI++;
            mI++;
        }
    }


    public void sort(int l, int r){
        if (l < r){
            int m = (l + r)/2;
            sort(l, m);
            sort(m + 1, r);
            mergeSubArrays(m, l, r);

        }
    }

    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
