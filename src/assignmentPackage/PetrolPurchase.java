package assignmentPackage;

public class PetrolPurchase {

    private String petrolStationLocation;
    private String petrolType;
    private int petrolQuantity;
    private double pricePerLitre;
    private double discount;
    public PetrolPurchase (String petrolStationLocation, String petrolType, int petrolQuantity, double pricePerLitre, double discount) {
        this.petrolStationLocation = petrolStationLocation;
        this.petrolType = petrolType;
        this.petrolQuantity = petrolQuantity;
        this.pricePerLitre = pricePerLitre;
        this.discount = discount;
    }
    public void setPetrolStationLocation(String petrolStationLocation){
        this.petrolStationLocation = petrolStationLocation;
        }
    public String getPetrolStationLocation(){
        return petrolStationLocation;
        }
    public void setPetrolType(String petrolType){
        this.petrolType = petrolType;
    }
    public String getPetrolType(){
        return petrolType;
    }
    public void setPetrolQuantity(int petrolQuantity){
        this.petrolQuantity = petrolQuantity;
    }
    public int getPetrolQuantity(){
        return petrolQuantity;
    }
    public void setPricePerLitre(double pricePerLitre){
        this.pricePerLitre = pricePerLitre;
    }
    public double getPricePerLitre(){
        return pricePerLitre;
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }
    public double getDiscount(){
        return discount;
    }
    public double getPurchaseAmount(){
        double purchaseAmount = petrolQuantity * (pricePerLitre - discount);
        return purchaseAmount;
        }
public static void main(String[] args) {
    PetrolPurchase myPurchase = new PetrolPurchase("Victoria Island", "Diesel", 25, 800.00, 15.50);
    System.out.printf("%nI got this %d fuel at %s, for %,.2f per litre, %n though there was a discount of %,.2f per litre, I eventually paid a total of %,.2f.", myPurchase.getPetrolQuantity(),
            myPurchase.getPetrolStationLocation(), myPurchase.getPricePerLitre(), myPurchase.getDiscount(), myPurchase.getPurchaseAmount());
}

}
