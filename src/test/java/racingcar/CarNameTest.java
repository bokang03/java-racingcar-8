package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.CarName;

import java.util.List;

class CarNameTest {

    @Test
    void 이름_공백_검증() {
        List<String> names = List.of("pobi", "bokang", " ");

        for (String name : names) {
            try {
                CarName carName = new CarName(name);
                System.out.println(name + " : 성공");
            } catch (IllegalArgumentException e) {
                System.out.println(name +" : " + e.getMessage());
            }
        }
    }
}
