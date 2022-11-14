package Bank;

public class Customer {
    {
        idGenerator++;
    }
    static private long idGenerator = 0;
    private long id = idGenerator, numCreditCard, numBankCheck;
    private String FirstName, LastName, MiddleName;


    public long getNumCreditCard() {
        return numCreditCard;
    }

    public void setNumCreditCard(long numCreditCard) {
        this.numCreditCard = numCreditCard;
    }

    public long getNumBankCheck() {
        return numBankCheck;
    }

    public void setNumBankCheck(long numBankCheck) {
        this.numBankCheck = numBankCheck;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public Customer(long numCreditCard, long numBankCheck, String firstName, String lastName, String middleName) {
        this.numCreditCard = numCreditCard;
        this.numBankCheck = numBankCheck;
        FirstName = firstName;
        LastName = lastName;
        MiddleName = middleName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", numCreditCard=" + numCreditCard +
                ", numBankCheck=" + numBankCheck +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                '}';
    }
}
