public class Week3_4Problem {

    static class Client {
        String name;
        int risk;

        Client(String name, int risk) {
            this.name = name;
            this.risk = risk;
        }
    }

    static void insertionSort(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].risk < key.risk) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Client[] arr = {
                new Client("A", 20),
                new Client("B", 50),
                new Client("C", 80)
        };

        insertionSort(arr);

        System.out.println("Sorted Desc:");
        for (Client c : arr)
            System.out.println(c.name + ":" + c.risk);
    }
}