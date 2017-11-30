package m_1.by.bsu.resource.pool;

public class Client extends Thread{
    private boolean reading = false;
    private ChannelPoll<AudioChannel> pool;

    public Client(ChannelPoll<AudioChannel> pool){
        this.pool=pool;
    }

    @Override
    public void run() {
        AudioChannel channel =null;
        try{
            channel = pool.getResource(500);
            reading = true;
            System.out.println("Channel Client #"+this.getId()+" took channel #"+channel.getChannelId());
            channel.using();
        } catch (ResourceException e){
            System.out.println("Client #"+this.getId()+" lost ->"+e.getMessage());
        } finally {
            if (channel !=null){
                reading = false;
                System.out.println("Channel Client # "+this.getId()+" : "+channel.getChannelId()+" channel released");
                pool.returnResource(channel);
            }
        }
    }
    public boolean isReading(){
        return reading;
    }
}
