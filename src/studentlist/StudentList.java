
package studentlist;

import java.util.Scanner;

/** This class ++ System 17796 Fundamentals of Software Design and Development
 *
 * @author Ophir Neymour
 */
public class StudentList {
    
    
public static void main(String[] args) {
        Student[] sList=new Student[3];//declare an array of objects
        Scanner input=new Scanner(System.in);
        
        for(int i=0;i<sList.length;i++)
        {
            sList[i]=new Student();//create objects for each index
            System.out.println("Enter Student name: ");
            sList[i].setName(input.nextLine());
            
       }
        for (int i = 0; i < sList.length; i++) {
        System.out.println("Student name: "+sList[i].getName());
            
        }
    }

    /**
     * @param args the command line arguments
     */
   

}
