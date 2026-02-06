import java.util.*;

public class Integers {
    public static void main(String[] args) {
        ArrayList <Integer> lists = new ArrayList<Integer>();
        lists.add(5);
        lists.add(2);
        lists.add(4);
        lists.add(3);
        System.out.println(Doubles(lists));
    }
    public static ArrayList<Integer>Doubles(ArrayList<Integer>list){
            
            for(int i=0;i<list.size();i++){
                list.add(list.get(i));
            }
            return list;
    }
}
