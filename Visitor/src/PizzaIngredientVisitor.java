public interface PizzaIngredientVisitor {
    public void visit(Pizza pizza);
    public void visit(Cheese cheese);
    public void visit(Dough dough);
    public void visit(Sauce sauce);
    public void visit(Sausage sausage);
}
