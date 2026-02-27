public class SmallestValue {
    public static void main(String[] args) {
        int[][] arr = {{2,2,2,2},{2,1,1,4}};
        System.out.println(Smallest(arr));
    }
    public static double Smallest(int[][]arr){
        int small = arr[0][0];
        int sum =0;
        for(int col = 0; col<arr[0].length;col++){
            for(int row = 0;row<arr.length;row++){
                if(arr[row][col]<small){
                    small = arr[row][col];
                }
            }
            sum +=small;
            small = arr[0][col];
        }
        double average = (double)sum / arr[1].length;
        return average;
    }
}
