package ObserverDesignPattern;

public class Main {
    public static void main(String[] args) {
        YoutubeSubscriber subscriber1 = new YoutubeSubscriber("Aman",123);
        YoutubeSubscriber subscriber2 = new YoutubeSubscriber("Naman",223);
        YoutubeSubscriber subscriber3 = new YoutubeSubscriber("Jivan",3);
        YoutubeSubscriber subscriber4 = new YoutubeSubscriber("Ravan",444);

        SeedartChannel seedartChannel = new SeedartChannel();
        seedartChannel.subscribe(subscriber1);
        seedartChannel.subscribe(subscriber2);
        seedartChannel.subscribe(subscriber3);
        seedartChannel.subscribe(subscriber4);

        seedartChannel.uploadVideo("Open-Source","observer.mp4");
    }
}
