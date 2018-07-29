package trainingTest02_Encapsulation;

public class FruitDetails {
    private String fruitName;
    private String color;
    private double price;

    //Declaration of the Constructor.
    public FruitDetails (String fruitName, String color, double price)
    {
        this.fruitName = fruitName;
        this.color = color;
        this.price = price;
    }

    //Declaration of setters methods.
    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
    public void  setColor (String color) {
        this.color = color;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //Declaration of the getters methods.
    public String getFruitName() {
        return fruitName;
    }
    public String getColor () {
        return color;
    }
    public double getPrice() {
        return price;
    }
}

