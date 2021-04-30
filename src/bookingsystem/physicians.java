/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

/**
 *
 * @author IT Services
 */
public class physicians extends PSICMembers {
    Speciality speciality[]=new Speciality[3];
    String consultationHours[] = new String[4];
    
   // Appointment monthAppointment[] = new Appointment[30];
    physicians(){
        
    }
    physicians(int n,String fName,String Address,String phNumber){
        
        setPh_number(phNumber);
        setAddress(Address);
        setFullname(fName);
        setNumber(n);
        for(int i = 0; i< 3;i++){
            speciality[i] = new Speciality();
        }
         for(int i = 0; i< 4;i++){
            consultationHours[i] = new String();
        }
  
       
    }
    physicians(physicians p){
        System.out.println("going in constructor");
        setPh_number(p.getPh_number());
        setAddress(p.getAddress());
        setFullname(p.getFullname());
        setNumber(p.getNumber());
        System.out.println("going in constructor part 2");
        for(int i = 0; i< p.speciality.length;i++){
             System.out.println("going in constructor part 3");
            speciality[i] = new Speciality();
            speciality[i].name = p.speciality[i].name;
            for(int j=0;j<p.speciality[i].appointment.length;j++){
                System.out.println("going in constructor part 4");
                speciality[i].appointment[j] = p.speciality[i].appointment[j];
            }
        }
         for(int i = 0; i< p.consultationHours.length;i++){
            consultationHours[i] = new String();
            consultationHours[i] = p.consultationHours[i];
        }
  
    }
    
     // Copy factory
    public static physicians newInstance(physicians ph) {
        return new physicians(ph);
    }
    
    void printdata(){
        System.out.println(getAddress());
        System.out.println(getFullname());
        System.out.println(getPh_number());
        System.out.println(getNumber());
        for (int i=0;i<speciality.length;i++){
            System.out.println("Speciality Area:" + speciality[i].name);
            for (int j=0;j<speciality[i].appointment.length;j++)
                System.out.println("Treatment Area:" + speciality[i].appointment[j]);
        }
    }
    
    
   
    
     
}
