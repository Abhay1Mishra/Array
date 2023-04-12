public class Main {
    public static void main(String[] args) {
        int n =4;
        int count =1;
        int[][] arr =new int[n][n];
        for (int i =0;i<arr.length;i++){
            for (int j =0;j< arr.length;j++){
                arr[i][j]=count++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}