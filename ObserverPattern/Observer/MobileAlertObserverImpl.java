package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String username;
    StocksObservable observable;

    public MobileAlertObserverImpl(String username, StocksObservable observable) {
        this.username = username;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMsgOnMobile(username,"Product is in Stock!");
    }

    private void sendMsgOnMobile(String username, String msg) {
        System.out.println("Message sent to: " + username);
    }
    
}
