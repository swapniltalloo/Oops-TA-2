public class Main {
    public static void main(String[] args) {
        exp2 s1 = new exp2();
        exp2 s2 = new exp2("SWAPNIL", 18);
        s1.display();
        s2.display();

        s1 = null;
        s2 = null;
        System.gc();
    }
}