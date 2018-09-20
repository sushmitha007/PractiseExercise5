import java.util.TreeMap;

public class CountBoolean {
    public static void main(String[] args) {
        String[] words = {"a","b","c","d","a","c","c"};
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        TreeMap<String, String> map1 = new TreeMap<String, String>();
       // String[] words = text.split(",");
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();
            System.out.println(words[i]);
            if (key.length() > 0) {
                if (map.get(key) == null) {
                    map.put(key, 1);
                    map1.put(key,"false");
                } else {
                    int value = map.get(key).intValue();
                    value++;
                    if(value>=2){
                    map1.put(key,"true");}
                    else if(value<2){
                        map1.put(key,"false");}
                }
            }
        }
        System.out.println(map1);
    }
}
