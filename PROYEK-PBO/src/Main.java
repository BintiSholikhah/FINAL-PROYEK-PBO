public class Main {
    public Main(){
        System.out.println("Program Dibuat oleh Binti Sholikhah");
    }
    static void aplikasi(){  //prosedur
        System.out.println("        APLIKASI PENYEWAAN TENDA");
    }
    static void garis(){    // method static
        System.out.println("======================================");
    }
    static void ucapin(String ucapan){  // method dengan parameter
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        Petugas petugas1 = new Petugas();
        Main x = new Main();
        petugas1.setId_petugas(1900089701);
        petugas1.setNama_petugas("Bambang Iriyanto");
        garis();
        // pemanggilan prosedur aplikasi
        aplikasi();
        garis();
        // pemanggilan
        ucapin("            Selamat Datang");
        ucapin("       Kerja Keras, Duit Melimpah ");
        ucapin("--------------------------------------");

        try{
            Penyewaan penyewaan1 = new Penyewaan();
            penyewaan1.input_data1();
            garis();
            Tenda tenda1 = new Tenda();
            tenda1.view_data();
            Data pa = new Penyewa();
            pa.tampil();
            penyewaan1.input_data2();
            penyewaan1.pilih_tenda();
            penyewaan1.cetak_data();
            penyewaan1.print_data();
            Data ptgs = new Petugas(); //pemanggilan abstract
            ptgs.tampil();
            System.out.println("ID Petugas        : " + petugas1.getId_petugas());
            System.out.print    ln("Nama Petugas      : " + petugas1.getNama_petugas());
            garis();
        } catch (Exception e) {
            System.out.println("\nTidak bisa melanjutkan");
            System.out.println("Periksa kemungkinan kesalahan penginputan: ");
            System.out.println(" - Penggunaan spasi diganti dengan tanda (-)");
            System.out.println(" - Salah dalam memasukkan huruf atau angka");
        }
    }
}