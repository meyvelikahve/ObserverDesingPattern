import java.util.List;
import java.util.Vector;

public class CryptoPrice {
    private String cryptoName;
    private int price;

    private Vector<Tracker> investors;

    public CryptoPrice(String name, int price) {
        this.cryptoName = name;
        this.price = price;
        investors = new Vector<Tracker>();
    }

    public String getCryptoName() {
        return cryptoName;
    }

    public void setCryptoName(String cryptoName) {
        this.cryptoName = cryptoName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifyPrice();
    }

    public void subscribeNotify(Tracker tracker){
        investors.add(tracker);
    }

    public void unsubscribeNotify(Tracker tracker){
        investors.remove(tracker);
    }

    public void notifyPrice(){
        for (Tracker investor: investors) {
            investor.updatePrice(this);
        }
    }
}
