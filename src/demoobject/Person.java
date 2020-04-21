package demoobject;

import java.util.Objects;

/**
 * @ClassName Person
 * @Description TODO
 * @Author sq_lw
 * @Date 2020/4/8 22:19
 * @Version 1.0
 */
public class Person {
    private String name;
    private int Age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                '}';
    }

    /*@Override
    public boolean equals(Object o) {
        Person p = (Person) o;
        return this.name.equals(p.name) && this.Age == ((Person) o).Age;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Person person = (Person) o;
        return Age == person.Age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Age);
    }
}
