package lessons;

import java.util.HashMap;

public class Cleaner {
    HashMap<Integer, String> numerals = new HashMap<Integer, String>();

    public String treatNumber(int number){
        numerals.put(1, "I");
        numerals.put(5, "V");
        numerals.put(10, "X");

        String answer = "";

        if(numerals.containsKey(number)){
            return numerals.get(number);
        }

        if(number < 5) {
            if(5 - number > 1){
                for(int counter = 0; counter < number; counter++){
                    answer += "I";
                }
            }else {
                answer = "IV";
            }
        }

        if(number > 5 && number < 10) {
            answer = "V";
            if(10 - number > 1){
                for(int counter = 5; counter < number; counter++){
                    answer += "I";
                }
            }else {
                answer = "IX";
            }
        }

        return answer;
    }
}
