package assignments.q2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Product> products = new PriorityQueue<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of products: ");
        int n = input.nextInt();
        for(int i = 0;i<n;i++){
            System.out.println("Enter Product id: ");
            int id = input.nextInt();
            System.out.println("Enter Product name: ");
            String name = input.next();
            System.out.println("Enter Product price: ");
            int price = input.nextInt();
            products.add(new Product(id,name,price));
        }
        Iterator<Product> it = products.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
