public class TestVisitorClient {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.accept(new PizzaIngredientDisplayVisitor());
    }

}
