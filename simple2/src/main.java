package tr.edu.maltepe.oop;

public class main {

    public static void main(String[] args)
    {
        Student Student1=new Student("lama",19060424,"computer eng");
        Student Student2=new Student("yousef",19060333,"industrial eng");
        Student Student3=new Student("ibrahim",190706815,"software eng");
        Profesor profesor1=new Profesor("asaf",21335875);
        Profesor profesor2=new Profesor("ensar",2135537);

        System.out.println("Student2 name:"+student2.getName()+"\nStudent3 num:"+student3.getStudentNum());

    }
}
