import java.util.Scanner;

public class pln {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    

        System.out.println("Program penghitung pemakaian listrik sederhana");
        
        //Menerima input
        System.out.printf("%-15s : ", "Masukkan Nama");
        String nama = in.nextLine();

        System.out.printf("%-11s : ", "Kelurahan");
        String kelurahan = in.nextLine();

        System.out.printf("%-33s : ", "Masukkan posisi awal Kwh Meter");
        int kwhawal = in.nextInt();

        System.out.printf("%-33s : ", "Masukkan posisi akhir Kwh Meter");
        int kwhakhir = in.nextInt();

        System.out.printf("%-33s : ", "Masukkan biaya beban saat ini");
        int beban = in.nextInt();

        System.out.printf("%-33s : ", "Masukkan PPJ (dalam persen)");
        int ppj = in.nextInt();

        //Memroses input
        int pemakaian = (kwhakhir-kwhawal);
        int tarif = (pemakaian*beban);
        int ppj2 = (tarif*ppj/100);
        int total = (tarif+ppj2);

        //Output tagihan
        System.out.println("===================PLN Java===================");
        System.out.printf("%-13s : %s\n", "Nama", nama);
        System.out.printf("%-13s : %s\n", "Kelurahan", kelurahan);
        System.out.printf("%-23s : %s Kwh Meter\n", "Pemakaian bulan ini", pemakaian);
        System.out.printf("%-13s : Rp %d,-\n", "Tarif Listrik", tarif);
        System.out.printf("%-13s : Rp %d,-\n", "PPJ "+ppj+"%", ppj2);
        System.out.printf("%-13s : Rp %d,-\n", "Total Bayar", total);
        System.out.println("==============================================");
    }
}
