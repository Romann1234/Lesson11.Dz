package p1;


public class SamsungPhone extends Phone {

    public SamsungPhone(String number, String model, int weigth) {
        super(number, model, weigth);
    }
    public SamsungPhone(String name) {
        super( name);
    }

    @Override
    public void receiveCall() {
        System.out.printf("Zvonit: %s \n", getName() );
    }

    @Override
    public void Info() {
        System.out.printf("number: %s \n model: %s \n weith: %d \n--------\n", getNumber(), getModel(), weigth);
    }
}