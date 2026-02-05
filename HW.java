import java.util.*;

public class HW {

  public static int Sums(ArrayList<Integer>arr){
    int sums = 0;    
    for(int i:arr){
            sums+= i;
        }

        return sums;
   }
  public static double Averages(ArrayList<Integer>arr){
    int sums = 0;   
    double averages = 0; 
    for(int i:arr){
            sums+= i;
        }
    averages = (double)(sums)/arr.size();
    return averages;
        
   }
  
  public static int Max(ArrayList<Integer>arr){
    int max = 0;    
    for(int i:arr){
            if(i>max){
              max = i;
            }
        }

        return max;
   }
     public static int Min(ArrayList<Integer>arr){
    int min = arr.get(0);    
    for(int i:arr){
            if(i>min){
              min = i;
            }
        }

        return min;
   }
      public static void main(String[] args) {
    ArrayList<Integer>ints = new ArrayList<>();
    for(int i = 0; i<50; i++){
        ints.add((int)Math.random()*50);
    }

    System.out.println(Sums(ints));
    System.out.println(Averages(ints));
    System.out.println(Max(ints));
    System.out.println(Min(ints));
   }

}
