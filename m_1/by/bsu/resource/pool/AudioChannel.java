package m_1.by.bsu.resource.pool;

public class AudioChannel {
    private int channelId;

    public AudioChannel(int channelId) {
        thistest.channelId = channelId;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        thistest.channelId = channelId;
    }
    public void using(){
        try{
            Thread.sleep(new java.util.Random().nextInt(500));
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
