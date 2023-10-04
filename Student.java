public class Student {
  private  String name;
  private int age;
  private  char grade;

  public void setname(String name){
    this.name = name; 
  }
  public String getname() {
    return name;
  }
  public void setage(int age){
    this.age = age; 
  }
  public int getage() {
    return age;
  }
public void setgrade(char grade){
    this.grade = grade; 
  }
  public char getgrade() {
    return grade;
  }
  public void displayInfo(){
    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
    System.out.println("Grade:"+grade);

  }
}
  class Main {
    public static void main (String[] args){
        Student s = new Student();
        s.setname ("ABC");
        s.setage (24);
        s.setgrade('A');
        s.displayInfo();
    }
  }

    

