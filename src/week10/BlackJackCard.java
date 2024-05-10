package week10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BlackJackCard {
    private String title;
    private int point;
    boolean isAce;

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }
    public void setAce(boolean ace) {
        isAce = ace;
    }
    public boolean isAce() {
        return isAce;
    }





}