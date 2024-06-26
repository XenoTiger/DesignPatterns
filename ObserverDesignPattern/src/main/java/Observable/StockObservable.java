package Observable;

import Observer.NotificationAlertObserver;

/**
 * This class represents observer pattern for notify me functionality in shopping app.
 * Concept is to observe stock with help of Notification Observer class.
 * @author Niraj_Bhoyar
 */
public interface StockObservable {

    void add(NotificationAlertObserver notificationAlertObserver);

    void remove(NotificationAlertObserver notificationAlertObserver);

    void notifySubscribers();

    void setStockCount(int data);

    int getStockCount();

}
