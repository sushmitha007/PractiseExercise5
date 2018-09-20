import java.util.*;
public class CountString {
    public static void main(String[] args) {
        String text = "one one -one___two,,three,one @three*one?two";
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        String[] words = text.split(" |___|,|@|\\*|\\?|-");
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();
            System.out.println(words[i]);
            if (key.length() > 0) {
                if (map.get(key) == null) {
                    map.put(key, 1);
                } else {
                    int value = map.get(key).intValue();
                    value++;
                    map.put(key, value);
                }
            }
        }
        System.out.println(map);
    }
}

