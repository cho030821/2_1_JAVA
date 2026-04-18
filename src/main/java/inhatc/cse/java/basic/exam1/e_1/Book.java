package main.java.inhatc.cse.java.basic.exam1.e_1;

class Book {
    private String title;
    private int price;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;

    }
}
