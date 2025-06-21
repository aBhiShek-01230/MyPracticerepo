package Week1.Data_Structures_And_Algorithms_Hands_on_01.Code;

public class Product {
    String id;
    String name;
    String category;

    public Product(String id, String name, String category) {
        this.id = id;
        this.name = name.toLowerCase();
        this.category = category.toLowerCase();
    }

    public String toString() {
        return "Product{" + "id='" + id + "', name='" + name + "', category='" + category + "'}";
    }
}
