public class Pizza implements PizzaIngredient{

    Pizza[] pizzas;

    public Pizza() {
        pizzas = new Pizza[] {new Cheese(), new Sauce(), new Sausage(), new Dough()};
    }

    @Override
    public void accept(PizzaIngredientVisitor pizzaIngredientVisitor) {
        for (int i = 0; i < pizzas.length; i++) {
            pizzas[i].accept(pizzaIngredientVisitor);
        }
        pizzaIngredientVisitor.visit(this);
    }
}
