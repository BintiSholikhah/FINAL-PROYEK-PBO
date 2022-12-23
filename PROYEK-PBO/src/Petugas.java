public class Petugas extends Data {
    private int id_petugas;
    private String nama_petugas;
    public int getId_petugas() {
        return id_petugas;
    }

    @Override
    void tampil() { // DARI CLASS ABSTRACT
        System.out.println("Penanggung Jawab");
    }


    public void setId_petugas(int id_petugas) {
        this.id_petugas = id_petugas;
    }

    public String getNama_petugas() {
        return nama_petugas;
    }

    public void setNama_petugas(String nama_petugas) {
        this.nama_petugas = nama_petugas;
    }

}
