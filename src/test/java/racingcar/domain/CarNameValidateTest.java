package racingcar.domain;

import org.junit.jupiter.api.Test;
import racingcar.validate.CarNameValidate;

import java.util.List;

class CarNameValidateTest {

    @Test
    void 이름_공백_검증() {
        List<String> names = List.of("pobi", "bokang", " ");

        for (String name : names) {
            try {
                CarNameValidate carNameValidate = new CarNameValidate(name);
                System.out.println(name + " : 성공");
            } catch (IllegalArgumentException e) {
                System.out.println(name +" : " + e.getMessage());
            }
        }
    }
}
