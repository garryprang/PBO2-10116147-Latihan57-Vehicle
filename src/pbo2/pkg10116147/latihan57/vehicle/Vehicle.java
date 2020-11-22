package pbo2.pkg10116147.latihan57.vehicle;

/*
 * @author
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM       : 10119065
 * Deskripsi : Program untuk menampilkan deskripsi kendaraan.
 */
public class Vehicle {
    private String myBrand, myModel;

    public Vehicle(String myBrand, String myModel) {
        this.myBrand = myBrand;
        this.myModel = myModel;
        System.out.println("Merk: "+myBrand);
        System.out.println("Model: "+myModel);
    }

    public String getMyBrand() {
        return myBrand;
    }

    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public String getMyModel() {
        return myModel;
    }

    public void setMyModel(String myModel) {
        this.myModel = myModel;
    }
}
