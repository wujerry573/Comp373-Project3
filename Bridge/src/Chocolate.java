public class Chocolate extends Cake {
    public Chocolate(Choice c){
        super(c);
    }
    @Override
    public void addChoice(){
        System.out.println("Chocolate cake size: ");
        choice.addChoice();
    }
}
