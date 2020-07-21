package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input) {
        String answer = "";
        if (input % 2 == 1) {
            return answer +=  "Weird";
        }
        else if (input % 2 == 0) {
            if (2 <= input && input<= 5)
            {
                return answer += "Not Weird";
            }
            else if(6 <= input && input <= 20){
                return answer += "Weird";
            }
            else if(input > 20){
                return answer += "Not Weird";
            }
            return answer += "Not Weird";
        }
        return answer;
    }
}
