public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{6, 4, 3, 7, 8, 9, 3, 7, 9, 2, 1, 0, 12, 0};
        IntSorts sorts = new IntSorts();
        sorts.printArray(array);
        array = sorts.mergeSort(array);
        sorts.printArray(array);

    }
}