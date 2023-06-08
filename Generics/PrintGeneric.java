
public class PrintGeneric<T> {

    private T thingToPrint;

    public PrintGeneric(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println("The item to print" + thingToPrint);
    }
}
