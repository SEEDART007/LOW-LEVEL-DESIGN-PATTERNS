package BookMyShowLLD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Screen {
    private int screenId;
    private List<Show> showList;

    public Screen(int screenId) {
        this.screenId = screenId;
        this.showList = new ArrayList<>();
    }

    public void addShow(Show show){
        this.showList.add(show);
    }

    public int getScreenId() {
        return screenId;
    }

    public List<Show> getShowList() {
        return showList;
    }
}
