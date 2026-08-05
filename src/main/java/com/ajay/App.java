package com.ajay;
import java.util.List;
import java.sql.SQLException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n==============================");
            System.out.println(" STUDENT MANAGEMENT SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. View All Students");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\\n========== Add Student ==========");

                    try{
                        
                        System.out.print("Enter Course ID: ");
                        int courseId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        System.out.print("Has Paid Fee (true/false): ");
                        boolean fee = sc.nextBoolean();
                        sc.nextLine();

                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();

                        System.out.print("Enter Course Name: ");
                        String courseName = sc.nextLine();

                        Student student = new Student(courseId, name, fee, course, courseName);

                        int rowsAffected = service.addStudent(student);
                        if (rowsAffected > 0) {
                            System.out.println("Student added successfully!");
                        } else {
                            System.out.println("Failed to add student.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (SQLException e) {
                        System.out.println("Database error: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("\n========== View Student ==========");

                    try{
                        System.out.print("Enter course ID");

                        int courseId=sc.nextInt();
                        sc.nextLine();

                        Student student=service.getStudentById(courseId);
                        if(student!=null){
                            System.out.println("\nStudent Found");
                            System.out.println(student);
                        }
                        else{
                            System.out.println("\nStudent Not Found with Course ID:"+courseId);
                        }
                    }
                    catch(IllegalArgumentException e){
                        System.out.println("Error:"+e.getMessage());
                    }
                    catch(SQLException e){
                        System.out.println("Database error:"+e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("\n========== View All Students ==========");

                    try{
                        List<Student> students=service.getAllStudents();
                        if(students.isEmpty()){
                            System.out.println("\nNo Students Found");
                        }
                        else{
                            System.out.println("\nAll Students:");
                            for(Student student:students){
                                System.out.println(student);
                            }
                        }
                    }
                    catch(SQLException e){
                        System.out.println("Database error:"+e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("\n========== Update Student ==========");

                    try{
                        System.out.print("Enter course ID of the student to update:");

                        int courseId=sc.nextInt();
                        sc.nextLine();

                        Student existingStudent=service.getStudentById(courseId);
                        if(existingStudent==null){
                            System.out.println("\nStudent not found with Course Id:"+courseId);
                        }
                        else{
                            System.out.println("\nExisting Student Details:");
                            System.out.println(existingStudent);

                            System.out.println("\nEnter new details (leave blank to keep existing):");

                            System.out.println("\n========== Update Menu ==========");
                            System.out.println("1. Update Name");
                            System.out.println("2. Update Fee Status");
                            System.out.println("3. Update Course");
                            System.out.println("4. Update Course Name");
                            System.out.println("5. Update All Fields");
                            System.out.println("6. Cancel");

                            System.out.print("Enter your choice: ");
                            int updateChoice = sc.nextInt();
                            sc.nextLine();

                            switch (updateChoice) {

                                case 1:
                                    System.out.print("Enter new name:");
                                    existingStudent.setName(sc.nextLine());
                                                       
                                    break;
                                
                                case 2:
                                    System.out.print("Has Paid Fee (true/false):");
                                    existingStudent.setFee(sc.nextBoolean());
                                    sc.nextLine();
                                    break;
                                
                                case 3:
                                    System.out.print("Enter new course");
                                    existingStudent.setCourse(sc.nextLine());
                                    break;
                                
                                case 4:
                                    System.out.print("Enter new course name");
                                    existingStudent.setCourseName(sc.nextLine());
                                    break;
                                
                                case 5:
                                    System.out.print("Enter new name:");
                                    existingStudent.setName(sc.nextLine());

                                    System.out.print("Has Paid Fee (true/false):");
                                    existingStudent.setFee(sc.nextBoolean());
                                    sc.nextLine();

                                    System.out.print("Enter new course:");
                                    existingStudent.setCourse(sc.nextLine());

                                    System.out.print("Enter new course name:");
                                    existingStudent.setCourseName(sc.nextLine());
                                    break;
                                
                                case 6:
                                    System.out.println("Update cancelled.");
                                    break;
                                

                            
                                default:
                                    System.out.println("Invalid choice. Update cancelled.");
                                    break;
                                
                            }
                            if(updateChoice>=1 && updateChoice<=5){
                                int rows=service.updateStudent(existingStudent);
                                if(rows>0){
                                    System.out.println("\nStudent updated successfully.\n");

                                    System.out.println("Updated Student Details");
                                    System.out.println("-------------------------");
                                    System.out.println("Course ID   : " + existingStudent.getCourseId());
                                    System.out.println("Name        : " + existingStudent.getName());
                                    System.out.println("Fee Paid    : " + existingStudent.isFee());
                                    System.out.println("Course      : " + existingStudent.getCourse());
                                    System.out.println("Course Name : " + existingStudent.getCourseName());

                                }
                                   
                            }else{
                                    System.out.println("\nFailed to update student.");
                                }
                            }

                        }catch(IllegalArgumentException e){
                        System.out.println("Error:"+e.getMessage());
                        }
                        catch(SQLException e){
                            System.out.println("Database error:"+e.getMessage());
                        }
                    break;
                case 5:

                    System.out.println("\n========== Delete Student ==========");

                    try{
                        System.out.print("Enter course ID of the student to delete:");
                        int courseId=sc.nextInt();
                        sc.nextLine();

                        Student existingStudent=service.getStudentById(courseId);
                        if(existingStudent==null){
                            System.out.println("\nStudent not found with Course Id:"+courseId);
                        }
                        else{
                            System.out.println(existingStudent);

                            System.out.print("Are you sure? (Y/N): ");
                            char confirm =sc.next().toUpperCase().charAt(0);
                            if(confirm=='Y'){
                                int rows=service.deleteStudent(courseId);
                                if(rows>0){
                                    System.out.println("\nStudent deleted successfully.");
                                }
                                else{
                                    System.out.println("\nFailed to delete student.");
                                }
                            }
                            else{
                                System.out.println("\nDelete operation cancelled.");
                            }
                        }
                    }
                    catch(IllegalArgumentException e){
                        System.out.println("Error:"+e.getMessage());
                    }
                    catch(SQLException e){
                        System.out.println("Database error:"+e.getMessage());
                    }
                    break;

                case 6:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }

        }

    }

}
