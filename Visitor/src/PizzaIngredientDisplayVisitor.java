public class PizzaIngredientDisplayVisitor implements PizzaIngredientVisitor{

    @Override
    public void visit(Cheese cheese){
        System.out.println("Cheese");
    }

    @Override
    public void visit(Dough dough){
        System.out.println("Dough");
    }

    @Override
    public void visit(Sauce sauce){
        System.out.println("Sauce");
    }

    @Override
    public void visit(Sausage sausage){
        System.out.println("Sausage");
    }


}