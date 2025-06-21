package Week1.Data_Structures_And_Algorithms_Hands_on_01.Code;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ProductSearch searchEngine = new ProductSearch();

        // Add some products
        searchEngine.addProduct(new Product("1", "iPhone 14", "Smartphone"));
        searchEngine.addProduct(new Product("2", "Samsung Galaxy", "Smartphone"));
        searchEngine.addProduct(new Product("3", "MacBook Pro", "Laptop"));
        searchEngine.addProduct(new Product("4", "Nike Running Shoes", "Footwear"));

        // Perform search
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String keyword = sc.nextLine();

        List<Product> results = searchEngine.search(keyword);

        System.out.println("\nSearch Results:");
        if (results.isEmpty()) {
            System.out.println("No matching products found.");
        } else {
            for (Product p : results) {
                System.out.println(p);
            }
        }


        sc.close();
    }
}
