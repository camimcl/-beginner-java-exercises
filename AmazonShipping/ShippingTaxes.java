import java.util.Objects;

public class ShippingTaxes {
    private String location;
    private double tax;

    public void setLocationTax(String location){
        if (location.equalsIgnoreCase ("europe")){
            tax = 35;
        }
        else if (location.equalsIgnoreCase("north america")){
            tax= 5;
        }
        else if (location.equalsIgnoreCase( "south america")){
            tax=25;
        }
        else if (location.equalsIgnoreCase( "asia")){
            tax=30;
        }
        else if (location.equalsIgnoreCase( "oceania")){
            tax= 45;
        }
        else if (location.equalsIgnoreCase( "africa")){
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
