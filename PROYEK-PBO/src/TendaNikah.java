public class TendaNikah extends Tenda implements Data2 {
    String[] dekorasi = {"Tipe A", "Tipe B", "Tipe C"};

    @Override
    public void cetak_data() {
        System.out.println("      DAFTAR DEKORASI TENDA NIKAH");
        System.out.println("______________________________________");
        System.out.println("NO           DEKORASI         HARGA");
        System.out.println("______________________________________");
    }

    @Override
    void view_data() {
        harga= 8000000;
        for(int i=0; i< dekorasi.length; i++) {
            System.out.println("2" + i + "            " + dekorasi[i] + "          " + harga);
            System.out.println("______________________________________");
            harga = harga + 2000000;
        }
    }

    @Override
    public final void ukuran() {
        System.out.println("Seluruh ukuran tenda nikah adalh 12x7");
        System.out.println("======================================");
        System.out.println("");
    }
}

