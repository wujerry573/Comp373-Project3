public class Pizza implements PizzaIngredient{

    PizzaIngredient[] pizzas;

    public Pizza() {
        pizzas = new PizzaIngredient[] {new Cheese(),new Dough(), new Sauce(), new Sausage() };
    }

    @Override
    public void accept(PizzaIngredientVisitor pizzaIngredientVisitor) {
        for (int i = 0; i < pizzas.length; i++) {
            pizzas[i].accept(pizzaIngredientVisitor);
        }
        pizzaIngredientVisitor.visit(this);
    }
}
