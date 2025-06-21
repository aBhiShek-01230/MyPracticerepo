package Week1.Data_Structures_And_Algorithms_Hands_on_01.Code;

import java.util.*;

public class ProductSearch {
    List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    // search by name
    public List<Product> search(String keyword) {
        List<Product> result = new ArrayList<>();
        keyword = keyword.toLowerCase();

        for (Product p : productList) {
            if (p.name.contains(keyword)) {  
                result.add(p);
            }
        }
        return result;
    }
}
