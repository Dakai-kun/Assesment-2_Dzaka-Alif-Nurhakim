public class WorkOrder implements Comparable {
    private int id;
    private String name;
    private int date;
    private String type;
    private String address;


    public WorkOrder(int aId, String aName, int aDate, String aType, String aAddress) {
        id = aId;
        name = aName;
        int dateDiff;
        type = aType;
        if (type == "kilat") {
            dateDiff = aDate + 1;
        }else if (type == "express") {
            dateDiff = aDate + 2;
        }else if (type == "biasa") {
            dateDiff = aDate + 3;  
        }else{
            dateDiff = aDate;
        }
        date = dateDiff;
        address = aAddress;
    }

    public String toString() {
        return "ID Paket " + id + " namaPelanggan = " + name + " alamatPelanggan = " + address; 
    }
    @Override
    public int compareTo(Object otherObject) {
        WorkOrder other = (WorkOrder) otherObject;
        if (date < other.date) return -1;
        if (date > other.date) return 1;
        return 0;
    }
}
