package ChainOfRespons;

public class SportCategory {
    private final String ChannelName;
    private final int price;
    private final String subDays;

    public SportCategory(String channelName, int price, String subDays) {
        ChannelName = channelName;
        this.price = price;
        this.subDays = subDays;
    }

    public String getChannelName() {
        return ChannelName;
    }

    public int getPrice() {
        return price;
    }

    public String getSubDays() {
        return subDays;
    }
}
