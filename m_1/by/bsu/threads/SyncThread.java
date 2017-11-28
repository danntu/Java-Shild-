package m_1.by.bsu.threads;

public class SyncThread extends Thread{
    private Resource resource;

    public SyncThread(String name, Resource rs){
        super(name);
        this.resource =rs;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.writing(getName(),i);
        }
    }
}
