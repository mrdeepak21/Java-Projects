import java.net.Inet4Address;
import java.net.UnknownHostException;

public class IPaddress {

public static void main(String a[])throws UnknownHostException {
    System.out.println(Inet4Address.getLocalHost().getHostAddress());

}


}
