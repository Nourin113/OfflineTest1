/**
 * Created by ridi on 9/20/2015.
 */
public class Student {
    private String studentName;
    private String studentNo;
    private Room room;

    public Student() {

    }
    public Student(String s, String n , Room r)
    {
        studentName = s ;
        studentNo = n ;
        room = r;
    }
    public Room getRoom()
    {
        return room;
    }

    public void setRoom(Room r)
    {
        room = r;
    }
    public String getStudentName(){
        return studentName ;
    }
    public void setStudentName(String s){
        studentName = s ;
    }
    public String getStudentNo(){
        return studentNo ;
    }
    public void setStudentNo(String n){
        studentNo = n ;
    }
    public void print() {
        System.out.println("Student No:" + getStudentNo() + "," + getStudentName() + "," + "resides on" + " " + room.getHallName() + "," + "Room No" + "," +  room.getRoomNo() + ".");
    }



}
