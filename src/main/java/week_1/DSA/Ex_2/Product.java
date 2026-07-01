package week_1.DSA.Ex_2;

public class Product {
    String productName;
    String category;
    int productId;
    public Product(String name,String category,int Id){
        productName=name;
        this.category=category;
        productId=Id;
    }

    @Override
    public String toString() {
        return productName;
    }
}
