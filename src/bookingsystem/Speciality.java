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
public class Speciality {
    String name;
    Appointment[] appointment = new Appointment[10];
    Speciality(){
        //name = null;
        for (int i = 0; i < 10; i++){
            appointment[i] = new Appointment();
        }
    }

    public String getName() {
        return name;
    }

   

    public void setName(String name) {
        this.name = name;
    }

   
    
}
