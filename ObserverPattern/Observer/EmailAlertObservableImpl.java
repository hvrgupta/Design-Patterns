package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailAlertObservableImpl implements NotificationAlertObserver {

    String email;
    StocksObservable observable;

    public EmailAlertObservableImpl(String email, StocksObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(email, "Product is in Stock!");
    }

    private void sendMail(String email, String msg) {
        System.out.println("Email sent to: " + email);
    }

}
