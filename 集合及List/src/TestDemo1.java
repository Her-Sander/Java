import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class Person{

}

public class TestDemo1 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        //v put(K key,V value)
        map.put("国民帅哥","小雷");
        map.put("国民美女","小雪");
        map.put("国民老公","啊䨻");
        map.put("国民老婆","宋祖儿");
        System.out.println(map);
        //put的时候如果key值存在会覆盖原来的值
        map.put("国民老公","阿靐");
        System.out.println(map);
        //通过get方法获得key所指的value值
        String str=map.get("国民美女");
        //通过str接收key所指的value值
        System.out.println(str);
        str=map.getOrDefault(
                "国民老公","小刘");
        System.out.println(str);
        System.out.println(map.containsKey("国民老公"));
        System.out.println(map.containsValue("宋祖儿"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map);
        System.out.println("=============");
        //map.entrySet():将key和value的值进行打包
        for(Map.Entry<String,String> entry:
                map.entrySet()){
            System.out.println(
                    entry.getKey()+" "+entry.getValue());
        }
    }
    public static void main2(String[] args) {
        Collection<Person> collection=new ArrayList<>();
        collection.add(new Person());
        //简单类型int不能作为参数
        //必须用其包装类integer
        //Collection<Int> collection1=new ArrayList<>();

        Collection<Integer> collection2=new ArrayList<>();
    }
    public static void main1(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");
        System.out.println(collection);
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        collection.remove("b");
        System.out.println(collection.size());
        System.out.println(collection);
        System.out.println("============");
        for(String s: collection){
            System.out.println(s);
        }
        System.out.println("=============");
        for(Object s: collection){
            System.out.println(s);
        }
        collection.clear();
        System.out.println(collection.size());
        System.out.println(collection);

    }
}
