import Command.*;
import ChainOfRespons.*;
import Observer.*;
import Observer.AppStore;
import State.*;
import Strategy.*;


import java.util.jar.Pack200;

public class Client {

    public static void main(String[] args) {

        System.out.println("STRATEGY");
        TVBox tvBox = new TVBox(new Native());
        System.out.println(" Total value by Native is : " + tvBox.risingVolume(100) + "db");
        tvBox = new TVBox(new ByPhome());
        System.out.println(" Total value by phone is : " + tvBox.risingVolume(150) + "db");
        tvBox = new TVBox(new ByRC());
        System.out.println(" Total value by RC is : " + tvBox.risingVolume(200) + "$");
        System.out.println("\n");

        System.out.println("STATE");
        Mode mode = new Mode();
        ErrorState errorState = new ErrorState();
        errorState.action(mode);
        OffState offState = new OffState();
        offState.action(mode);
        SleepState sleepState = new SleepState();
        sleepState.action(mode);
        System.out.println("\n");

        System.out.println("OBSERVER");
        AppStore appStore = new AppStore();
        appStore.add(new Ivi());
        appStore.add(new Megogo());
        appStore.execute();
        System.out.println("\n");

        System.out.println("COMMAND");
        ConnectWiFi connectWiFi = new ConnectWiFi();
        Command connectWiFiCommand = new ConnectWiFiCommand(connectWiFi);
        Ethernet ethernet= new Ethernet();
        Command ethernetCommand = new EthernetCommand(ethernet);
        ConnectionSetting connectionSetting = new ConnectionSetting(connectWiFiCommand);
        connectionSetting.connect();
        connectionSetting.setCommand(ethernetCommand);
        connectionSetting.connect();
        System.out.println("\n");

        System.out.println("CHAIN OF RESPONSIBILITY");
        Comand menu = new Menu("Menu");
        Comand apStore = new ApStore("ApStore");
        Comand sportChannel= new SportChannel("SportChannel");
        menu.setCommand(apStore);
        apStore.setCommand(sportChannel);
        SportCategory sportCategory = new SportCategory("SPORT", 30, "30");
        menu.create(sportCategory);
    }
}