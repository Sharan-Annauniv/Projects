/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 *
 * @author lenovo
 */
public abstract class Students {

    private final String name;
    private final String rno;
    private final String department;
    
    public Students(String name,String department,String rno)
    {
        this.name=name;
        this.department=department;
        this.rno=rno;
        
    }
    public String getName()
    {
        return name;
    }
    public String getRno()
    {
        return rno;
    }
    public String getDepartment()
    {
        return department;
    }
    
    
    @Override
    public String toString()
    {
       return String.format("%s%s%nRoll no:%s",getName(),getDepartment(),getRno());
    }
    public abstract double total();
}
    
    
   
    
    

