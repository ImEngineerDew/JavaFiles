package com.toadsdewin.JavaQuick.MainCode;

import java.util.ArrayList;
import java.util.Scanner;

public class MainFile
{
    public static void main (String args[])
    {
        /**The PersonClass is a Java file that was selected
         * for working with those ArrayList
         * creating an object of the ArrayList class
         */
        ArrayList<PersonClass> chains = new ArrayList<>();
        Scanner object = new Scanner(System.in);
        PersonClass persona;

        System.out.print("¿Cuántos datos vas a ingresar: ");
        int length = object.nextInt();

        object.nextLine();

        for (int i = 0; i < length; i++) {

            System.out.print("Ingrese su nombre: ");
            String name = object.nextLine();

            System.out.print("Ingrese su apellido: ");
            String surname = object.nextLine();

            System.out.print("Ingrese su edad: ");
            Integer age = object.nextInt();

            System.out.print("Ingrese su sueldo: ");
            Integer wage = object.nextInt();

            object.nextLine();
            persona = new PersonClass(name, surname, age, wage);
            chains.add(persona);
        }
        /** PersonClass is the method that get the basic info
         *  the 'i' variable indicates the position in the foreach
         *  chains is an object from ArrayList, that owns the PersonClass class
         */
        for (PersonClass i: chains) {
            System.out.println("Data: "+i.toString());
        }
   }
}
