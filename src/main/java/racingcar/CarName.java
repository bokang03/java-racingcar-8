package racingcar;

public class CarName {
    private static final int MAX_NAME_LENGTH = 5;
    private String name;

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
}
