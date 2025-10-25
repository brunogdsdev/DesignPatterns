package ChainOfResponsibility.ChainOfResponsibilityTest01;

public abstract class BaseBudgetHandler {

    protected BaseBudgetHandler nextHandler = null;

    public CustomerBudget handle(CustomerBudget budget){
        if(this.nextHandler != null) return this.nextHandler.handle(budget);
        return budget;
    }

    public BaseBudgetHandler setNextHandler(BaseBudgetHandler handler){
        this.nextHandler = handler;
        return handler;
    }

    


}
