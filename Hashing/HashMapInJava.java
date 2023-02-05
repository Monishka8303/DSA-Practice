import java.util.*;
public class HashMapInJava {
    public static void main(String[] args) {
        HashMap<String,Integer> m=new HashMap<String,Integer>();
        m.put("gfg",10);
        m.put("leetcode",15);
        m.put("github",20);
        System.out.println(m);
        System.out.println(m.size());
        for(Map.Entry<String,Integer> e:m.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println((m.containsKey("leetcode"))?"Yes":"No");
        m.remove("leetcode");
        System.out.println(m.size());
        System.out.println((m.containsValue(15))?"Yes":"No");
        System.out.println(m.get("leetcode"));
        System.out.println(m.get("github"));
    }
}
