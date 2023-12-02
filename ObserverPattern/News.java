package ObserverPattern;
import java.util.ArrayList;
import java.util.List;

public class News
{
    public static void main(String[] args)
    {
        NewsAgency newsAgency = new NewsAgency();
        SubsUpdate subs = new SubsUpdate();
        subs.setName("Sofia");
        newsAgency.subscribe(subs);

        newsAgency.publishingQueue("Carbon Neutrality Targets: Participating countries have committed to ambitious" +
                " carbon neutrality targets, with a collective goal of achieving a net-zero carbon footprint by 2050. " +
                "This involves a significant shift towards renewable energy sources and the implementation of innovative " +
                "technologies to reduce emissions across various sectors.");
        System.out.println();
        newsAgency.publishingQueue("Climate Adaptation Fund: A dedicated fund has been established to support " +
                "nations most vulnerable to the impacts of climate change. This fund will finance projects focused on " +
                "building resilience, implementing sustainable agricultural practices, and protecting biodiversity in " +
                "regions disproportionately affected by global warming.");
    }
}