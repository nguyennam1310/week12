package Bai1;

import java.util.ArrayList;

public class Children implements Person  {
    private String name;
    private int age;
    private boolean sex;
    private Date birthday;

    public Children(String name, int age, Date birthday, boolean sex) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.sex = sex;
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
     * @return 0
     */
    @Override
    public int getNumOfChildren() {
        return 0;
    }

    @Override
    public void addChild(Person person) {

    }

    @Override
    public void remove(Person person) {

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
        return ans;
    }

    @Override
    public void setMarried(Person person) {
    }

    @Override
    public Person getMarried() {
        return null;
    }

    @Override
    public ArrayList<Person> getChild() {
        return null;
    }
}
