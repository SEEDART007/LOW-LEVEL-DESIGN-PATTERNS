package FactoryDesignPattern;

public class OrderService {


    public void sendNotification(String type){
        Notification notification=NotificationFactory.sendNotification("EMAIL");
        notification.send();
    }
}
