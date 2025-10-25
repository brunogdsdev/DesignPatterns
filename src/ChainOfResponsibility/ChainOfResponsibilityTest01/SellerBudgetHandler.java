package ChainOfResponsibility.ChainOfResponsibilityTest01;

public class SellerBudgetHandler extends BaseBudgetHandler{

    public CustomerBudget handle(CustomerBudget budget){
        if(budget.total <= 1_000){
            System.out.println("Vendedor tratou");
            budget.approved = true;
            return budget;
        }
        return super.handle(budget);
    }
}
