package main;

public class Sorters {
    private static int[] arr;

    public Sorters(int[] arr) {
        this.arr = arr;
    }

    public int[] bubbleSort() {
        for (int i = 1; i < arr.length; ++i) {
            for (int j = arr.length - 1; j >= i; --j) {
                if (arr[j - 1] < arr[j]) {
                    int var = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = var;
                }
            }
        }

        return arr;
    }

    public int[] selectSort() {
        int index = 0;
        int min = 0;

        for (int i = 0; i < arr.length; ++i) {
            min = arr[i];
            index = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }


            if (arr[index] != arr[i]) {
                arr[index] = arr[i];
                arr[i] = min;
            }
        }


        return arr;
    }

    public int[] insertSort() {
        int elementOfFirstArr, firstElSecArr;
        for (int i = 0; i < arr.length; ++i) {
            firstElSecArr = arr[i];
            for (elementOfFirstArr = i - 1; elementOfFirstArr >= 0 && arr[elementOfFirstArr] > firstElSecArr; --elementOfFirstArr) {
                arr[elementOfFirstArr + 1] = arr[elementOfFirstArr];
            }
            arr[elementOfFirstArr + 1] = firstElSecArr;
        }
        return arr;
    }

    public int[] shakeSort() {
        int left = 1, right = arr.length - 1;

        do {
            for (int i = right; i >= left; --i) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }

            ++left;

            for (int i = left; i < right; ++i) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
            right--;
        }
        while (left <= right);

        return arr;
    }

    public static void main(String[] args) {

        arr = new int[]{2, 9, 4, 6, 3, 8, 1};

        Sorters sorters = new Sorters(arr);

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        arr = sorters.shakeSort();

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }

}
