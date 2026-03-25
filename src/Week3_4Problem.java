public class Week3_4Problem {

    static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"accB", "accA", "accB", "accC"};

        int index = linearSearch(arr, "accB");

        System.out.println("Found at index: " + index);
    }
}