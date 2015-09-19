/**
 * Created by ridi on 9/20/2015.
 */
public class Room {
    private String hallName;
    private int roomNo;
    private Boolean status;

    public Room(){

    }
    public Room(String hall1,int r1)
    {
        hallName = hall1;
        roomNo = r1;
        status = false;
    }
    public String getHallName()
    {
        return hallName;
    }
    public void setHallName(String hall)
    {
        hallName = hall;
    }
    public int getRoomNo()
    {
        return roomNo;
    }
    public void setRoomNo(int r)
    {
        roomNo = r;
    }
    public Boolean getStatus()
    {
        return status;
    }
    public void setStatus(Boolean b)
    {
        status = b;
    }
    public void print()  {

        if (status == false )
            System.out.println("Room No" + "," + getRoomNo() + " " + "of" + " " + getHallName() + " " + "is currently available.");
        else
            System.out.println("Room No" + "," + getRoomNo() + " " + "of" + " " + getHallName() + " " + "is alloted.");

    }
}
