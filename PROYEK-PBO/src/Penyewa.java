import java.io.FileNotFoundException;
import java.util.Scanner;
public class Penyewa extends Data{
    @Override
    void tampil() { // DARI CLASS ABSTRACT
        System.out.println("      ## MASUKKAN DATA PENYEWA ##");
    }

    int id;
    String nama;
    long telepon;

    public int getId() {
        return id;
    }

    public void setId() {
        int id = 0;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama() {
        String nama = "";
        this.nama = nama;
    }

    public long getTelepon() {
        return telepon;
    }

    public void setTelepon(long telepon) {
        this.telepon = telepon;
    }
}
