import com.toadsdewin.JavaQuick.Interfaces.settersPerson;

public class PersonClass implements settersPerson
{
    private String name;
    private String surname;
    private Integer age;
    private Integer wages;

    public PersonClass() { }

    public PersonClass(String name, String surname, Integer age, Integer wages)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.wages = wages;
    }

    public String getName() {
        return name;
    }
    public String getSurname () {
        return surname;
    }
    public Integer getAge () {
        return age;
    }
    public Integer wages () {
        return wages;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }
    @Override
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public void setAge(Integer age)
    {
        this.age = age;
    }
    public void setWages(Integer wages)
    {
        this.wages = wages;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", wages=" + wages;
    }

}
