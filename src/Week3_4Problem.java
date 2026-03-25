public class Week3_4Problem {

    static int floor(int[] arr, int target) {
        int res = -1;
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] <= target) {
                res = arr[mid];
                low = mid + 1;
            } else high = mid - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 50, 100};

        int f = floor(arr, 30);

        System.out.println("Floor: " + f);
    }
}