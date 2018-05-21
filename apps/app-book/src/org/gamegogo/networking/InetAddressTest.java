package org.gamegogo.networking;

// Demonstrate InetAddress.

import java.net.*;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(address);

        InetAddress[] allByName = InetAddress.getAllByName("www.didyoureadme.azurewebsites.net");
        for (int i = 0; i < allByName.length; i++) {
            System.out.println(allByName[i]);
        }

        allByName = InetAddress.getAllByName("www.nba.com");
        for (int i = 0; i < allByName.length; i++) {
            System.out.println(allByName[i]);
        }

    }
}
