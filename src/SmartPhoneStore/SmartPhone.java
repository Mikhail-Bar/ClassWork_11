package SmartPhoneStore;

public class SmartPhone {
    private Companies company;
    private String model , seller;
    private Os os;
    private double weight, displaySize;
    private String color;

    public Companies getCompany() {
        return company;
    }

    public void setCompany(Companies company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SmartPhone(SmartPhoneStore.Companies company, String model, String seller, SmartPhoneStore.Os os, double weight, double displaySize, String color) {
        this.company = company;
        this.model = model;
        this.seller = seller;
        this.os = os;
        this.weight = weight;
        this.displaySize = displaySize;
        this.color = color;
    }

    @Override
    public String toString() {
        return  "Company: " + company +
                "\nModel: " + model +
                "\nOs: " + os +
                "\nWeight: " + weight +
                "\nDisplaySize: " + displaySize;
    }
}

;
