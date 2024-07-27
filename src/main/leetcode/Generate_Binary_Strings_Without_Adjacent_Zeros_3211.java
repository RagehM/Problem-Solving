import java.util.*;
public class Generate_Binary_Strings_Without_Adjacent_Zeros_3211 {
    public ArrayList<String> validStrings(int n) {
        ArrayList<String> arr = new ArrayList<>();
        if(n == 1){
            arr.add("1");
            arr.add("0");
            return arr;
        }
        arr.add("01");
        arr.add("10");
        arr.add("11");
        for(int i = 3; i <=n;i++){
            ArrayList<String> temp = new ArrayList<>();
            for(String s : arr){
                if(s.charAt(s.length()-1) == '1'){
                    temp.add(s+"1");
                    temp.add(s+"0");
                }
                else{
                    temp.add(s+"1");
                }
            }
            arr = temp;
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
