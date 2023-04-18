package book;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] Authors;
    private Double price;
    private int qty = 0;

    public Book(String name, Author[] authors, Double price) {
        this.name = name;
        Authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, Double price, int qty) {
        this.name = name;
        Authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return Authors;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder();
        for (Author i: Authors){
            ans.append(i.toString());
            if(i != Authors[Authors.length-1]){
                ans.append(", ");
            }
        }
        return String.format("Book[name=%s, authors={%s}, price=%.2f, qty=%d", name, ans.toString(), price, qty);
    }

    public String getAuthorNames(){
        StringBuilder ans = new StringBuilder();
        for (Author i: Authors){
            ans.append(i.getName());
            if (i != Authors[Authors.length-1]){
                ans.append(", ");
            }
        }
        return ans.toString();
    }
}
