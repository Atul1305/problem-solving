package java8;

import java.util.*;

public class test {

    public static void main(String[] args) {
        List<String> paycodeDto = Arrays. asList("12", "gsh", "13.5");
        check(paycodeDto);
    }

    public static void check(List<String> paycodeDto) {
        paycodeDto.stream().forEach(fVal -> {
            try {
                Float.parseFloat(fVal);
            } catch (Exception e) {
                throw new RuntimeException("invalid format");
            }
        });
    }
}
