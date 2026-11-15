package ObserverDesignPattern;

public class YoutubeSubscriber implements Subscriber{
    private String name;
    private int id;
    public YoutubeSubscriber(String name,int id){
        this.name = name;
        this.id = id;
    }
    public void update(SeedartChannel seedartChannel){
        System.out.println("Upload Video : "+seedartChannel.getVideoTitle()+" "+"fileName : "+seedartChannel.getVideoFileName()+" "+"Recieved Notification by "+name);
    }
}
