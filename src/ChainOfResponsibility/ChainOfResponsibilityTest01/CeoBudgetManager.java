package ChainOfResponsibility.ChainOfResponsibilityTest01;

public class CeoBudgetManager extends BaseBudgetHandler{
    public CustomerBudget handle(CustomerBudget budget){
        System.out.println("CEO tratou");
        budget.approved = true;
        return budget;

    }
}
