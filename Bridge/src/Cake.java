public abstract class Cake {
    protected Choice choice;

    //Constructor with choice parameter
    public Cake(Choice c){
        this.choice = c;
    }

    //Method to show the choice selected
    abstract public void addChoice();

}
