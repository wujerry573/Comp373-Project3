public class Sauce implements PizzaIngredient{

    @Override
    public void accept(PizzaIngredientVisitor pizzaIngredientVisitor) {
        pizzaIngredientVisitor.visit(this);
    }
}
