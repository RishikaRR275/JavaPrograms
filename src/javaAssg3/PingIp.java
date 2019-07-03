package javaAssg3;
import java.io.IOException;
import java.net.InetAddress;
import java.util.GregorianCalendar;

public class PingIp {
    static long sendPingRequest(String ipAddress) throws IOException {
        InetAddress inet = InetAddress.getByName(ipAddress);

        System.out.println("Sending Ping Request to " + ipAddress);

        long finish = 0;
        long start = new GregorianCalendar().getTimeInMillis();

        if (inet.isReachable(5000)){
            finish = new GregorianCalendar().getTimeInMillis();
            System.out.println("Ping RTT: " + (finish - start + "ms"));
            return finish-start;
        } else {
            System.out.println(ipAddress + " NOT reachable.");
        }
        return 0;
    }

    public static void main(String[] args) {

        try {
            String ipAddress = "127.0.0.1";
            long totalTime=0;
            for(int i=0 ;i<5 ; i++) {
                long time = sendPingRequest(ipAddress);
                if(time >=0)
                totalTime += time;
            }
            System.out.println("Median time taken to ping = " + totalTime/5L);

        }
        catch ( Exception e ) {
            System.out.println("Exception:" + e.getMessage());
        }
    }
}