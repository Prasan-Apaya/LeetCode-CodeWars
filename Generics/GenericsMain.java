public class GenericsMain {
    public static void main(String[] args) {

        PrintGeneric<Integer> printGeneric = new PrintGeneric<Integer>(123);
        printGeneric.print();
    }
}
