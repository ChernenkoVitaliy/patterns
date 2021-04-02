package cv.com.company.behavioral.chain_of_responsibility;

public class ApplicationSupportEngineer extends SupportEngineer{

    public ApplicationSupportEngineer() {
        type = TYPE_APPLICATION;
    }

    @Override
    protected void process(String msg) {
        //...
    }
}
