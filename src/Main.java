
//Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creazione di un ArrayList di Student
        ArrayList<Student> studentList = new ArrayList<>();

        // Aggiungere 4 elementi alla collezione
        studentList.add(new Student("Manny", 20));
        studentList.add(new Student("Pipo", 21));
        studentList.add(new Student("Rico", 22));
        studentList.add(new Student("Gianni", 23));

        // Stampare la collezione iniziale in console
        System.out.println("Collezione iniziale:");
        printStudentList(studentList);

        // Aggiungere altri elementi alla collezione
        studentList.add(new Student("Fulvio", 24));
        studentList.add(new Student("Fabio", 25));

        // Stampare la collezione aggiornata in console
        System.out.println("\nCollezione aggiornata:");
        printStudentList(studentList);
    }

    // Metodo per stampare la lista di studenti
    public static void printStudentList(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            System.out.println("Nome: " + student.getName() + ", Età: " + student.getAge());
        }
    }
}