package pbo2.pkg10116147.latihan57.vehicle;

/*
 * @author
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM       : 10119065
 * Deskripsi : Program untuk menampilkan deskripsi kendaraan.
 */
public class Bicycle extends Vehicle{
    private int myGearCount;

    public Bicycle(String myBrand, String myModel) {
        super(myBrand, myModel);
    }

    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int GearCount) {
        this.myGearCount = GearCount;
    }
    
    
}
