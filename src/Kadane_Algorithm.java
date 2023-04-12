import com.sun.jdi.Value;

public class Kadane_Algorithm {
    public static void main(String[] args) {
    int[] a =new int[]{1,2,34,52,3,-8,-1-22,-13};
    System.out.println(Kadane(a,a.length));
    }

    private static int  Kadane(int[] a, int n) {
        int sum = 0;
        int maxi = a[0];
        for (int j : a) {
            sum += j;
            maxi = Math.max(maxi, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return sum;
    }
}
