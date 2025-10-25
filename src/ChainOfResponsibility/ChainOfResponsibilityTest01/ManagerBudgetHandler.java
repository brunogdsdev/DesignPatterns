package ChainOfResponsibility.ChainOfResponsibilityTest01;

public class ManagerBudgetHandler extends BaseBudgetHandler{
    public CustomerBudget handle(CustomerBudget budget){
        if(budget.total <= 5_000){
            System.out.println("Gerente tratou");
            budget.approved = true;
            return budget;
        }
        return super.handle(budget);
    }
}
