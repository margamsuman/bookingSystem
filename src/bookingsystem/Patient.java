/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IT Services
 */
public class Patient extends PSICMembers {
    Appointment app;
    DefaultTableModel dtpatient= new DefaultTableModel();
    Patient(int n,String fName,String Address,String phNumber){
        setPh_number(phNumber);
        setAddress(Address);
        setFullname(fName);
        setNumber(n);
    }
}
