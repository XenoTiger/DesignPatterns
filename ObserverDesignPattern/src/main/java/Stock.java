import Observable.IphoneStockObservable;
import Observable.StockObservable;
import Observer.EmailAlertObserver;
import Observer.MobileAlertObserver;
import Observer.NotificationAlertObserver;

public class Stock {

    public static void main(String[] args) {

        StockObservable stockObservable = new IphoneStockObservable();

        NotificationAlertObserver observer1
                = new EmailAlertObserver("abc@gmail.com", stockObservable);
        NotificationAlertObserver observer2
                = new EmailAlertObserver("xyz@gmail.com", stockObservable);
        NotificationAlertObserver observer3
                = new MobileAlertObserver(1234567, stockObservable);

        stockObservable.add(observer1);
        stockObservable.add(observer2);
        stockObservable.add(observer3);
        stockObservable.setStockCount(10);
    }
}
