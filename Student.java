public class Student 
{
    // Data memebers name, id, and gpa
    private String name;
    private int id;
    private double gpa;

    // Constructor
    public Student(String studentName, int studentId, double studentGPA)
    {
        this.name = studentName;
        this.id = studentId;
        this.gpa = studentGPA;
    }

    // Getters for a student's name, ID, and GPA
    public String getStudentName()
    {
        return this.name;
    }

    public int getStudentID()
    {
        return this.id;
    }

    public double getStudentGPA()
    {
        return this.gpa;
    }

    // Setters for a student's GPA
    public void setGPA(double newGPA)
    {
        this.gpa = newGPA;
    }

    // Method to display student information
    public void displayStudent()
    {
        System.out.println("The student " + this.name + " has an ID of " + this.id + " with a GPA of " + this.gpa + ".");
    }

    // Main method
    public static void main(String[] args)
    {
        // Creating a student called Lisa Waddell
        Student studentLisa = new Student("Lisa Waddell", 54321, 2.5);

        // Calling the displayStudent method
        studentLisa.displayStudent();
    }
}
