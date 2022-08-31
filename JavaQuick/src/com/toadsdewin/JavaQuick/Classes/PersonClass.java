package com.toadsdewin.JavaQuick.Classes;
import com.toadsdewin.JavaQuick.Interfaces.*;

public class PersonClass implements settersPerson,gettersPerson
{
    private String name;
    private String surname;
    private Integer age;
    private Integer wages;

    /** public PersonClass() { }**/
    public PersonClass(String name, String surname, Integer age, Integer wages)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.wages = wages;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getSurname () {
        return surname;
    }
    @Override
    public Integer getAge () {
        return age;
    }
    @Override
    public Integer getWages () {
        return wages;
    }

    @Override
    public void setName(String name)
    {
        if(name!=null && name.length()>2)
        {
            this.name = name;
        }
    }
    @Override
    public void setSurname(String surname)
    {
        if (surname != null && name.length() > 2) {
            this.surname = surname;
        }
    }
    @Override
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
