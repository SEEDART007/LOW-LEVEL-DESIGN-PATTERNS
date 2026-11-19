package BookMyShowLLD;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private String name;
    private List<Screen> screenList;

    public Theatre(String name) {
        this.name = name;
        this.screenList = new ArrayList<>();
    }

    public void addScreen(Screen screen){
        this.screenList.add(screen);
    }

    public String getName() {
        return name;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }
}
