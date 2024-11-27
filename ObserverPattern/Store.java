package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObservableImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new MobileAlertObserverImpl("hgupta7", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObservableImpl("abc@xyz.com", iphoneStocksObservable);
        NotificationAlertObserver observer3 = new EmailAlertObservableImpl("xyz@abc.com", iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(100);

    }
}
