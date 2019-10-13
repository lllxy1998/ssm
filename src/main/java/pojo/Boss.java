package pojo;

import java.util.List;

public class Boss {
    String bossName;
    String managedCompany;
    Car bossCar;
    List hobbyList;

    public Boss() {
    }

    public Boss(String bossName, String managedCompany, Car bossCar, List hobbyList) {
        this.bossName = bossName;
        this.managedCompany = managedCompany;
        this.bossCar = bossCar;
        this.hobbyList = hobbyList;
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public String getManagedCompany() {
        return managedCompany;
    }

    public void setManagedCompany(String managedCompany) {
        this.managedCompany = managedCompany;
    }

    public Car getBossCar() {
        return bossCar;
    }

    public void setBossCar(Car bossCar) {
        this.bossCar = bossCar;
    }

    public List getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List hobbyList) {
        this.hobbyList = hobbyList;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "bossName='" + bossName + '\'' +
                ", managedCompany='" + managedCompany + '\'' +
                ", bossCar=" + bossCar +
                ", hobbyList=" + hobbyList +
                '}';
    }
}
