package D8;

public class Person {
    private int age;
    private String sex;
    private String name;
    private Person next;

    public Person(int age, String sex, String name) {
        setAge(age);
        setName(name);
        setSex(sex);
        setNext(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getNext() {
        return next;
    }

    public void setNext(Person next) {
        this.next = next;
    }



}
