import java.io.FileNotFoundException;
import java.util.Scanner;

public class Penyewaan extends Penyewa implements Data2{
    int id;
    String nama;
    long telepon;
    public int kode;
    public String tanggal_sewa;
    public int lama_sewa;
    public int jumlah;
    public int bayar;
    public int pilihan;
    Scanner input = new Scanner(System.in);
    Tenda tenda1 = new Tenda();
    Penyewa penyewa = new Penyewa();

    void input_data1(){
        System.out.print("ID Penyewa    : ");
        id = input.nextInt();
        System.out.print("NAMA Penyewa  : ");
        nama = input.next();
        System.out.print("Telepon       : ");
        telepon = input.nextLong();
    }

    void input_data2(){
        System.out.println();
        System.out.print("Kode Sewa    : ");
        kode = input.nextInt();
        System.out.print("Tanggal sewa : ");
        tanggal_sewa = input.next();
        System.out.print("Lama Sewa    : ");
        lama_sewa = input.nextInt();
        System.out.print("jumlah       : ");
        jumlah = input.nextInt();
    }

    static int total_bayar(int a, int b, int c){  // method function
        int total = a*b*c;
        return total;
    }
    void pilih_tenda() {
        System.out.print("ID tenda pilihan anda : ");
        pilihan = input.nextInt();
        if (pilihan == 10) {
            tenda1.no_tenda = 10;
            tenda1.jenis = "Eiger Shira";
            tenda1.harga = 400000;
        } else if (pilihan == 11) {
            tenda1.no_tenda = 11;
            tenda1.jenis = "Consina Magnum";
            tenda1.harga = 600000;
        } else if (pilihan == 12) {
            tenda1.no_tenda = 12;
            tenda1.jenis = "Naturehike";
            tenda1.harga = 800000;

        } else if (pilihan == 20) {
            tenda1.no_tenda = 20;
            tenda1.jenis = "Tipe A";
            tenda1.harga = 8000000;
        } else if (pilihan == 21) {
            tenda1.no_tenda = 21;
            tenda1.jenis = "Tipe B";
            tenda1.harga = 10000000;
        } else if (pilihan == 22) {
            tenda1.no_tenda = 22;
            tenda1.jenis = "Tipe C";
            tenda1.harga = 12000000;
        } else {
            System.out.println("Maaf pilihan tidak tersedia.");
        }
    }
    @Override
    public void cetak_data() {
        bayar = total_bayar(tenda1.harga, lama_sewa, jumlah);
        //tenda1.harga, lama_sewa, jumlah : merupakan argumen
        System.out.println("======================================");
        System.out.println("       NOTA Penyewaan Tenda");
        System.out.println("--------------------------------------");
        System.out.println("Kode Sewa   : "+ kode);
        System.out.println("--------------------------------------");
        System.out.println("Nama Penyewa: " + nama);
        System.out.println("ID          : " + id);
        System.out.println("No Hp       : " + telepon);
        System.out.println("--------------------------------------");
        System.out.println("Tanggal sewa      : "+tanggal_sewa);
        System.out.println("Lama Sewa         : " +lama_sewa+" hari");
        System.out.println("jumlah            : "+jumlah+ " tenda");
        System.out.println("No Tenda          : " + tenda1.no_tenda);
        System.out.println("Jenis/Merk        : " + tenda1.jenis);
        System.out.println("Harga             : " + tenda1.harga);
        System.out.println("Total Bayar       : " + bayar);
        System.out.println("--------------------------------------");
    }
    public void print_data(){
        java.io.File file = new java.io.File("Struk.txt");
        try{
            java.io.PrintWriter output = new java.io.PrintWriter(file);
            output.println("======================================");
            output.println("       NOTA Penyewaan Tenda");
            output.println("--------------------------------------");
            output.println("Kode Sewa   : "+kode);
            output.println("--------------------------------------");
            output.println("Nama Penyewa: " + nama);
            output.println("ID          : " + id);
            output.println("--------------------------------------");
            output.println("Tanggal sewa      : "+tanggal_sewa);
            output.println("Lama Sewa         : " +lama_sewa+" hari");
            output.println("jumlah            : "+jumlah+ " tenda");
            output.println("No Tenda          : " + tenda1.no_tenda);
            output.println("Jenis/Merk        : " + tenda1.jenis);
            output.println("Harga             : " + tenda1.harga);
            output.println("Total Bayar       : " + bayar);
            output.println("--------------------------------------");
            output.println("Petugas: Bambang Irianto");
            output.println("NIP    : 1900089701");
            output.println("======================================");
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Tidak ditemukan");;
        }
    }
}
