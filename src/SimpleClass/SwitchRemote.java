package SimpleClass;

public class SwitchRemote extends Switch {


    @Override
    public String toString() {
        String s = super.toString();

        return s + " remote" ;
    }

    public void runProgram(int num){

        switch (num){
            case 0:
                System.out.println("OFF");
                break;
            case 1:
                System.out.println("Program 1");
                break;
            case 2:
                System.out.println("Program 2");
                break;
            case 3:
                System.out.println("Program 3");
                break;

        }
    }


}
