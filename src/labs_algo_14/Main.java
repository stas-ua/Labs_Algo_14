/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs_algo_14;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] arrSt = new Student[10];

        arrSt[0] = new Student("Ivan", "Ivanov", "math", 5);
        arrSt[1] = new Student("Petr", "Petrov", "math", 3);
        arrSt[2] = new Student("Sidor", "Sidorov", "math", 4);
        arrSt[3] = new Student("Dart", "Vader", "math", 6);
        arrSt[4] = new Student("Roman", "Romanov", "math", 1);
        arrSt[5] = new Student("Vasya", "Vasylev", "math", 7);
        arrSt[6] = new Student("Vitya", "Viktorov", "math", 8);
        arrSt[7] = new Student("Michael", "Michailov", "math", 10);
        arrSt[8] = new Student("Senya", "Semenov", "math", 2);
        arrSt[9] = new Student("Anton", "Antonov", "math", 9);

        for (Student st : arrSt) {
            System.out.println(st.getName() + " " + st.getLastName()
                    + " " + st.getFaculty() + " " + st.getGroupNumber());
        }
        
        System.out.println();

        SortHelper.insSort(arrSt, true);

        for (Student st : arrSt) {
            System.out.println(st.getName() + " " + st.getLastName()
                    + " " + st.getFaculty() + " " + st.getGroupNumber());
        }

    }

}
