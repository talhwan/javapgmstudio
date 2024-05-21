package week12;

public interface Icrud {
    public void create(String title, String content, String date);
    public void create(TodoItem todoItem);
    public void update(int index, String title, String content, String date);
    public void update(int index, TodoItem todoItem);
    public void delete(int index);
    public void delete(TodoItem todoItem);
    public void printThis();
}