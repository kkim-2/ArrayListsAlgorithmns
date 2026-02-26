//Kailyn Kim 2/2/26 2D practice
public class TwoDPractice {
    public static void main(String[] args) {
        int[][] arr = {{1,3,4},{3,4,3},{2,3,4},{3,3,2}};
       Elements(arr);
    }
    public static void Elements(int[][]arr){
        for(int row = 0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
