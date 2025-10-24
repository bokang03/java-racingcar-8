package racingcar.domain;

public class Car {

    private final CarName name;
    private int score;

    public Car(String name) {
        this.name = new CarName(name);
        this.score = 0;
    }

    public CarName getName() {
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
