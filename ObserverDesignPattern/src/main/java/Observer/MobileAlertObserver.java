package Observer;

import Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {

    private int number;

    private StockObservable stockObservable;

    public MobileAlertObserver(int number, StockObservable stockObservable) {
        this.number = number;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMsg(number);
    }

    private void sendMsg(int number) {
        System.out.println("The notification has sent to " + number);
    }
}
