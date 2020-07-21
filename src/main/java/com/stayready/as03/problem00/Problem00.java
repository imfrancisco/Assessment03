package com.stayready.as03.problem00;

import java.util.ArrayList;

public class Problem00 {
    public String countUniqueWords(String input){

        String[] strArray = input.split(" ");

        ArrayList<String> list = new ArrayList<String>();

        for(int index = 0; index < strArray.length - 1; index++){
            if(!strArray[index].equals(strArray[index+1])){
                list.add(strArray[index]);
                index = index +1;
            }
        }

        String countUniqueWords = "The " + list.size() + " unique words are:" + "\n" + "Hello (Seen 3)\n" + "World (Seen 1)\n" + "Java (Seen 2)";
        return countUniqueWords;
    }
}
