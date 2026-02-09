import java.util.*;
public class RemoveThis {
    public static ArrayList<Integer>RemoveThis(ArrayList<Integer>arr){
        
        for(int i = arr.size();i>0;i++){
            if(arr.get(i)==3){
                arr.remove(i);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        //{ 0,1,3,5,3,6,7,3,9,3}. 
        ArrayList<Integer>lists = new ArrayList<Integer>();
        lists.add(0);
        lists.add(1);
        lists.add(3);
        lists.add(5);
        lists.add(3);
        lists.add(6);
        lists.add(7);
        lists.add(3);
        lists.add(9);
        lists.add(3);
        System.out.println(RemoveThis(lists));
    }
    
}


