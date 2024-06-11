package week15;

public class HguCmt {
    String cmtId;
    String content;
    String boardId;
    String userId;
    String nowDate; //날짜 2024-06-11
    String nowTime; //시간 00:00:00

    public HguCmt(String data) {
        String[] arrayData = data.split(" ");
        setCmtId(arrayData[0]);
        setContent(arrayData[1]);
        setBoardId(arrayData[2]);
        setUserId(arrayData[3]);
        setNowDate(arrayData[4]);
        setNowTime(arrayData[5]);
    }

    public String getNowTime() {
        return nowTime;
    }

    public void setNowTime(String nowTime) {
        this.nowTime = nowTime;
    }

    public String getNowDate() {
        return nowDate;
    }

    public void setNowDate(String nowDate) {
        this.nowDate = nowDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getCmtId() {
        return cmtId;
    }

    public void setCmtId(String cmtId) {
        this.cmtId = cmtId;
    }

    @Override
    public String toString() {
        return cmtId + " " + content + " " + boardId + " " + userId + " " + nowDate + " " + nowTime;
    }
}
