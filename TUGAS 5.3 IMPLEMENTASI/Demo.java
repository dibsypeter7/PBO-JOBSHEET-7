public class Demo {
    public static void main(String[] args) {

        Bacaan bacaan = new Bacaan("Buku Umum", "Andi", 2020);

        Novel novel = new Novel(
            "Laskar Pelangi", "Andrea Hirata", 2005,
            "Fiksi", 529
        );

        Majalah majalah = new Majalah(
            "National Geographic", "Redaksi", 2024,
            10, "Oktober"
        );

        // Overloading
        System.out.println("=== OVERLOADING ===");
        System.out.println(bacaan.getInfo());
        System.out.println(bacaan.getInfo(true));

        // Overriding
        System.out.println("\n=== OVERRIDING ===");

        Bacaan b1 = novel;
        Bacaan b2 = majalah;

        System.out.println(b1.getInfo());
        System.out.println("Denda: Rp" + b1.hitungDenda(3));

        System.out.println();

        System.out.println(b2.getInfo());
        System.out.println("Denda: Rp" + b2.hitungDenda(3));

        // Final
        System.out.println("\n=== FINAL ===");
        System.out.println("Tahun Terbit Novel: "
                + novel.getTahunTerbit());
    }
}