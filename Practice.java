//Kailyn Kim 2/2/26 Wrapper class
import java.util.*;
public class Practice{
    
public static void main(String[] args) {
    Integer i = 30;
    Double d = 40.3;
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);
    int it = i;
    double dou = d;
    System.out.println(i*d);

    ArrayList<String>list = new ArrayList<String>();
    list.add("Michael");
    list.add("Jessica");
    list.add("Lee");
    list.add(1,"Sarah");
    String store = list.set(2,"Mary");
    System.out.println(store);
    String store2 = list.get(3);
    System.out.println(store2);
    String store3 = list.remove(1);
    System.out.println(store3);
    int s = list.size();
    System.out.println(s);
    
    System.out.println(list);
}

}