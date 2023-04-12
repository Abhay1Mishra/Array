public class Buy_and_sell {
    public static void main(String[] args) {
        int[] a =new int[]{2,3,1,4,15,5};
        int n = a.length;
        System.out.println(buy_sell(a,n));
    }

    private static int buy_sell(int[] a, int n) {
        int sell =a[0];
        int maxProfit = 0;
        for (int i =0; i< n;i++){
            sell =Math.min(sell,a[i]);
            int profit =a[i]-sell;
            maxProfit =Math.max(profit,maxProfit);

        }
        return maxProfit;
    }
}
