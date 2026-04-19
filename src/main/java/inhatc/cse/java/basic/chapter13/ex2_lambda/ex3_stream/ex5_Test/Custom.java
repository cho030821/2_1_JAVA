package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex3_stream.ex5_Test;
 // TODO: 고객의 이름 나이 가격
public class Custom {
    String name;
    int price;
    int age;

     @Override
     public String toString() {
         return "Custom{" +
                 "name='" + name + '\'' +
                 ", price=" + price +
                 ", age=" + age +
                 '}';
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getPrice() {
         return price;
     }

     public void setPrice(int price) {
         this.price = price;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public Custom(String name, int price, int age) {
         this.name = name;
         this.price = price;
         this.age = age;
     }
 }
