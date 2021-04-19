public interface PizzaIngredientVisitor {
    public void visit(Cheese cheese);
    public void visit(Dough dough);
    public void visit(Sauce sauce);
    //Finish implementing other visit methods
}
