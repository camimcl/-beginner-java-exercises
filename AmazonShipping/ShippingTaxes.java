public class ShippingTaxes {
    private String location;
    private double tax;

    public void setLocationTax(String location){
        if (location == "europe"){
            tax = 35;
        }
        else if (location == "north america"){
            tax= 5;
        }
        else if (location == "south america"){
            tax=25;
        }
        else if (location == "asia"){
            tax=30;
        }
        else if (location == "oceania"){
            tax= 45;
        }
        else if (location == "africa"){
            tax=35;
        }
        else{
            tax = 15.5;
        }
    }

    public double getLocationTax(){
        return tax;
    }
}
