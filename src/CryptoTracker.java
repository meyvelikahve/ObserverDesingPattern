public class CryptoTracker implements Tracker {

    private String trackerName;

    public CryptoTracker(String trackerName) {
        this.trackerName = trackerName;
    }

    @Override
    public void updatePrice(CryptoPrice cryptoPrice) {
        System.out.println(trackerName + "'s notify : "+cryptoPrice.getCryptoName() + " price update to  ------>  " + cryptoPrice.getPrice() +" $");
    }
}
