package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분합니다.)");
        String carNameInput = Console.readLine();

        System.out.println("시도할 횟수");
        int racingCount = Integer.parseInt(Console.readLine());

        List<Car> cars = new ArrayList<Car>();
        for (String name : carNameInput.split(",")) {
            cars.add(new Car(name));
        }

        System.out.println("실행결과");
        for (int i = 0; i < racingCount; i++) {
            for(Car car : cars) {
                car.tryForward();
                car.printStatus();
            }
            System.out.println();
        }

        int winnerScore = findMaxScore(cars);
        System.out.print("최종 우승자 : ");

        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.score() == winnerScore) {
                winners.add(car.getName().toString());
            }
        }
        System.out.print(String.join(", ", winners));
    }

    private static int findMaxScore(List<Car> cars){
        int max = 0;
        for (Car car : cars) {
            if (car.score() > max) {
                max = car.score();
            }
        }
        return max;
    }
}
