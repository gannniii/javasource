package generics;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name" + name + "]";
    }
}

class Woker extends Person {
    public Woker(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class HighStudent extends Student {
    public HighStudent(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Course<T> {
    private String name;
    private List<T> students;

    public Course(String name, int capacity) {
        this.name = name;
        this.students = new ArrayList<>(capacity);
    }

    public void add(T t) {
        this.students.add(t);
    }

    public String getName() {
        return name;
    }

    public List<T> getStudents() {
        return students;
    }

}

class CourseEx {
    public static void main(String[] args) {
        Course<Person> personCourse = new Course("일반인 과정", 20);
        personCourse.add(new Person("홍길동"));
        personCourse.add(new Woker("김도비"));
        personCourse.add(new Student("최세라"));
        personCourse.add(new HighStudent("박고딩"));
        registerCourse(personCourse);

        Course<Woker> wokerCourse = new Course("직장인 과정", 10);
        wokerCourse.add(new Woker("최도비"));
        registerCourseWoker(wokerCourse);
        registerCourse(wokerCourse);

        Course<Student> studentCourse = new Course("학생 과정", 5);
        studentCourse.add(new Student("홍길동"));
        registerCourseStudent(studentCourse);
        registerCourse(studentCourse);

        Course<HighStudent> highCourse = new Course("고등학생 과정", 5);
        highCourse.add(new HighStudent("김고딩"));
        registerCourseStudent(highCourse);
        registerCourse(highCourse);
    }

    static void registerCourse(Course<?> course) {
        // 모든 과정 등록
        System.out.println(course.getName() + " 수강생 " + course.getStudents());
    }

    static void registerCourseStudent(Course<? extends Student> course) {
        // Student와 HighStudent만 등록
        System.out.println(course.getName() + " 수강생 " + course.getStudents());
    }

    static void registerCourseWoker(Course<? super Woker> course) {
        // Woker, Persont만 등록
        System.out.println(course.getName() + " 수강생 " + course.getStudents());
    }
}
