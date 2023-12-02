package ObserverPattern;
import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsObserver {
    private List<Subscriber> subscriberList = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String news) {
        for (Subscriber subscriber : subscriberList) {
            subscriber.updateNews(news);
        }
    }

    public void publishingQueue(String news) {
        System.out.println("NEWS BULLETIN");
        System.out.println(news);
        notifySubscriber(news);
    }
}