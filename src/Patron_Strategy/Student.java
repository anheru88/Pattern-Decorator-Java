package Patron_Strategy;


public class Student {

    private String name;
    private String code;
    private int age;
    private String sex;
    private String address;

    public Student() {
        this.name = "";
        this.code = "";
        this.age = 0;
        this.sex = "";
        this.address = "";
    }  

    public Student(String name, String code, int age, String sex, String address) {
        this.name = name;
        this.code = code;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", code=" + code + ", age=" + age + ", sex=" + sex + ", address=" + address + '}';
    }

}
