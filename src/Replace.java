import java.util.*;

public class Replace {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");
        System.out.println(map);
        map.replace("val2",map.get("val1"));
        map.replace("val1","");
        System.out.println("after modification");
        System.out.println(map);

    }
}
