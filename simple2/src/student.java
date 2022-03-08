package tr.edu.maltepe.oop;

public class Student {
    private String Name,Department;
    private int StudentNum;
    public Student(String name,int studentNum,String department)
    {
        this.Name=name;
        this.StudentNum=studentNum;
        this.Department=department;
    }
    public String getName()
    {
        return  Name;
    }
    public int getStudentNum()
    {
        return  StudentNum;
    }
    public String getDepartment()
    {
        return  Department;
    }
}
