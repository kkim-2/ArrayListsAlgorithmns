import java.util.*;

import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        ArrayList<String>arr = new ArrayList<String>();
        arr.add("as");
        arr.add("hi");
        arr.add("you");
        System.out.println();
        System.out.println(reverseThis(arr));
    }
    public static ArrayList<String> reverseThis(ArrayList<String>arr){
        ArrayList<String>reversed = new ArrayList<String>();
        for(int i=arr.size()-1;i>=0;i--){
            reversed.add(arr.get(i));
        }

        return reversed;
    }
}
