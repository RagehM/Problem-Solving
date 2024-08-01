public class Number_of_Senior_Citizens_2678 {
    public int countSeniors(String[] details) {
        int c = 0;
        // 11 13
        for(int i = 0; i < details.length; i++){
            if(Integer.parseInt(details[i].substring(11,13)) > 60){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {

    }
}
