package ObserverPattern;

public interface NewsObserver
{
    public void subscribe(Subscriber subscriber);
    public void unsubscribe(Subscriber subscriber);
    public void notifySubscriber(String news);

}