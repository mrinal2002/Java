import java.util.*;
import java.math.*;

class Result {
    // Return the element that will be left in the array after the game ends
    static long subtractionGame(long[] arr) {
        // Write your code here
        ArrayList<Long> a = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            long sub = arr[i] - arr[i + 1];
            System.out.println(sub);
            a.add(sub);
        }
        if (a.size() == 1) {
            return a.get(0);
        }
        boolean flag = true;
        while (flag = true) {
            ArrayList<Long> b = new ArrayList<>();
            for (int i = 0; i < a.size() - 1; i++) {
                long sub = a.get(i) - a.get(i + 1);
                System.out.println(sub);
                b.add(sub);
            }
            if (b.size() == 1) {
                flag = false;
                return b.get(0);
            }
            a.clear();
            System.out.println(a.size());
            a = b;
            b.clear();
        }
        return a.get(0);
    }
}

class Main {
    public static void main(String[] args) {
        int i, n;
        Scanner s = new Scanner(System.in);
        n = Integer.parseInt(s.nextLine().trim());
        long a[] = new long[n];
        for (i = 0; i < n; i++)
            a[i] = s.nextLong();
        System.out.print(Result.subtractionGame(a));
    }
}