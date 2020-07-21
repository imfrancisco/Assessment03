package com.stayready.as03.problem02;

import com.sun.imageio.plugins.common.I18N;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        Arrays.sort(ar);

        ArrayList<Integer> list = new ArrayList<Integer>();


        for(int index = 0; index < ar.length-1; index++){
            if(!(ar[index] == ar[index+1]))
            {
                    list.add(ar[index]);
            }
        }
        return list.size();
    }

}

