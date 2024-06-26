package Observable;

import Observer.NotificationAlertObserver;

/*
Implement notify me feature in shopping app
 */
public interface StockObservable {

    void add(NotificationAlertObserver notificationAlertObserver);

    void remove(NotificationAlertObserver notificationAlertObserver);

    void notifySubscribers();

    void setStockCount(int data);

    int getStockCount();

}
