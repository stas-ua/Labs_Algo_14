/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs_algo_14;

/**
 *
 * @author admin
 */
public class Student {
   
    private String Name;
    private String LastName;
    private int groupNumber;
    private String faculty;
   
    
    public Student(String n, String ln, String fcl, int grNo)
    {
        Name = n;
        LastName = ln;
        groupNumber = grNo;
        this.faculty = fcl;
        
        
    }
    

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the year
     */
    public int getGroupNumber() {
        return groupNumber;
    }

    /**
     * @param groupNumber the year to set
     */
    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    
    public String getFaculty() {
        return faculty;
    }

   
    public void setFaculty(String fcl) {
        this.faculty = fcl;
    }


    
}
