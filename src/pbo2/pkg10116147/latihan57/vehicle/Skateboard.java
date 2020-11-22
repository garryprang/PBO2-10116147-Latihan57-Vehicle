package pbo2.pkg10116147.latihan57.vehicle;

/*
 * @author
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM       : 10119065
 * Deskripsi : Program untuk menampilkan deskripsi kendaraan.
 */
public class Skateboard extends Vehicle{
    private double myBoardLength;

    public Skateboard(String myBrand, String myModel) {
        super(myBrand, myModel);
    }

    public double getBoardLength() {
        return myBoardLength;
    }

    public void setBoardLength(double BoardLength) {
        this.myBoardLength = BoardLength;
    }
    
    
}
