public class Buku {
    private int isbn;
    private String judul;
    private String kategori;
    private int hargaPinjam;
    private String status;

    public Buku(int isbn, String judul, String kategori, int hargaPinjam, String status) {
        this.isbn = isbn;
        this.judul = judul;
        this.kategori = kategori;
        this.hargaPinjam = hargaPinjam;
        this.status = status;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getHargaPinjam() {
        return hargaPinjam;
    }

    public void setHargaPinjam(int hargaPinjam) {
        this.hargaPinjam = hargaPinjam;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "isbn=" + isbn +
                ", judul='" + judul + '\'' +
                ", kategori='" + kategori + '\'' +
                ", hargaPinjam=" + hargaPinjam +
                ", status='" + status + '\'' +
                '}';
    }
}
