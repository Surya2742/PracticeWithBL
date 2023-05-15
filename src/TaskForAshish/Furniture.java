package TaskForAshish;

public class Furniture {
    public Furniture() {
    }

    public Furniture(String type, String material, int price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    String type;
    String material;
    int price;

    public int calculateDiscount() {
        switch (material) {
            case "wood" -> {
                return (int) (price * 0.10);
            }
            case "glass" -> {
                return (int) (price * 0.15);
            }
            case "steel" -> {
                return (int) (price * 0.20);
            }
        }
        return 0;
    }

    public void printFurnitureDetails() {
        System.out.println("The selected Furniture is a " + type + " made of " + material + " with discounted Price of Rs." + (price - calculateDiscount()));
    }

    public static void main(String[] args) {
        Furniture f1 = new Furniture("Sofa", "wood", 4000);
        System.out.println("The discount for selected " + f1.material + " furniture is of Rs." + f1.calculateDiscount());
        Furniture f2 = new Furniture("Stairs", "steel", 3000);
        System.out.println("The discount for selected " + f2.material + " furniture is of Rs." + f2.calculateDiscount());
        f1.printFurnitureDetails();
        f2.printFurnitureDetails();
    }
}
