import java.util.*;
public class UpdateArray {
    public static void main(String[] args) {
        List<String> string=new ArrayList<>();
        string.add("Apple");
        string.add("Grape");
        string.add("Melon");
        string.add("Berry");
        System.out.println("initial array");
        for(String s:string)
            System.out.println(s);

        string.set(0,"Kiwi");
        string.set(2,"Mango");
        System.out.println("updated array");
        for(String s:string)
            System.out.println(s);
        string.removeAll(string);
        System.out.println("array after deletion");
        for(String s:string)
            System.out.println(s);

    }
}
