package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.controller.RaceController;
import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분합니다.)");
        String carNameInput = Console.readLine();

        RaceController raceController = new RaceController();
        List<Car> cars = raceController.addCar(carNameInput);

        System.out.println("시도할 횟수");
        int racingCount = Integer.parseInt(Console.readLine());

        System.out.println("실행결과");
        raceController.racingStart(racingCount);

        System.out.print("최종 우승자 : ");
        int winnerScore = raceController.findMaxScore(cars);
        raceController.winnerPrint(winnerScore);
    }
}