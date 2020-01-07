package TestListUsing;
/*
*  创建一个班级名单,并根据分数对其进行排序
*  Collections.sort(list):
*           用该工具类类排序的时候注意实现接口和修改构造方法(注意类型转换)
* */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    private String name;
    private String clas;
    private double score;

    public Student(String name, String clas, double score) {
        this.name = name;
        this.clas = clas;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clas='" + clas + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return (int)(this.score-o.score);
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("小雷","三年二班",100.0));
        list.add(new Student("小锋","三年二班",98.9));
        list.add(new Student("小高","三年二班",88.8));
        list.add(new Student("小刘","三年二班",66.6));
        list.add(new Student("小梦","三年二班",77.7));
        for(Student s: list ){
            System.out.println(s);
        }
        System.out.println("==========排序操作需用到集合类collections===========");
        Collections.sort(list);
        for(Student s: list ){
            System.out.println(s);
        }    }
}
