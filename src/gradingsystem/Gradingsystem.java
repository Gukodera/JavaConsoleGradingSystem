/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradingsystem;


import java.util.Scanner;
import java.util.ArrayList;

class subject{
String namesub;
double grade;

public subject(String namesub, double grade){
    
this.namesub = namesub;
this.grade = grade;
    
}
    
    
}

class student{
String studentname;
 ArrayList <subject> sub = new ArrayList();

public student(String name){
 this.studentname = name;

 
}
    
    
}
public class Gradingsystem {

  
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);     
    boolean app = true; 
     ArrayList <student>studentList = new ArrayList();
      do{
          System.out.println("--------Welcome to Grading System--------");
          System.out.println("1, Insert Student & Subject");
          System.out.println("2, View Student [List]");
          System.out.println("3, Delete Student");
          System.out.println("4, Exit");
          System.out.println("------------------------------------------");
      int input = sc.nextInt();
     
      switch (input){
        
        case 1 -> {  
         sc.nextLine();
         System.out.println("Enter Student name: ");
         String user = sc.nextLine();
         student stud = new student(user);

         
        System.out.println("Enter How many Subject: ");
        int sublist = sc.nextInt();        
          sc.nextLine();
        for(int i = 0; i <sublist; i++){
        System.out.println("Enter Subject name: ");
        String subname = sc.nextLine();
   ;
        System.out.println("Grade: ");
        
        double grade = sc.nextDouble();
        sc.nextLine();
        
        stud.sub.add(new subject(subname, grade));
        }
        studentList.add(stud);
          
        
       
        }
        case 2 -> {
        if (studentList.isEmpty()){
            System.out.println("The List is Empty");
        }else{
          for(student List : studentList ){
              System.out.println("Student Name: "+ List.studentname);
          for (subject subtest : List.sub){
              System.out.println("Subject: "+subtest.namesub +
                                 "| grades: "+subtest.grade);
              
          }  
          
          
          }
          
        }
        
        
        }
        
       case 3 -> {
               sc.nextLine();

                System.out.println("Please Enter Which User You Want to Delete");
                String delete = sc.nextLine();

                boolean removed = studentList.removeIf(s -> 
                    s.studentname.equalsIgnoreCase(delete)
                );

                if (removed) {
                    System.out.println("Student DELETED");
                } else {
                    System.out.println("Student NOT FOUND");
                }
            }


        
        case 4 -> {
         app = false;
         System.out.println("Exiting Program");
        }
      }
            
          
      }while(app);
    }
}
      
    
