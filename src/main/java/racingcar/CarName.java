package racingcar;

public class CarName {
    private static final int MAX_NAME_LENGTH = 5;
    private String name;

    public CarName(String name) {
        if (name == null||name.isBlank()) {
            throw new IllegalArgumentException("자동차 이름을 입력해주세요.");
        }
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 " + MAX_NAME_LENGTH +"자 이하만 가능합니다.");
        }
        this.name = name;
    }
}
