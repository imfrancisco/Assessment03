package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    public int compare(Animal animal1, Animal animal2) {
        int answer = 0;
        if (animal1.getSpeed() == animal2.getSpeed()) {
            return answer;
        } else if (animal1.getSpeed() > animal2.getSpeed()) {
            return answer += -7;
        } else if (animal1.getSpeed() < animal2.getSpeed()) {
            return answer +=5;
        }
        return answer;
    }
}
