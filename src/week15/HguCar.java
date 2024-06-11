package week15;

public class HguCar {
    String carNum;
    String type; // 차 유형 truck 이면 트럭, normal 이면 승용차, suv면 SUV
    String userId;

    public HguCar(String data) {
        String[] arrayData = data.split(" ");
        setCarNum(arrayData[0]);
        setType(arrayData[1]);
        setUserId(arrayData[2]);
    }

    public String getCarNum() {
        return carNum;
    }
    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return carNum + " " + type + " " + userId;
    }
}
