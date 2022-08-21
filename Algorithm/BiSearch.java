package Algorithm;

public class BiSearch {
    public static void main(String[] args) {
        int [] arr = {2, 4, 5,6, 7, 8, 9, 12, 23, 45, 67,68, 78, 87,111,244,542,566,678,788,888};
        int target = 78;
        System.out.println(biSearch(arr, target));
    }

    private static int biSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right){
            mid = left + (right - left) / 2;
            if(arr[mid] == target){

                return mid;
            }
            if(arr[mid] < target){
                left = mid + 1;
            } else{
                right = mid -1;
            }
        }
    return -1;
    }
}
