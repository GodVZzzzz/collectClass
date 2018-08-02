package collection;

import java.util.Stack;

/**
 * @author Zhang
 * @date 2018/7/22
 * @Description 使用两个栈组合成一个队列
 */

public class Statck2Queue{

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("La");
        queue.add("Do");
        queue.add("Mi");
        queue.add("Fa");
        queue.add("So");

        String s=queue.remove();
        String h=queue.remove();
        System.out.println(s+h);
    }
}

class Queue {

    private Stack<String> a = new Stack<>();
    private Stack<String> b = new Stack<>();

    public void add(String s){
        a.push(s);
    }

    public String remove(){
        String s;

        if (a.empty() && b.empty())
            return null;
        while (!a.empty()) {
            b.push(a.pop());
        }
        s = b.pop();
        return s;

    }

}
