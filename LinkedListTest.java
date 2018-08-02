package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Zhang
 * @date 2018/7/22
 * @Description
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> student = new LinkedList<>();          /*创建链表*/
        student.add("Li");                                        /*添加元素*/
        student.add("Wang");
        student.add("Zhao");
        student.add("Zhang");
        System.out.println("当前链表为："+ student);

        /*删除第三个元素*/
        Iterator iter = student.iterator();
        iter.next();
        iter.next();
        iter.next();
        iter.remove();
        System.out.println("删除操作后的链表为："+ student);

        /*ListIterator操作*/
        ListIterator<String> iterator = student.listIterator();
        iterator.next();
        iterator.next();
        iterator.add("Wu");                         /*"Wang"后加入元素"Wu"，迭代器位于Wu之后*/
        iterator.previous();
        iterator.previous();                         /*迭代器位于"Wang"之前，因为进行了previous操作，迭代器指示右边的"Wang"*/
        iterator.remove();
        System.out.println("listIterator增删后的链表为："+ student);

        iterator.previous();

        List<String> others = new LinkedList<String>();
        others.add("Sun");
        others.add("Song");
        others.add("Jin");
        ListIterator iter_other = others.listIterator();

        /*合并两个链表*/
        while (iter_other.hasNext()){
            while (iterator.hasNext()) {
                    iterator.next();
            }

            iterator.add((String)iter_other.next());
        }
        System.out.println("合并后的链表为："+ student);

        student.removeAll(others);
        System.out.print("删除others链表的结果："+ student);
    }
}
