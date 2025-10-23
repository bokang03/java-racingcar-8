package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private final CarName name;
    private int score;

    public CarName getName() {
        return name;
    }

    public Car(String name) {
        this.name = new CarName(name);
        this.score = 0;
    }

    public int score(){
        return score;
    }

    public void tryForward() {
        int randomNum = Randoms.pickNumberInRange(0, 9);
        if (randomNum >= 4) {
            score++;
        }
    }

    public void printStatus() {
        System.out.print(name + " : ");
        for (int i = 0; i < score; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

}
