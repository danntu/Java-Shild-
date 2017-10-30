package m_1.by.bsu.enums;

public class MelomanRunner {
    public static void main(String[] args) {
        MusicStyle ms = MusicStyle.BLUES;
        System.out.println(ms);
        switch (ms){
            case JAZZ:
                System.out.println(" is Jazz");
                break;
            case CLASSIC:
                System.out.println(" is Classic");
                break;
            case ROCK:
                System.out.println(" is Rock");
                break;
            default:
                System.out.println("Unknown music style: "+ms);
        }
    }
}
