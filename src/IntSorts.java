public class IntSorts {
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Пирамидальная сортировка
    public void heapSort(int[] array) {
        if (array == null) return;
        if (array.length < 2) return;
        int length = array.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(array, length, i);
        }
        for (int i = length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    // Просеивание кучи
    private void heapify(int array[], int length, int i) {
        int root = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < length && array[i] < array[left]) {
            root = left;
        }
        if (right < length && array[root] < array[right]) {
            root = right;
        }
        if (root != i) {
            int temp = array[root];
            array[root] = array[i];
            array[i] = temp;
            heapify(array, length, root);
        }
    }

    // Быстрая сортировка
    public void quickSort(int[] array) {
        if (array == null) return;
        if (array.length < 2) return;
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int left, int right) {
        int leftPosition = left;
        int rightPosition = right;
        if (left < 0 || right >= array.length) return;
        int pivot = array[(leftPosition + rightPosition) / 2];
        do {
            while (array[leftPosition] < pivot) {
                leftPosition++;
            }
            while (array[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }

        } while (leftPosition <= rightPosition);
        if (leftPosition < right) {
            quickSort(array, leftPosition, right);
        }
        if (rightPosition > left) {
            quickSort(array, left, rightPosition);
        }
    }

    // Сортировка пузырьком
    public void bubbleSort(int[] array) {
        if (array == null) return;
        if (array.length < 2) return;
        boolean flag = true;
        int i = 0;
        int temp;
        while (flag && i < array.length - 1) {
            flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            i++;
        }
    }
}
