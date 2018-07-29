package trainingTest02_Encapsulation;

public class Fruit {
    public static void main(String[] args) {
        FruitDetails apple = new FruitDetails ("Apple", "Red", 10.5);

        //Using getters value
        System.out.println("Name: " + apple.getFruitName() + "  Color: " + apple.getColor() + "  Price: " + apple.getPrice());

        //Updating fruit info.
        apple.setColor("Green");
        apple.setPrice(8.5);

        System.out.println("After updating: " + "Name: " + apple.getFruitName() + " Color: " + apple.getColor() + " Price: " + apple.getPrice());
    }
}
