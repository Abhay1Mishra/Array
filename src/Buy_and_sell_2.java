public class Buy_and_sell_2 {
    public static void main(String[] args) {
        int[] a = new int[]{4,2,5,2,7,3,9,39};
        int n = a.length;
        System.out.println(profit_sell(a,n));
    }

    private static int profit_sell(int[] a, int n) {
        int profit =0;
        for (int i =1  ; i<n; i++){
            if (a[i]>a[i-1]){
                profit = a[i] - a[i-1];
            }
        }
        return profit;
    }
}
