package packagespec;
/*
*
* */

import java.util.Arrays;

import static java.util.Arrays.sort;

class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
        //return (int)(o.score-this.score);
        //return this.age-o.age;
        //this-o:从小到大排 o-this:从大到小排
    }
}

public class TestDemo6 {
    public static void main1(String[] args) {
        int[] array = {10,4,1,9,8};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out .println(Arrays.toString(array));
    }
    public static void sort1(Comparable[] array) {
        for (int bound = 0; bound < array.length; bound++) {
            for (int cur = array.length - 1; cur > bound; cur--) {
                if (array[cur - 1].compareTo(array[cur]) > 0) {
// 说明顺序不符合要求, 交换两个变量的位置
                    Comparable tmp = array[cur - 1];
                    array[cur - 1] = array[cur];
                    array[cur] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Student[] students=new Student[3];
        students[0]=new Student("小高",20,77.7);
        students[1]=new Student("小雷",19,99.9);
        students[2]=new Student("小刘",18,88.9);
        System.out.println(Arrays.toString(students));
        sort1(students);
        System.out.println(Arrays.toString(students));
    }
}
