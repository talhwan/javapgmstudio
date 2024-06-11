package week15;

public class HguInOut {
    String carNum;
    String type; //in 이면 입차, out 이면 출차
    String nowDate; //날짜 2024-06-11
    String nowTime; //시간 00:00:00

    public HguInOut(String data) {
        String[] arrayData = data.split(" ");
        setCarNum(arrayData[0]);
        setType(arrayData[1]);
        setNowDate(arrayData[2]);
        setNowTime(arrayData[3]);
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
    public String getNowDate() {
        return nowDate;
    }
    public void setNowDate(String nowDate) {
        this.nowDate = nowDate;
    }
    public String getNowTime() {
        return nowTime;
    }
    public void setNowTime(String nowTime) {
        this.nowTime = nowTime;
    }

    @Override
    public String toString() {
        return carNum + " " + type + " " + nowDate + " " + nowTime;
    }

}
