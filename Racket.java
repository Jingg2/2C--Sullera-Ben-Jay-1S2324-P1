class Racket {
    private double price;
    private String brand;
    private String category;
    public String name;

    Racket() {

    }

    Racket(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getCategory() {
        return this.category;
    }

    public void display() {
        System.out.println();
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Category: " + this.category);
    }

    public void f() {
        System.out.println("make some feedback to the products: ");
    }

}
