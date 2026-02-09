import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        ArrayList <Integer>list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(2);
    }
    public static boolean FindDuplicates(ArrayList<Integer>arr){
        int num = arr.get(0);
        boolean duplicate = false;
        for(int i:arr){
            if(num==i){
                duplicate = true;
            }
        }
        return duplicate;
    }
}
