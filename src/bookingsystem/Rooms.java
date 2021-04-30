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
public class Rooms {
    private String room;
    private String status;
    Rooms(){
        room = null;
        status = null;
    }
    public void setRoom(String room) {
        this.room = room;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRoom() {
        return room;
    }

    public String getStatus() {
        return status;
    }
    
}
