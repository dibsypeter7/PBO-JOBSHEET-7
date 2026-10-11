public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public int getLembur() {
        return lembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    // Overloading
    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }

    // Overriding
    @Override
    public double getGaji() {
        return super.getGaji() + lembur * gajiLembur;
    }

    public void lihatInfo() {
        System.out.println("NIP : " + getNip());
        System.out.println("Nama : " + getNama());
        System.out.println("Golongan : " + getGolongan());
        System.out.println("Jml Lembur : " + getLembur());
        System.out.printf("Gaji Lembur : %.0f%n", getGajiLembur());
        System.out.printf("Gaji : %.0f%n", getGaji());
    }
}