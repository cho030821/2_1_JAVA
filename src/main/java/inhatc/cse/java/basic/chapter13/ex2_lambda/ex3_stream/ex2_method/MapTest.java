package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex3_stream.ex2_method;

import java.util.ArrayList;
import java.util.List;

public class MapTest {
    static void main(String[] args) {
        UserInfo kim = new UserInfo("김영희",30);
        UserInfo lee = new UserInfo("이영희" , 40);
        UserInfo park = new UserInfo("박영희",43);

        List<UserInfo> infos = new ArrayList<>();
        infos.add(kim);
        infos.add(lee);
        infos.add(park);

        infos.stream()
                .filter(user -> user.getAge() >= 40)
                .map(UserInfo::getName)
                .forEach(System.out::println);
    }
}
