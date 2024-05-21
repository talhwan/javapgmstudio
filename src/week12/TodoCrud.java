package week12;

import java.util.ArrayList;
import java.util.List;

public class TodoCrud implements Icrud{
    List<TodoItem> list = new ArrayList<>();

    public void create(String title, String content, String date){
        //list.add(new TodoItem(title, content, date));
        create(new TodoItem(title, content, date));
    }
    public void create(TodoItem todoItem){
        list.add(todoItem);
    }
    public void update(int index, String title, String content, String date){
        TodoItem each = list.get(index);
        each.setTitle(title);
        each.setContent(content);
        each.setDate(date);
    }
    public void update(int index, TodoItem todoItem){
        update(index, todoItem.getTitle(),
                todoItem.getContent(),
                todoItem.getDate());
        /*
        TodoItem each = list.get(index);
        each.setTitle(todoItem.getTitle());
        each.setContent(todoItem.getContent());
        each.setDate(todoItem.getDate());
        */
    }
    public void delete(int index){
        list.remove(index);
    }
    public void delete(TodoItem todoItem){
        //list.remove(index);
        //list.remove(todoItem);

        //같은 제목이랑 날짜가 같으면 이거 같은것으로 볼래!
        int index = -1;
        for(int i=0;i<list.size();i++){
            if(todoItem.getTitle().equals(list.get(i).getTitle())
            && todoItem.getDate().equals(list.get(i).getDate())
            ){
                index = i;
            }
        }
        if(index > -1){
            list.remove(index);
        }
    }
    public void printThis(){
        for(TodoItem each : list){
            System.out.println(each.toString());
        }
    }
}