package com.stayready.as03.problem03;

public class Problem03 {
    public String isPalindrome(String input){

        String reverse = "";
        for(int index = input.length()-1; index >= 0; index--){
            reverse = reverse + input.charAt(index);
        }

        String answer = "";
        if(input.equals(reverse)){
            return answer += "YES";
        }
        else{
            return answer += "NO"; }

    }
}
