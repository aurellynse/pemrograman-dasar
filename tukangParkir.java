import java.util.Scanner;

public class tukangParkir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double biaya = 0;
        
        //get parking information
        System.out.print("Berapa menit waktu parkir? ");
        double menitParkir = in.nextDouble();
        
        in.nextLine(); //line after int input
        
        System.out.print("Apa jenis kendaraan yang digunakan? ");
        String kendaraan = in.nextLine();
        
        //selection based on types of vehicles (kendaraan)
        if (kendaraan.equalsIgnoreCase("mobil"))
        {
            //selection based on time (menitParkir)
            if (menitParkir<=0)
            {
                System.out.println("Misiiii input ga valid nihh!!"); //time can't be negative
            }
            else if (menitParkir<=5)
            {
                System.out.printf("Biaya parkir %s hanya Rp 3,000.00 karena hanya %.0f menit.\n", kendaraan, menitParkir);
            }
            else if (menitParkir<=120) //above 5 minutes, under 120 minutes
            {
                biaya = 5000; //storing the cost in a variable for future use
            }
            else //above 120 minutes
            {
                biaya = (5000 + (((menitParkir-120.0)/10)*2000)); //storing the cost in a variable for future use
                //each 10 minutes after the second hour adds up with 2000
            }
        }
        //selection based on types of vehicles (kendaraan)
        else if (kendaraan.equalsIgnoreCase("motor"))
        {
            //selection based on time (menitParkir)
            if (menitParkir<=0)
            {
                System.out.println("Misiiii input ga valid nihh!!");
            }
            else if (menitParkir<=5) 
            {
                System.out.printf("Biaya parkir %s hanya Rp 3,000.00 karena hanya %.0f menit.\n", kendaraan, menitParkir);
            }
            else if (menitParkir<=120) //above 5 minutes, under 120 minutes
            {
                biaya = 5000; //storing the cost in a variable for future use
            }
            else 
            {
                biaya = (5000 + (((menitParkir-120.0)/10)*1000)); //storing the cost in a variable for future use
                //each 10 minutes after the second hour adds up with 2000

            }
        }
        else //kendaraan not equal mobil or motor
        {
            System.out.println("Jalan kaki tidak perlu bayar parkir");
        }
        
        //the output
        double jamParkir = (menitParkir/60);
        System.out.printf("Biaya parkir %s selama %.1f jam adalah Rp %,.2f", kendaraan, jamParkir, biaya);
        in.close();
    }
}