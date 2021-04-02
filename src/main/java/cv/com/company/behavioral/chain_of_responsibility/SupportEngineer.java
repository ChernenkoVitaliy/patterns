package cv.com.company.behavioral.chain_of_responsibility;

public abstract class SupportEngineer {
    public static final int TYPE_BASIC = 1;
    public static final int TYPE_FINANCIAl = 2;
    public static final int TYPE_APPLICATION = 3;

    protected int type;
    protected SupportEngineer next;

    public void setNext(SupportEngineer next) {
        this.next = next;
    }

    public void message(String msg, int type) {
        if (type == this.type) {
            process(msg);
        } else if (next != null) {
            next.message(msg, type);
        }
    }

    protected abstract void process(String msg);
}
