package tr.edu.maltepe.oop;

public class Profesor {
    private  int IdNumber;
    private String Name;
    public Profesor(String name,int idNumber)
    {
        this.Name=name;
        this.IdNumber=idNumber;
    }
    public int getIdNumber()
    {
        return  IdNumber;
    }
    public String getName()
    {
        return Name;
    }
}