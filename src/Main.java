public class Main {

    public static void main(String[] args) {

        int [] array = {7, 9, 4, 6, 3, 5, 1, 2, 8, 0};
        MergeSort m = new MergeSort(array);
        m.sort(0, array.length - 1);
        m.print();
    }
}
