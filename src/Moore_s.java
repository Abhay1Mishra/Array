public class Moore_s {
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 8, 6, 6, 6, 6};
        int n = 8;

        System.out.println(findMajority(arr, n));
        System.out.println(moore_s(arr,n));
    }

    private static int moore_s(int[] arr, int n) {
        int ele = 0;
        int count = 0;
        for (int k : arr) {
            if (count == 0) {
                ele = k;
            }
            if (ele == k) {
                count++;
            } else
                count--;
        }
        count =0;
        for (int j : arr) {
            if (ele == j) {
                count++;
            }
        }
        if (count>n/2){
            return ele;
        }
        return -1;
    }

    private static int findMajority(int[] arr, int n) {
        for(int i = 0; i < n; i++)
        {
            int count = 1;

            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }

            if(count > n / 2)
                return i;
        }

        return -1;
    }
}
