package ChainOfResponsibility.ChainOfResponsibilityTest01;

public class DirectorBudgetManager extends BaseBudgetHandler{
    public CustomerBudget handle(CustomerBudget budget){
        if(budget.total <= 10_000){
            System.out.println("Diretor tratou");
            budget.approved = true;
            return budget;
        }
        return super.handle(budget);
    }
}
