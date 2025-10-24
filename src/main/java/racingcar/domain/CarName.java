package racingcar.domain;

import java.util.List;

public class CarName {
    private static final int MAX_NAME_LENGTH = 5;
    private String name;

    public String getName() {
        return name;
    }

    public CarName(String name) {
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

    public static void validateDuplicateNames(List<CarName> carNames) {
        for (int i = 0; i < carNames.size(); i++) {
            for (int j = i + 1; j < carNames.size(); j++) {
                if (carNames.get(i).name.equals(carNames.get(j).name)) {
                    throw new IllegalArgumentException("중복된 자동차 이름이 있습니다: " + carNames.get(i).name);
                }
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
