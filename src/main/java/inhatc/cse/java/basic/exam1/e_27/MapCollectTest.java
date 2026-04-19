package main.java.inhatc.cse.java.basic.exam1.e_27;



import java.util.*;
import java.util.stream.Collectors;

public class MapCollectTest {
    public static void main(String[] args) {
        List<UserInfo> users = Arrays.asList(
                new UserInfo("김영희", 30),
                new UserInfo("이영희", 40),
                new UserInfo("박영희", 50)
        );
        // TODO: stream().filter().map().collect() 사용\
        Object collect = users.stream()
                .filter(user -> user.getAge() >= 40)
                .map(userInfo -> userInfo.getName())
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}