public class Majalah extends Bacaan {
    private int edisi;
    private String periode;

    public Majalah(String judul, String penulis, int tahunTerbit,
                   int edisi, String periode) {

        super(judul, penulis, tahunTerbit);
        this.edisi = edisi;
        this.periode = periode;
    }

    // Overriding
    public String getInfo() {
        return super.getInfo()
                + "\nEdisi: " + edisi
                + "\nPeriode: " + periode;
    }

    // Overriding
    public int hitungDenda(int hari) {
        return hari * 1500;
    }
}
