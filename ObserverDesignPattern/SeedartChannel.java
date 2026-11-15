package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class SeedartChannel {
    private String videoTitle;
    private String videoFileName;
    List<Subscriber> subscriberList = new ArrayList<>();

    public String getVideoTitle(){
        return videoTitle;
    }
    public String getVideoFileName(){
        return videoFileName;
    }

    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }
    public void notifySubscriber(){
        for(Subscriber subscriber : subscriberList){
            subscriber.update(this);
        }
    }
    public void uploadVideo(String videoTitle, String videoFileName){
        this.videoTitle = videoTitle;
        this.videoFileName=videoFileName;
        System.out.println("the video has been uploaded");
        notifySubscriber();
    }
}
