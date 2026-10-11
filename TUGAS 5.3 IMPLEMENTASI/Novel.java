public class Novel extends Bacaan {
    private String genre;
    private int jumlahHalaman;

    public Novel(String judul, String penulis, int tahunTerbit,
                 String genre, int jumlahHalaman) {

        super(judul, penulis, tahunTerbit);
        this.genre = genre;
        this.jumlahHalaman = jumlahHalaman;
    }

    // Overriding
    public String getInfo() {
        return super.getInfo()
                + "\nGenre: " + genre
                + "\nJumlah Halaman: " + jumlahHalaman;
    }

    // Overriding
    public int hitungDenda(int hari) {
        return hari * 2000;
    }
}