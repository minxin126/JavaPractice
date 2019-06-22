package notebook;

import java.util.ArrayList;

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
//        String[] a = new String[2];
//        a[0] = "first";
//        a[1] = "second";
        NoteBook nb = new NoteBook();
        nb.add("first");
        nb.add("second");
        nb.add("third", 1);
        System.out.println(nb.getSize());
        System.out.println(nb.getNote(0));
        System.out.println(nb.getNote(1));
        nb.removeNote(1);
        String[] a = nb.list();
        for (String s : a) {
            System.out.println(s);
        }
    }
}
