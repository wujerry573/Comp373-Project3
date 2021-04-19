public class Cheese implements PizzaIngredient{

    @Override
    public void accept(PizzaIngredientVisitor pizzaIngredientVisitor) {
        pizzaIngredientVisitor.visit(this);
    }
}
