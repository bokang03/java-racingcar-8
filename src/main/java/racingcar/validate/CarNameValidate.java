package racingcar.validate;

import java.util.List;

public class CarNameValidate {
    private static final int MAX_NAME_LENGTH = 5;
    private String name;

    public String getName() {
        return name;
    }

    public CarNameValidate(String name) {
        this.name = name;
        validateNameBlank(name);
        validateNameLength(name);
    }

    public void validateNameBlank(String name){
        if (name == null||name.isBlank()) {
            throw new IllegalArgumentException("자동차 이름을 입력해주세요.");
        }
    }

    public void validateNameLength(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 " + MAX_NAME_LENGTH +"자 이하만 가능합니다.");
        }
    }

    public static void validateDuplicateNames(List<CarNameValidate> carNameValidates) {
        for (int i = 0; i < carNameValidates.size(); i++) {
            for (int j = i + 1; j < carNameValidates.size(); j++) {
                if (carNameValidates.get(i).name.equals(carNameValidates.get(j).name)) {
                    throw new IllegalArgumentException("중복된 자동차 이름이 있습니다: " + carNameValidates.get(i).name);
                }
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
