import java.util.*;
public class HashSetInJava {
    public static void main(String[] args){
        HashSet<String> h=new HashSet<String>();          // stores lexicographically
        h.add("gfg");
        h.add("leetcode");
        h.add("github");
        System.out.println(h);
        System.out.println(h.contains("gfg"));
        Iterator<String> i=h.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
        System.out.println(h.size());
        h.remove("gfg");
        System.out.println(h.size());
        for(String s:h){
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println(h.isEmpty());
        h.clear();
        System.out.println(h);
    }
}
