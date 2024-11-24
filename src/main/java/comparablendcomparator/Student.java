package comparablendcomparator;

import java.util.Objects;

public class Student implements Comparable<Student>  {
    public String name;
    public int age;

    public Student(String name,int age) {
        this.name=name;
        this.age=age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(Student other ) {
        if (this.age > other.age)
            return 1;
        else
            return -1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age,name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age && Objects.equals(name, student.name);
    }
/*int ageComparison = Integer.compare(this.age, other.age);
        if (ageComparison != 0) {
            return ageComparison;
        } else {
            return this.name.compareTo(other.name);
        }*/
    }

