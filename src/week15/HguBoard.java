package week15;

public class HguBoard {
    String boardId;
    String content;
    String userId;
    String nowDate; //날짜 2024-06-11
    String nowTime; //시간 00:00:00

    public HguBoard(String data) {
        String[] arrayData = data.split(" ");
        setBoardId(arrayData[0]);
        setContent(arrayData[1]);
        setUserId(arrayData[2]);
        setNowDate(arrayData[3]);
        setNowTime(arrayData[4]);
    }

    public String getBoardId() {
        return boardId;
    }
    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
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
        return boardId + " " + content + " " + userId + " " + nowDate + " " + nowTime;
    }
}
