package Overriding;

import java.net.InetAddress;
import java.net.UnknownHostException;

//import static sun.jvm.hotspot.debugger.win32.coff.DebugVC50X86RegisterEnums.IP;

public class JavaCodeSeeIpadress {
    public static void main(String[] args) {

        try {
            InetAddress IP = InetAddress.getLocalHost();

            System.out.println("IP is of My System is:" + IP.getAddress());
        } catch (UnknownHostException ue) {
            ue.printStackTrace();
        }
    }
}
