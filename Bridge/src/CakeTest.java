public class CakeTest {
    public static void main(String[] args) {
        //initialize new cakes with size choices
        Cake choc= new Chocolate(new Small());
        choc.addChoice();

        Cake vanilla = new Vanilla(new Large());
        vanilla.addChoice();
    }
}
