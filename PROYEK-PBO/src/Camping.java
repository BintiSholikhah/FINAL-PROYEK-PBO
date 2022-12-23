public class Camping extends Tenda implements Data2{
    String[] merek = {"Eiger Shira", "Consina Magn", "Naturehikee"};

    @Override
    public void cetak_data() {
        System.out.println("       DAFTAR TENDA CAMPING");
        System.out.println("______________________________________");
        System.out.println("NO           MEREK            HARGA");
        System.out.println("______________________________________");
    }

    @Override
    void view_data() {
        harga= 400000;
        for(int i=0; i< merek.length; i++){
            System.out.println("1"+i+"        "+merek[i]+"        "+harga);
            System.out.println("______________________________________");
            harga=harga+200000;
        }
    }

    @Override
    public final void ukuran() {
        System.out.println("Seluruh ukuran Tenda Camping 3x4");
        System.out.println("======================================");
    }
}


