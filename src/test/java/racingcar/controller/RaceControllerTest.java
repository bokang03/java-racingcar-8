package racingcar.controller;

import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RaceControllerTest {

    RaceController raceController = new RaceController();
    String carName = "pobi,woni,jun";

    @Test
    void 자동차_이름_등록() {
        List<Car> carNames = raceController.addCar(carName);
        for(Car car : carNames) {
            System.out.println("Car Name: " + car.getName());
        }
    }

    @Test
    void 랜덤_숫자_부여() {
        List<Car> cars = raceController.addCar(carName);
        for (Car car : cars) {
            raceController.tryForward(car);
            System.out.println(car.getName() + "차량이 부여 받은 점수 : " + car.getScore());
        }
    }

    @Test
    void 실행_결과_출력() {
        List<Car> cars = raceController.addCar(carName);
        System.out.println("실행 결과");
        raceController.racingStart(5);
    }

    @Test
    void 차량_최고_점수_조회() {
        System.out.println("실행 결과");
        List<Car> cars = raceController.addCar(carName);
        raceController.racingStart(5);
        System.out.println("최고 점수 : " + raceController.findMaxScore(cars));
    }

    @Test
    void 우승자_출력() {
        List<Car> cars = raceController.addCar(carName);
        raceController.racingStart(5);
        System.out.println("최종 우승자 : ");
        int winnerScore = raceController.findMaxScore(cars);
        raceController.winnerPrint(winnerScore);
    }
}