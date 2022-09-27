package assignments.q2;

import java.util.Objects;

public class Product implements Comparable<Product>{
   private int productId;
    private String productName;
    private int productPrice;

    public Product(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if ( this.productPrice > o.productPrice )
            return -1 ;
        else if ( this.productPrice < o.productPrice )
            return 1 ;
        return 0 ;
    }
}
