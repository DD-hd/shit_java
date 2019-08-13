import java.util.Arrays;

class ArrayClass {
    public static void main(String[] args) {
        // 使用一维数组
        int[] day = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        for (int i = 0; i < 12; i++) {
            System.out.println((i + 1) + "月有" + day[i] + "天");
        }

        int[] times=new int[day.length];
        System.out.println("times的len："+times.length);

        // 使用二维数组
        int b[][] = new int[][] { { 1 }, { 2, 3 }, { 4, 5, 6 } };
        for (int k = 0; k < b.length; k++) {
            for (int c = 0; c < b[k].length; c++) {
                System.out.print(b[k][c]);
            }
            System.out.println();
        }

        // Array.fill
        int arr[] = new int[] { 45, 12, 2, 10 };
        Arrays.fill(arr, 1, 2, 8);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + i + "个元素是：" + arr[i]);
        }

        // Array.sort
        int arr1[] = new int[] { 23, 42, 12, 8 };
        Arrays.sort(arr1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Array.copyOf Array.copyOfRange
        int arr2[] = new int[] { 23, 42, 12 };
        int newArr[] = Arrays.copyOf(arr2, 5);
        int newArr1[] = Arrays.copyOfRange(arr2, 0, 6);
        System.out.println("newArr copyOf");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

        System.out.println("newArr copyOfRange");
        for (int i = 0; i < newArr1.length; i++) {
            System.out.println(newArr1[i]);
        }

        // Array.binarySearch
        int[] arr3 = new int[] { 4, 23, 10 };
        Arrays.sort(arr3);
        int index = Arrays.binarySearch(arr3, 0, 3, 4);
        System.out.println("binarySearch:" + index);

    }
}