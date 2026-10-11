public class Bacaan {
    private String judul;
    private String penulis;
    private final int tahunTerbit;

    public Bacaan(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getInfo() {
        return "Judul: " + judul;
    }

    // Overloading
    public String getInfo(boolean lengkap) {
        if (lengkap) {
            return "Judul: " + judul
                    + "\nPenulis: " + penulis
                    + "\nTahun Terbit: " + tahunTerbit;
        }
        return getInfo();
    }

    public int hitungDenda(int hari) {
        return hari * 1000;
    }

    public final int getTahunTerbit() {
        return tahunTerbit;
    }
}
