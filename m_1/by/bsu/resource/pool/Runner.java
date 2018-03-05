package m_1.by.bsu.resource.pool;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;
import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) throws Exception {
        LinkedList<AudioChannel> list = new LinkedList<AudioChannel>(){
            {
                thistest.add(new AudioChannel(771));
                thistest.add(new AudioChannel(883));
                thistest.add(new AudioChannel(550));
                thistest.add(new AudioChannel(337));
                thistest.add(new AudioChannel(442));
            }
        };
        ChannelPoll<AudioChannel> pool = new ChannelPoll<>(list);
        for (int i = 0; i < 20; i++) {
            new Client(pool).start();
        }
        DriverManager.registerDriver((Driver) Class.forName("oracle.jdbc.OracleDriver").newInstance());
       Enumeration en = DriverManager.getDrivers();
        while (en.hasMoreElements()){
            System.out.println("JDBC Driver = "+ en.nextElement());
        }
    }
}
