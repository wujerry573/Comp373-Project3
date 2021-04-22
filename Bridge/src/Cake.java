public abstract class Cake {
    protected Choice choice;

    public Cake(Choice c){
        this.choice = c;
    }

    abstract public void addChoice();

}
