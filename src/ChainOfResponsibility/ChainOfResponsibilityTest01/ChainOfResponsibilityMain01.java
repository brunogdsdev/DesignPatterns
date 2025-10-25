package ChainOfResponsibility.ChainOfResponsibilityTest01;

public class ChainOfResponsibilityMain01 {
    public static void main(String[] args) {
        CustomerBudget customer = new CustomerBudget(100_001);

        SellerBudgetHandler seller = new SellerBudgetHandler();

        seller.setNextHandler(new ManagerBudgetHandler()).setNextHandler(new DirectorBudgetManager()).setNextHandler(new CeoBudgetManager());

        System.out.println(seller.handle(customer));

    }
}
