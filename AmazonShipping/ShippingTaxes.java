import java.util.Objects;

public class ShippingTaxes {
    private String location;
    private double tax;

    public void setLocationTax(String location){
        if (Objects.equals(location, "europe")){
            tax = 35;
        }
        else if (Objects.equals(location, "north america")){
            tax= 5;
        }
        else if (Objects.equals(location, "south america")){
            tax=25;
        }
        else if (Objects.equals(location, "asia")){
            tax=30;
        }
        else if (Objects.equals(location, "oceania")){
            tax= 45;
        }
        else if (Objects.equals(location, "africa")){
            tax=35;
        }
        else {
            tax=15;
        }
    }

    public double getLocationTax(){
        return tax;
    }
}
