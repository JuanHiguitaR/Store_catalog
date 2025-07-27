

public class Store {
    private final String name;
    private final Product[] products;
    private int prodCount;

    // Constructor for the store
    public Store(String name, Product[] initialProd) {
        this.name = name;
        //Initialize the array
        this.products = new Product[10];
        this.prodCount = 0;

        // Add the initial products to the catalog
        for(Product product : initialProd){ // Used ForEach
            // Check if there's space before adding
            if (this.prodCount < this.products.length){
                this.products[prodCount] = product;
                this.prodCount ++;
            }else{
                break;
            }
        }

    }

    // Getter name
    public String getName() {
        return name;
    }

    // Adds a new product to the store's catalog.
    public void addProduct(Product products) {
        // check if is the array is full
        if (this.prodCount == this.products.length) {System.out.println("Catalog Full.❌");}
        // Add new product
        else{
            this.products[prodCount] = products;
            System.out.println("Add new product successful!✅");
        }

    }
    //Displays all products currently in the store's catalog.
    public void displayProducts(){
        System.out.println(".:===  Catalog for " + getName() + "  ===:.");
        // Check if catalog is empty.
        if (this.prodCount == 0){
            System.out.println("No products in the catalog ❌");
        }else{
            // Show all elements in the store's catalog.
            for (Product item : this.products) { // Used ForEach
                System.out.println(item);
            }
        }

    }
    //Searches for a product by its code in the catalog.
    public void findProduct(String code){
        if(this.prodCount != 0){
            for (Product item : this.products) {  // Used ForEach
                if (item.code().equals(code)){
                    System.out.println(item);
                }
            }
        }
        System.out.println("No products in the catalog ❌");

    }

}
