package m_1.by.bsu.resource.pool;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList<AudioChannel> list = new LinkedList<AudioChannel>(){
            {
                this.add(new AudioChannel(771));
                this.add(new AudioChannel(883));
                this.add(new AudioChannel(550));
                this.add(new AudioChannel(337));
                this.add(new AudioChannel(442));
            }
        };
        ChannelPoll<AudioChannel> pool = new ChannelPoll<>(list);
        for (int i = 0; i < 20; i++) {
            new Client(pool).start();
        }
    }
}
