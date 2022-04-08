package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HelloData { // json 파싱 객체

    private String username;
    private int age;
}
