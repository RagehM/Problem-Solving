import java.util.HashMap;

public class Sor_Characters_By_Frequency_451 {
    private static char get_key(HashMap<Character, Integer> map){
        char res = 0;
        int max = -1;
        for(char key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                res = key;
            }
        }
        return res;
    }

    public static String frequencySort(String s) {
        String res = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        while(map.size() > 0) {
            char key = get_key(map);
            int count = map.get(key);
            while(count-- > 0) {
                res += key;
            }
            map.remove(key);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
}
