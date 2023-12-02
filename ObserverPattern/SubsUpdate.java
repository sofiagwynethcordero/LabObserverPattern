package ObserverPattern;


public class SubsUpdate implements Subscriber
{
    private String name;

    public SubsUpdate(String name) {
        setName(name);
    }

    public SubsUpdate(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void updateNews(String news) {
        System.out.println("Good Day " + getName() + "!");
        System.out.println("Here are some news update for you.");
        System.out.println(news);
        System.out.println("Thank you for subscribing! We will keep you updated.");
    }
}
