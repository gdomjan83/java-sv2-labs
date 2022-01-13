package collectionsqueue;

import java.util.*;

public class ToDoList {
    private List<ToDo> todos = new ArrayList<>();

    public void addTodos(ToDo toDo) {
        todos.add(toDo);
    }

    public Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> order = new ArrayDeque<>();
        for (ToDo actual : todos) {
            if (actual.isUrgent()){
                order.push(actual);
            } else {
                order.add(actual);
            }
        }
        return order;
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        toDoList.addTodos(new ToDo("reading", true));
        toDoList.addTodos(new ToDo("running", false));
        toDoList.addTodos(new ToDo("cleaning", true));
        toDoList.addTodos(new ToDo("sleeping", true));
        toDoList.addTodos(new ToDo("eating", false));
        toDoList.addTodos(new ToDo("excercising", true));

        Deque<ToDo> result = toDoList.getTodosInUrgencyOrder();
        System.out.println(result);
        System.out.println(result.pop());
    }
}
