package cv.com.company.behavioral.chain_of_responsibility;

public class FinancialSupportEngineer extends SupportEngineer{

    public FinancialSupportEngineer() {
        type = TYPE_FINANCIAl;
    }

    @Override
    protected void process(String msg) {
        //...
    }
}
