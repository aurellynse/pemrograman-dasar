import java.util.Scanner;

public class upah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%-13s : ", "Jam kerja"); //formatted
        int jam = in.nextInt();

        int upah=0;
        int lembur=0;
        int denda=0; //initialized to avoid garbage value

        //selection based on working hours
        if (jam>=60)
        {
            upah = (60*5000);
            lembur = ((jam-60)*6000); //for each extra hour after 60 is paid 6000
        } 
        else if (jam>50)
        {
            upah = (jam*5000);
        }
        else
        {
            upah = (jam*5000);
            denda = ((50-jam)*1000); //for each hour under 50 is counted towards Denda (1000 per hour)
        }

        System.out.printf("%-6s = Rp. %d\n", "Upah", upah);
        System.out.printf("%-6s = Rp. %d\n", "Lembur", lembur);
        System.out.printf("%-6s = Rp. %d\n", "Denda", denda);
        System.out.println("---------------------");
        System.out.printf("%-6s = Rp. %d\n", "Total", (upah+lembur-denda));

        in.close();
    }   
}
