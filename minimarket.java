import java.util.Scanner;

public class minimarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        
        //input transaction data
        System.out.print("Tanggal berapa transaksi dilakukan? ");
        int tanggalBeli = input.nextInt();
        
        System.out.print("Bulan berapa transaksi dilakukan? ");
        int bulanBeli = input.nextInt();
        
        System.out.print("Tahun berapa transaksi dilakukan? ");
        int tahunBeli = input.nextInt();
        
        input.nextLine(); //line after int
        
        System.out.print("Barang apa yang dibeli? ");
        String belanjaBarang = input.nextLine();
        
        System.out.print("Berapa jumlah barang yang dibeli? ");
        int jumlahBarang = input.nextInt();
        
        System.out.print("Berapa harga barang yang dibeli? ");
        double hargaBarang = input.nextDouble();
        
        System.out.print("Berapa persen diskonnya? ");
        float diskon = input.nextFloat();
        
        System.out.print("Tunai? ");
        boolean jenisPembayaran = input.nextBoolean();
        
        double totalHarga = (jumlahBarang*hargaBarang); //total price before discount
        double jumlahPembayaran = (totalHarga-(totalHarga*diskon/100)); //total price after discount
        
        //receipt
        System.out.println("========= List Barang =========");
        System.out.printf("%-16s : %d-%d-%d\n", "Tanggal", tanggalBeli, bulanBeli, tahunBeli);
        System.out.printf("%-16s : %s\n", "Barang belanja", belanjaBarang);
        System.out.printf("%-16s : %d\n", "Jumlah barang", jumlahBarang);
        System.out.printf("%-16s : %,.2f\n", "Harga barang", hargaBarang);
        System.out.printf("%-16s : %.1f %%\n", "Diskon", diskon);
        System.out.println("-------------------------------");
        System.out.printf("%-16s : Rp%,.2f\n", "Total harga", totalHarga);
        System.out.printf("%-16s : Rp%,.2f\n", "Pembayaran", jumlahPembayaran);
        System.out.printf("%-16s : %b\n", "Pembayaran tunai", jenisPembayaran);
        
        input.close();
    }
}