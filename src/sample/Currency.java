package sample;

public class Currency {
    //Variables
    private String name;
    private double value;

    //Constructor
    public Currency(String name, double value){
        this.name=name;
        this.value=value;
    }

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
