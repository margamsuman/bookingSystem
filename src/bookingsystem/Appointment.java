/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

import java.util.Date;

/**
 *
 * @author IT Services
 */
public class Appointment {
    int treatmentId;
    String treatment;
    Rooms room;
    String datetime;
    String status;
    int patientId;
    int bookingID;
    
    Appointment(){
       room =  new Rooms();
       patientId = 0;
       bookingID = 0;
    }

    public Appointment(int treatmentId, String treatment, String roomname,String roomstatus, String datetime, String status, int patientId, int bookingID) {
        this.treatmentId = treatmentId;
        this.treatment = treatment;
        this.room = new Rooms();
        this.room.setRoom(roomname);
        this.room.setStatus(roomstatus);
        this.datetime = datetime;
        this.status = status;
        this.patientId = patientId;
        this.bookingID = bookingID;
    }
    
   
    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }
    
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

  

  

    public void setDate(String date) {
        this.datetime = date;
    }

   

    public String getDate() {
        return datetime;
    }

   
    
}
