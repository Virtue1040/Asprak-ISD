public class Resep {
    private String nama;
    private String bahanUtama;
    private int waktuMemasak;

    public Resep(String nama, String bahanUtama, int waktuMemasak) {
        this.nama = nama;
        this.bahanUtama = bahanUtama;
        this.waktuMemasak = waktuMemasak;
    }

    public String getNama() {
        return nama;
    }

    public String getBahanUtama() {
        return bahanUtama;
    }

    public int getWaktuMemasak() {
        return waktuMemasak;
    }

    @Override
    public String toString() {
        return String.format("Resep = [namaResep : %s, bahanUtama : %s, waktuMemasak : %s Menit]", nama, bahanUtama, waktuMemasak);
    }
}
