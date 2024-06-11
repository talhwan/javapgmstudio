package week15;

public class HguOut extends HguInOut{
    int parkingTime;
    int fee;

    public HguOut(String data) {
        super(data);
        super.type = "out";
    }

    public int getFee() {
        return fee;
    }
    public void setFee(int fee) {
        this.fee = fee;
    }
    public int getParkingTime() {
        return parkingTime;
    }
    public void setParkingTime(int parkingTime) {
        this.parkingTime = parkingTime;
    }
    @Override
    public String toString() {
        return carNum + " " + type + " " + nowDate + " " + nowTime + " " + parkingTime + " " + fee;
    }

}
