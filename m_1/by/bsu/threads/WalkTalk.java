package m_1.by.bsu.threads;

public class WalkTalk {
    public static void main(String[] args) {
        TalkThread talk = new TalkThread();
        Thread walk = new Thread(new WalkRunnable());
        talk.start();
        walk.start();
        talk.getState().toString();
    }
}
