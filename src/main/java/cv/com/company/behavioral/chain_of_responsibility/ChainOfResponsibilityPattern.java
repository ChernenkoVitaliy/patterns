package cv.com.company.behavioral.chain_of_responsibility;

public class ChainOfResponsibilityPattern {

    static SupportEngineer createChain() {
        SupportEngineer se = new BasicSupportEngineer();

        SupportEngineer fe = new FinancialSupportEngineer();
        se.setNext(fe);

        SupportEngineer ae = new ApplicationSupportEngineer();
        fe.setNext(ae);

        return se;
    }

    public static void main(String[] args) {
        SupportEngineer se = createChain();

        se.message("Some text here", SupportEngineer.TYPE_BASIC);
        se.message("Some another text here", SupportEngineer.TYPE_APPLICATION);
    }
}
