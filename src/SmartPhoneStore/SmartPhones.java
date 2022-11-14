package SmartPhoneStore;

import java.util.LinkedList;

public class SmartPhones {
    private LinkedList<SmartPhone> smartPhones = new LinkedList<>();

    public void add(SmartPhone smartPhone){
        smartPhones.add(smartPhone);
    }

    public void printCompany(Companies companies){
        for (SmartPhone smartPhone:smartPhones){
            if(smartPhone.getCompany().equals(companies))
                System.out.println(smartPhone);
        }
    }

}
