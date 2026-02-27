public class Practice2 {
    public static void main(String[] args) {
        int[][] array = {{2,3,4,5},{3,4,5,5},{2,3,4,3}};
        Average(array);
    }
    public static void Average(int[][]arr){
        int sum = 0; 
        int count = 0;
        for(int row = 0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                sum += arr[row][col];
                count++;
            }
            System.out.println("sum of row "+row+" is "+sum);
        
        }
        double average = (double)sum/count;
        System.out.println(average);
        
    }
    public static void Averages(int[][]arr){
        int sum = 0; 
        int count = 0;
        int counter = 0;
        int counts = 0;
        for(int[] row:arr){
            for(int col:row){
                sum += arr[counter][counts];
                count++;
                counts++;
            }
            System.out.println("sum of row "+counter+" is "+sum);
            counter++;
        
        }
        double average = (double)sum/count;
        System.out.println(average);
    }
}
