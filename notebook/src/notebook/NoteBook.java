package notebook;

import java.util.ArrayList;
import java.util.HashSet;

class Value {
    private int i;

    public void set(int i) {
        this.i = i;
    }

    public int get() {
        return i;
    }

    @Override
    public String toString() {
        return "" + i;
    }
}
/**
 * @Descrption:
 * @Author: minx
 * @Date:
 */

public class NoteBook {
    private ArrayList<String> notes = new ArrayList<String>();
    private int size = 0;

    public void add(String s) {
        notes.add(s);
        size++;
    }

    public void add(String s, int location) {
        notes.add(location, s);
    }


    public int getSize() {
        return notes.size();
    }

    public String getNote(int index) {
        return notes.get(index);
    }

    public void removeNote(int index) {
        notes.remove(index);
    }

    public String[] list() {
        String[] a = new String[notes.size()];
        //拥有很多库方法可以使用
        notes.toArray(a);
        return a;
    }

    public static void main(String[] args) {

        Value v = new Value();
        v.set(10);
        System.out.println(v);

        NoteBook nb = new NoteBook();
        ArrayList<String> a = new ArrayList<String>();
        nb.add("first");
        nb.add("second");
        nb.add("third", 1);
        System.out.println(nb.getSize());
        System.out.println(nb.getNote(0));
        System.out.println(nb.getNote(1));
        nb.removeNote(1);
        a.add("first");
//        String[] a = nb.list();
        for (String s : a) {

            System.out.println(s);
        }
        System.out.println("---------------");
        HashSet<String> s = new HashSet<String>();
        s.add("first");
        s.add("second");
        s.add("first");
        for (String k : s) {
            System.out.println(k);
        }
    }
}
