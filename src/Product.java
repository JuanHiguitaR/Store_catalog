public record Product(String name, String code, Double price) {
    // Constructor for each product.

    // To easy print all info.
    @Override
    public String toString() {
        return String.format("Name: %s  Code: %s  Price: %.2f%n", name(),
                code(), price());
    }
}
