package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex3_stream.ex3_travle;

import java.util.Arrays;
import java.util.List;



public class TravelTest {
    static void main(String[] args) {
        Customer customer1 = new Customer("이순신",40,100);
        Customer customer2 = new Customer("김유신",10,100);
        Customer customer3 = new Customer("홍길동",23,50);
        Customer customer4 = new Customer("손흥민",32,80);


        List<Customer> customerList = List.of(customer1, customer2, customer3, customer4);
        System.out.println("1. 추가된 순서대로 고객 명단 출력");
        customerList.stream()
                .map(Customer::getName)
                .forEach(c -> System.out.println(c));

        System.out.println("2. 여행 총 비용");

        int sum = customerList.stream()
                .mapToInt(c -> c.getPrice())
                .sum();

        System.out.println(sum);
        System.out.println("3. 30대 이상 명단을 정렬해서 출력");

        customerList.stream()
                .filter(c -> c.getAge() >= 30)
                .map(c -> c.getName())
                .sorted()
                .forEach(name -> System.out.println(name));


    }
}
