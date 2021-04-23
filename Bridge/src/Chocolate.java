public class Chocolate extends Cake {
    public Chocolate(Choice c){
        super(c);
    }
    @Override
    public void addChoice(){
        //print out chocolate cake text
        System.out.println("Chocolate cake size: ");
        //print out choice
        choice.addChoice();
    }
}
