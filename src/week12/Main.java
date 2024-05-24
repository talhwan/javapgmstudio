package week12;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.iTest();
    }

    void iTest(){
        ICrud a = new TodoCrud();
        a.create("제목0", "내용0", "2024-05-21");
        a.create(new TodoItem("제목1", "내용1", "2024-05-21"));
        a.create(new TodoItem("제목2", "내용2", "2024-05-21"));
        a.printThis();
        a.update(0, "11","22", "33");
        a.update(0, new TodoItem("제목001", "내용001", "2024-05-21"));
        System.out.println("===");
        a.printThis();
        a.delete(1);
        a.printThis();
    }
}