package racingcar.domain;

import racingcar.validate.CarNameValidate;

public class Car {

    private final CarNameValidate name;
    private int score;

    public Car(String name) {
        this.name = new CarNameValidate(name);
        this.score = 0;
    }

    public CarNameValidate getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void forward() {
        score++;
    }
}
