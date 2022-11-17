package SimpleClass;

public class Switch {

    protected boolean turned;

    public boolean isTurned() {
        return turned;
    }

    public void setTurned(boolean turned) {
        this.turned = turned;
    }

    @Override
    public String toString() {
        return  "Switch{" +
                "turned=" + turned +
                '}';
    }

    public void runProgram(int num){}
}
