public class Manager extends Karyawan {
    private double tunjangan;
    private String bagian;
    private Staff[] st;

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public String getBagian() {
        return bagian;
    }

    public void setStaff(Staff[] st) {
        this.st = st;
    }

    public void viewStaff() {
        System.out.println("--------------------");

        if (st != null) {
            for (int i = 0; i < st.length; i++) {
                st[i].lihatInfo();
            }
        }

        System.out.println("--------------------");
    }

    public void lihatInfo() {
        System.out.println("Manager : " + getBagian());
        System.out.println("NIP : " + getNip());
        System.out.println("Nama : " + getNama());
        System.out.println("Golongan : " + getGolongan());
        System.out.printf("Tunjangan : %.0f%n", getTunjangan());
        System.out.printf("Gaji : %.0f%n", getGaji());
        System.out.println("Bagian : " + getBagian());

        viewStaff();
    }

    // Overriding
    @Override
    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
}