public class Main {

    public static void main(String[] args) {
        CryptoPrice cryptoPrice = new CryptoPrice("Bitcoin",  50000);

        Tracker tracker = new CryptoTracker("User X");
        cryptoPrice.subscribeNotify(tracker);

        Tracker tracker2 = new CryptoTracker("User Y");
        cryptoPrice.subscribeNotify(tracker2);

        for (int i = 0; i <10; i++){
            if (i==5){
                cryptoPrice.unsubscribeNotify(tracker2);
            }
            cryptoPrice.setPrice(cryptoPrice.getPrice() + 5000);
        }

    }



}
