import java.util.*;
class MyHash{
    int bucket;
    ArrayList<LinkedList<Integer>> table;
    MyHash(int b){
        bucket=b;
        table=new ArrayList<LinkedList<Integer>>();
        for(int i=0;i<b;i++){
            table.add(new LinkedList<Integer>());
        }
    }
    void insert(Integer key){
        int i=key%bucket;
        table.get(i).add(key);
    }
    void delete(Integer key){
        int i=key%bucket;
        table.get(i).remove(key);
    }
    boolean search(Integer key){
        int i=key%bucket;
        return table.get(i).contains(key);    
    }
}
public class ImplementationOfChaining {
    public static void main(String[] args){
        MyHash mh=new MyHash(7);
        for(int i=8;i<21;i++){
            mh.insert(i);
        }
        System.out.println(mh.search(30));
        System.out.println(mh.search(12));
        System.out.println(mh.search(20));
        mh.delete(9);
        mh.delete(16);
        System.out.println(mh.search(16));
        System.out.println(mh.search(8));
    }
}
