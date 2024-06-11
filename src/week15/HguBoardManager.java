package week15;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HguBoardManager implements IHguBoardManager {
    List<HguUser> userList = null;
    List<HguBoard> boardList = null;
    List<HguCmt> cmtList = null;

    public HguBoardManager(){
        List<String> aList = null;
        userList = new ArrayList<>();
        aList = dataFileIn("user");
        for(String s : aList){
            HguUser each = new HguUser(s);
            userList.add(each);
        }
        boardList = new ArrayList<>();
        aList = dataFileIn("board");
        for(String s : aList){
            HguBoard each = new HguBoard(s);
            boardList.add(each);
        }
        cmtList = new ArrayList<>();
        aList = dataFileIn("cmt");
        for(String s : aList){
            HguCmt each = new HguCmt(s);
            cmtList.add(each);
        }
    }

    public List<String> dataFileIn(String fileName){
        List<String> dataList = new ArrayList<>();
        try{
            File file = new File("./src/week15/"+fileName+".txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                //System.out.println(scanner.nextLine());
                String each = scanner.nextLine();
                dataList.add(each);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dataList;
    }
    public void dataFileOut(String fileName){
        String datas = "";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./src/week15/"+fileName+".txt");
            switch(fileName){
                case "board": {
                    for (HguBoard each : boardList) {
                        datas += each.toString() + "\n";
                    }
                } break;
                case "user": {
                    for (HguUser each : userList) {
                        datas += each.toString() + "\n";
                    }
                } break;
                case "cmt": {
                    for (HguCmt each : cmtList) {
                        datas += each.toString() + "\n";
                    }
                } break;
            }

            byte b[] = datas.getBytes();
            fileOutputStream.write(b);
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean checkBoardId(String boardId){
        for(HguBoard board : boardList){
            if(boardId.equals(board.getBoardId())){
                return true;
            }
        }
        return false;
    }
    public boolean checkUserId(String userId){
        for(HguUser user : userList){
            if(userId.equals(user.getUserId())){
                return true;
            }
        }
        return false;
    }
    public boolean containsUser(HguUser each){
        for(HguUser user : userList){
            if((user.getPhone()).equals(each.getPhone())){
                return true;
                /*
                if((user.getName()).equals(each.getName())){
                    return true;
                }
                */
            }
        }
        return false;
    }
    public void addUser(HguUser each){
        if(containsUser(each)){
        } else {
            each.setUserId((userList.size() + 1) + "");
            userList.add(each);
            dataFileOut("user");
        }
    }

    public String addBoard(HguBoard each){
        String boardId = null;
        Date now = new Date();
        SimpleDateFormat sDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //format2 = new SimpleDateFormat("''yy년 MM월 dd일 E요일",Locale.KOREAN);

        String dateTime = sDateTime.format(now);
        //System.out.println(dateTime);
        String[] arrayData = dateTime.split(" ");
        each.setNowDate(arrayData[0]);
        each.setNowTime(arrayData[1]);

        each.setBoardId((boardList.size() + 1) + "");

        boardList.add(each);
        dataFileOut("board");
        boardId = each.getBoardId();
        return boardId;
    }
    public String addCmt(HguCmt each){
        String cmtId = null;
        if(checkBoardId(each.getBoardId())){
            Date now = new Date();
            SimpleDateFormat sDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //format2 = new SimpleDateFormat("''yy년 MM월 dd일 E요일",Locale.KOREAN);

            String dateTime = sDateTime.format(now);
            //System.out.println(dateTime);
            String[] arrayData = dateTime.split(" ");
            each.setNowDate(arrayData[0]);
            each.setNowTime(arrayData[1]);

            each.setCmtId((cmtList.size() + 1) + "");

            cmtList.add(each);
            dataFileOut("cmt");
            cmtId = each.getCmtId();
        }
        return cmtId;
    }
}