import java.util.Scanner;

public class Tenda {
    protected int no_tenda;
    protected String jenis;
    protected int harga;

    void view_data() {
        TendaNikah tenda1 = new TendaNikah ();
        Camping tenda2 = new Camping();
        tenda1.cetak_data();
        tenda1.view_data();
        tenda1.ukuran();
        tenda2.cetak_data();
        tenda2.view_data();
        tenda2.ukuran();
    }
    public void ukuran(){
        System.out.println(" ");
    }
}

