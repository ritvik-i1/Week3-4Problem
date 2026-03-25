import java.util.*;

public class Week3_4Problem {

    static class Asset {
        String name;
        double returnRate;

        Asset(String n, double r) {
            name = n;
            returnRate = r;
        }
    }

    public static void main(String[] args) {
        List<Asset> list = new ArrayList<>();
        list.add(new Asset("AAPL", 12));
        list.add(new Asset("TSLA", 8));
        list.add(new Asset("GOOG", 15));

        list.sort(Comparator.comparingDouble(a -> a.returnRate));

        for (Asset a : list)
            System.out.println(a.name + ":" + a.returnRate);
    }
}