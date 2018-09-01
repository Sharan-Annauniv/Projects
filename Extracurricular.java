package extracurricular;
import students.Students;
import academic.Academic;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public  class Extracurricular extends Students 
{
private double extramarks;
public Extracurricular(String name,String department,String rno,double extramarks)
{
    super(name,department,rno);
    
 
     if(extramarks<=0)
            throw new IllegalArgumentException("Extra marks must be>=0");
        this.extramarks=extramarks;
    }
    public void setExtramarks(double extramarks)
    {
     
        if(extramarks<=0)
            throw new IllegalArgumentException("Extra marks must be>=0");
        this.extramarks=extramarks;    
    }
    public double getExtramarks()
    {
        return extramarks;
    }
    
    
    @Override
    public double total()
    {
        return extramarks;
    }
    
    @Override
    public String toString()
    {
        return String.format("Extracurricular:%s%n%s: %,.2f",super.toString(),"Extracurricular activities marks:",getExtramarks());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    

