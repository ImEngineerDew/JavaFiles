package com.toadsdewin.JavaQuick.MainCode;
import com.toadsdewin.JavaQuick.Classes.PersonClass;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFile
{
    public static void main (String args[])
    {
        /**The com.toadsdewin.JavaQuick.Classes.PersonClass is a Java file that was selected
         * for working with those ArrayList
         * creating an object of the ArrayList class
         */
        ArrayList<PersonClass> chains = new ArrayList<>();
        Scanner object = new Scanner(System.in);
        PersonClass persona;

        String name,surname;
        Integer wage,age=0;

        System.out.print("¿Cuántos datos vas a ingresar?: ");
        int length = object.nextInt();

        object.nextLine();

        for (int i = 0; i < length; i++) {

            System.out.print("Ingrese su nombre: ");
            name = object.nextLine();

            System.out.print("Ingrese su apellido: ");
            surname = object.nextLine();

            System.out.print("Ingrese su edad: ");
            age = object.nextInt();

            System.out.print("Ingrese su sueldo: ");
            wage = object.nextInt();

            object.nextLine();
            persona = new PersonClass(name, surname, age, wage);
            chains.add(persona);
        }
        /** com.toadsdewin.JavaQuick.Classes.PersonClass is the method that get the basic info
         *  the 'i' variable indicates the position in the foreach
         *  chains is an object from ArrayList, that owns the com.toadsdewin.JavaQuick.Classes.PersonClass class
         */

        if(age<18)
        {
            System.out.println("Usted es menor de edad");
        }
        else {
            for (PersonClass i : chains) {
                /**System.out.println("Data: "+i.toString());**/
                System.out.println(i.getName() + " " + i.getSurname() + " " + i.getAge() + " " + i.getWages());
            }
        }
   }
}
