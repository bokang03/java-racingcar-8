package racingcar.controller;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RaceController {

    List<Car> cars = new ArrayList<>();

    public List<Car> addCar(String names) {
        for (String name : names.split(",")) {
            cars.add(new Car(name));
        }
        return cars;
    }

    public void tryForward(Car car) {
        int randomNum = Randoms.pickNumberInRange(0, 9);
        if (randomNum >= 4) {
            car.forward();
        }
    }

    public void printStatus(Car car) {
        System.out.print(car.getName() + " : ");
        for (int i = 0; i < car.getScore(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void racingStart(int count){
        for (int i = 0; i < count; i++) {
            for(Car car : cars) {
                tryForward(car);
                printStatus(car);
            }
            System.out.println();
        }
    }

    public int findMaxScore(List<Car> cars){
        int max = 0;
        for (Car car : cars) {
            if (car.getScore() > max) {
                max = car.getScore();
            }
        }
        return max;
    }

    public void winnerPrint(int winnerScore){
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getScore() == winnerScore) {
                winners.add(car.getName().toString());
            }
        }
        System.out.print(String.join(", ", winners));
    }
}