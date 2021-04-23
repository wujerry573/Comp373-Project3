public class Vanilla extends Cake {
    public Vanilla(Choice c){
        super(c);
    }

    @Override
    public void addChoice(){
        //print out vanilla cake text
        System.out.println("Vanilla cake size: ");
        //print out choice text
        choice.addChoice();
    }
}
