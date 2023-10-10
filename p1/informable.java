package p1;

public interface informable {

    default public void Info() {
        System.out.println("Number is not found" );
    }

}
