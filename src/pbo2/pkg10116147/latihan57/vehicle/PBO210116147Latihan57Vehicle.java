package pbo2.pkg10116147.latihan57.vehicle;

/*
 * @author
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM       : 10119065
 * Deskripsi : Program untuk menampilkan deskripsi kendaraan.
 */
public class PBO210116147Latihan57Vehicle {
    
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Trek Bike", "7.4FX");
        bicycle.setGearCount(23);
        System.out.println("Jumlah Gear: "+bicycle.getGearCount());
        System.out.println("");
    
        Skateboard skateboard = new Skateboard("Ally Skate", "Rocket");
        skateboard.setMyModel("5.45");
        System.out.println("Panjang Board: "+skateboard.getMyModel());
    }
    
}
