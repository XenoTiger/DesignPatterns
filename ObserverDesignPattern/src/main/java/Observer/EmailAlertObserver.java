package Observer;

import Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    private String emailId;
    private StockObservable stockObservable;

    public EmailAlertObserver(String emailId, StockObservable stockObservable){
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId);
    }

    private void sendEmail(String emailId){
        System.out.println("The mail has sent to " + emailId);
    }
}
