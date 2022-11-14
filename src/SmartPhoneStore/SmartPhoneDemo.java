package SmartPhoneStore;

public class SmartPhoneDemo {
    public static void main(String[] args) {
    SmartPhones smartPhones = new SmartPhones();
    smartPhones.add(new SmartPhone(Companies.Apple,"Iphone 13", "5 Element",Os.IOS,4.14,5.0,"Red"));
    smartPhones.add(new SmartPhone(Companies.Samsung,"S21", "5 Element",Os.Android,5.1,6.1,"Black"));
    smartPhones.add(new SmartPhone(Companies.Sony,"Xperia", "5 Element",Os.Android,3.3,2.1,"White"));

        System.out.println("TABLE - SmartPhone");
    smartPhones.printCompany(Companies.Apple);
    }
}
