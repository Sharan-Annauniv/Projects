
package academic;
import students.Students;



public class Academic extends Students {
    
    private double academicmarks;
     
    public Academic(String name,String department,String rno,double academicmarks)
    {
        super(name,department,rno);       
        if(academicmarks<=0)
            throw new IllegalArgumentException("Academic marks must be>=0");
        this.academicmarks=academicmarks;
    }

    
    public void setAcademicmarks(double academicmarks)
    {
     
        if(academicmarks<=0)
            throw new IllegalArgumentException("Academic marks must be>=0");
        this.academicmarks=academicmarks;    
    }
    public double getAcademicmarks()
    {
        return academicmarks;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double total()
    {
        return academicmarks;
    }
        
    
    @Override
    public String toString()
    {
        return String.format("Academics:%s%n%s:%,.2f",super.toString(),"Academic marks",getAcademicmarks());
    }
    
    
    
    
}
