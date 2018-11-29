package Bai1;
/**
 * Class Parent implement Person
 * Author: Nguyen Linh UET
 */

import java.util.ArrayList;

public class Parent implements Person {
    private String name;
    private int age;
    private Date birthday;
    private ArrayList<Person> children = new ArrayList<>();
    private boolean sex;
    private Person married;
    /**
     * Constructor
     * @param name,age,birthday,sex
     */
    public Parent(String name, int age, Date birthday, boolean sex) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.sex = sex;
        this.married = null;
    }

    /**
     * getName
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * getAge
     * @return age
     */
    @Override
    public int getAge() {
        return age;
    }

    /**
     * getSex
     * @return sex true is Male else Female
     */
    @Override
    public boolean getSex() {
        return sex;
    }

    /**
     * getBirthday
     * @return birthday
     */
    @Override
    public Date getBirthday() {
        return birthday;
    }

    /**
     * getNumOfChildren
     * @return children size
     */
    @Override
    public int getNumOfChildren() {
        return children.size();
    }

    /**
     * addChild
     * @param person
     */
    @Override
    public void addChild(Person person) {
        children.add(person);
        if(married!=null)
            married.addChild(person);
    }

    @Override
    public void remove(Person person) {
        children.remove(person);
    }

    @Override
    public String getInformation() {
        String ans = "";
        ans += "Name : " + name + "\n";
        ans += "Age : " + age + "\n";
        ans += "Birthday : " + birthday.toString() + "\n";
        ans += "Sex : ";
        if (sex) ans += "Male" + "\n";
        else ans += "Female" + "\n";
        if (married != null)
        {
            ans += name + " married " + married.getName() + "\n";
        }
        ans += name + " has " + children.size() + " children: ";
        for (Person child : children)
        {
            ans += child.getName() + ",";
        }
        return ans;
    }

    @Override
    public void setMarried(Person person) {
        this.married = person;
    }

    @Override
    public Person getMarried() {
        return this.married;
    }

    @Override
    public ArrayList<Person> getChild() {
        return children;
    }
}
