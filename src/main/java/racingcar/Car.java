package racingcar;

public class Car {

    private final CarName name;
    private int score;

    public Car(String name) {
        this.name = new CarName(name);
        this.score = 0;
    }

    public void foward(){
        score++;
    }

    public int total(){
        return score;
    }
}
