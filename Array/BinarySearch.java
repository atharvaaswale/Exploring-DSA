public class BinarySearch {

    public static int bSearch(in[]arr, int t) {
        int start = 0;
        int end = arr.length - 1;

        while (start<= end) {
            
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //size 56
        int[] array = {
            2, 4, 7, 11, 12, 15, 17, 20, 24, 26,
            30, 33, 36, 40, 42, 45, 48, 52, 55, 58,
            61, 63, 66, 70, 73, 76, 80, 83, 86, 90,
            94, 97, 101, 105, 108, 111, 115, 119, 123, 127,
            131, 135, 139, 143, 147, 151, 155, 159, 163, 167};
        int target = 119;
        //System.out.print(array.length);
        int result = binarySearch(array, target);

        if (result != -1) {
            System.out.print("Result found at: " + result);
        } else {
            System.out.print("Result not found");
        }
    }
}