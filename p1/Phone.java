package p1;

public abstract class Phone implements Cloneable, Callable,informable {
    private String number;

    private String name;

    private String model;

    int weigth;


    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }


    public String getNumber() {
        return number;

    }

    public void setNumber(String number) {
        this.number = number;
    }


    public Phone(String number, String model, int weigth) {
        this.number = number;
        this.model = model;
        this.weigth = weigth;

    }

    public Phone(String name) {
        this.name = name;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        System.out.println("Vhodiashiy zvonok");
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Phone) super.clone();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                " name=" + name +
                " model=" + model +
                " weigth=" + weigth +
                '}';
    }
}