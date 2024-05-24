package week12;

import java.util.ArrayList;
import java.util.List;

public class TodoCrud implements ICrud {
    List<TodoItem> list = new ArrayList<>();

    public void create(String title, String content, String date){
        //list.add(new TodoItem(title, content, date));
        create(new TodoItem(title, content, date));
    }

    public int indexTodoItem(TodoItem todoItem){
        //같은 제목이랑 날짜가 같으면 이거 같은것으로 볼래!
        int index = -1;
        for(int i=0;i<list.size();i++){
            if(todoItem.getTitle().equals(list.get(i).getTitle())
                    && todoItem.getDate().equals(list.get(i).getDate())
            ){
                index = i;
            }
        }
        return index;
    }

    public void create(TodoItem todoItem){
        //중복 검사 기능을 넣으면 됩니다!
        int index = indexTodoItem(todoItem);
        if(index == -1){
            list.add(todoItem);
        }
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

        int index = indexTodoItem(todoItem);
        if(index > -1){
            list.remove(index);
        }
    }
    public void printThis(){
        for(TodoItem each : list){
            System.out.println(each.toString());
        }
    }
    public void printThis(String date){
        //sort를 객체의 date로 하고 같은 날짜일때는 제목 abc 순으로 정렬!
        for(TodoItem each : list){
            if(date.equals(each.getDate())){
                System.out.println(each.toString());
            }
        }
    }
    public List<TodoItem> listSchedule(String date){
        List<TodoItem> rlist = new ArrayList<>();
        for(TodoItem each : list){
            if(date.equals(each.getDate())){
                rlist.add(each);
            }
        }
        return rlist;
    }
    public int countSchedule(String date){
        int count = 0;
        for(TodoItem each : list){
            if(date.equals(each.getDate())){
                count++;
            }
        }
        return count;
    }
}