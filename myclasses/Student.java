package myclasses;
public class Student
{
  private int id;
  private int grade;
  private String name;

  // Constructors
  public Student(int input_id, int input_grade, String input_name)
  {
    id = input_id;
    grade = input_grade;
    name = input_name;
  }

  public void setID(int id){this.id = id;}

  public void setGrade(int grade){this.grade = grade;}

  public void setName(String name){this.name = name;}

  public String toString()

  {
    return "ID: " + id + "\nName: " + name + "\nGrade: " + grade;
  }
}
