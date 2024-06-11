package week15;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.fileio();
    }

    void fileio(){
        //주차관리 프로그램
        /*
        HguParkingManager a = new HguParkingManager();
        a.addCar(new HguCar("0610 suv 2"));
        a.addUser(new HguUser("- 01099998888 james"));
        a.addUser(new HguUser("- 01099998887 jyp"));
        a.addInOut(new HguInOut("0610 out - -"));
        a.addInOut(new HguInOut("0610 in - -"));
        a.addInOut(new HguOut("0610 - - -"));
        */

        //게시판 프로젝트
        IHguBoardManager ib = new HguBoardManager();
        //HguBoardManager b = new HguBoardManager();
        String boardId = ib.addBoard(new HguBoard("- 안녕하세요5! 2 - -"));
        ib.addCmt(new HguCmt("- 안녕하세요5!에대한답글하하!! "+boardId+" 1 - -"));

    }
}