package cv.com.company.behavioral.chain_of_responsibility;

public class BasicSupportEngineer extends SupportEngineer{

    public BasicSupportEngineer() {
        type = TYPE_BASIC;
    }

    @Override
    protected void process(String msg) {
        //...
    }
}
