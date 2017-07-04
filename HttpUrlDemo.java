import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by DMyrzaka on 04.07.2017.
 */
public class HttpUrlDemo {
    public static void main(String[] args) throws IOException{
        System.setProperty("http.proxyHost","172.20.20.220");
        System.setProperty("http.proxyPort","8080");

        URL hp = new URL("http://www.google.kz");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
        System.out.println("Метод запроса: "+hpCon.getRequestMethod());
        System.out.println("Код ответа: "+hpCon.getResponseCode());
        System.out.println("Сообщение ответа: "+hpCon.getResponseMessage());
        Map<String,List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nЗдесь следует заголовок:");

        for (String k : hdrField){
            System.out.println("Key: "+k+" Value : "+hdrMap.get(k));
        }
    }
}
