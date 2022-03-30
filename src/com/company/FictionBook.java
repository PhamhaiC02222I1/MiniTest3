package com.company;

public class FictionBook extends Book{
    private String categogy;

    public FictionBook(){}

    public FictionBook(String categogy) {
        this.categogy = categogy;
    }

    public FictionBook(int bookCode, String name, int price, String author, String categogy) {
        super(bookCode, name, price, author);
        this.categogy = categogy;
    }

    public String getCategogy() {
        return categogy;
    }

    public void setCategogy(String categogy) {
        this.categogy = categogy;
    }

    @Override
    public String toString() {
        return "FictionBook extended Book class: "+ super.toString()+"" +
                "categogy='" + categogy + '\'' +
                '}';
    }
}
