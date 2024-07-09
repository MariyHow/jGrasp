import java.util.*;

class Person {
    private String name;
    private String gender;
    private String birthday;
    private String ssn;

    public Person(String name, String gender, String birthday, String ssn) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.ssn = ssn;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getSSN() {
        return this.ssn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }

    public void printNameSSNRecursive() {
        printNameSSNRecursiveHelper(this.getName(), this.getSSN(), 0);
    }

    private void printNameSSNRecursiveHelper(String name, String ssn, int index) {
        if (index >= name.length() && index >= ssn.length()) {
            return;
        }

        if (index < name.length()) {
            System.out.println(name.charAt(index));
        }

        if (index < ssn.length()) {
            System.out.println(ssn.charAt(index));
        }

        printNameSSNRecursiveHelper(name, ssn, index + 1);
    }

    public void printNameBirthday() {
        System.out.println(this.getName() + " - " + this.getBirthday());
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Samariy Howard", "Male", "01/01/2000", "900-11-1111");
        Person p2 = new Person("Samara Howard", "Female", "02/02/2007", "900-22-2222");
        Person p3 = new Person("Bobby Howard", "Male", "03/03/1987", "900-33-3333");

        System.out.println("Before update:");
        System.out.println(p1.getName() + " - " + p1.getGender() + " - " + p1.getBirthday() + " - " + p1.getSSN());
        System.out.println(p2.getName() + " - " + p2.getGender() + " - " + p2.getBirthday() + " - " + p2.getSSN());
        System.out.println(p3.getName() + " - " + p3.getGender() + " - " + p3.getBirthday() + " - " + p3.getSSN());

        p1.setName("Deshawn Howard");
        p2.setBirthday("02/03/2000");

        System.out.println("After update:");
        System.out.println(p1.getName() + " - " + p1.getGender() + " - " + p1.getBirthday() + " - " + p1.getSSN());
        System.out.println(p2.getName() + " - " + p2.getGender() + " - " + p2.getBirthday() + " - " + p2.getSSN());
        System.out.println(p3.getName() + " - " + p3.getGender() + " - " + p3.getBirthday