//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            // Create first items
            Product item1 = new Product("Papaya", "c123", 8.5);
            Product item2 = new Product("melon", "c456", 4.8);
            Product item3 = new Product("Papa", "c789", 10.2);
            Product item4 = new Product("Yuca", "b123", 3.4);
            Product item5 = new Product("Avocado", "b456", 8.0);
            Product item6 = new Product("Dragon Fruit", "b789", 15.5);
            Product item7 = new Product("Passion Fruit", "a123", 11.0);


            // All items in the array
            Product [] items = {item1, item2, item3, item4, item5, item6};

            //Create the "La cosecha" Store.
            Store la_Cosecha = new Store("La Cosecha", items);
            // Show products after create store.
            la_Cosecha.displayProducts();

            la_Cosecha.addProduct(item7);

            la_Cosecha.displayProducts();

            la_Cosecha.findProduct("b123");




    }
}