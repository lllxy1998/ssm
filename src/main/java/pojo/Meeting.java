package pojo;

import java.util.List;

public class Meeting {
    String theme;
    List<Boss> bossList;

    public Meeting() {
    }

    public Meeting(String theme, List<Boss> bossList) {
        this.theme = theme;
        this.bossList = bossList;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Boss> getBossList() {
        return bossList;
    }

    public void setBossList(List<Boss> bossList) {
        this.bossList = bossList;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "theme='" + theme + '\'' +
                ", bossList=" + bossList +
                '}';
    }
}
