package racingcar.domain;

public class RacingConutValidate {

    public static int countValidate(int count){
        if (count <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1회 이상이어야 합니다.");
        }
        return count;
    }
}
