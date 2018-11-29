/**
 * Interface Person
 */
package Bai1;
import java.util.ArrayList;
public interface Person {
    String getName();
    int getAge();
    boolean getSex();
    Date getBirthday();
    int getNumOfChildren();
    void addChild(Person person);
    void remove(Person person);
    String getInformation();
    void setMarried(Person person);
    Person getMarried();
    ArrayList<Person> getChild();
}