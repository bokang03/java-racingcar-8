package racingcar.validate;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    
    @Test
    void 이름_중복_검사() {
        List<CarNameValidate> names = List.of(
                new CarNameValidate("pobi"),
                new CarNameValidate("woni"),
                new CarNameValidate("pobi")
        );
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> CarNameValidate.validateDuplicateNames(names)
        );
        assertEquals("중복된 자동차 이름이 있습니다: pobi", exception.getMessage());
    }
}
