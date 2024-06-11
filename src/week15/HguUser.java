package week15;

public class HguUser {
    String userId;
    String phone;
    String name;

    public HguUser(String data) {
        String[] arrayData = data.split(" ");
        setUserId(arrayData[0]);
        setPhone(arrayData[1]);
        setName(arrayData[2]);
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return userId + " " + phone + " " + name;
    }
}
