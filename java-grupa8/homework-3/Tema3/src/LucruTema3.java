
public class LucruTema3 {

    static AgentiVanzariFirma[] ag = new AgentiVanzariFirma[20];

    /**
     * @author Created by Alina Moldovan on 7/31/2017.
     */

    public static void main(String[] args) {
        ag[0] = new AgentiVanzariFirma();
        ag[0].nume = "Agent1_1";
        ag[0].vanzari = 1800;
        ag[0].dep = 1;
        ag[1] = new AgentiVanzariFirma();
        ag[1].nume = "Agent1_2";
        ag[1].vanzari = 2000;
        ag[1].dep = 1;
        ag[2] = new AgentiVanzariFirma();
        ag[2].nume = "Agent1_3";
        ag[2].vanzari = 33000;
        ag[2].dep = 1;
        ag[3] = new AgentiVanzariFirma();
        ag[3].nume = "Agent1_4";
        ag[3].vanzari = 5500;
        ag[3].dep = 1;
        ag[4] = new AgentiVanzariFirma();
        ag[4].nume = "Agent1_5";
        ag[4].vanzari = 6000;
        ag[4].dep = 1;
        ag[5] = new AgentiVanzariFirma();
        ag[5].nume = "Agent2_1";
        ag[5].vanzari = 3000;
        ag[5].dep = 2;
        ag[6] = new AgentiVanzariFirma();
        ag[6].nume = "Agent2_2";
        ag[6].vanzari = 4500;
        ag[6].dep = 2;
        ag[7] = new AgentiVanzariFirma();
        ag[7].nume = "Agent2_3";
        ag[7].vanzari = 50000;
        ag[7].dep = 2;
        ag[8] = new AgentiVanzariFirma();
        ag[8].nume = "Agent2_4";
        ag[8].vanzari = 8500;
        ag[8].dep = 2;
        ag[9] = new AgentiVanzariFirma();
        ag[9].nume = "Agent2_5";
        ag[9].vanzari = 8000;
        ag[9].dep = 2;
        ag[10] = new AgentiVanzariFirma();
        ag[10].nume = "Agent3_1";
        ag[10].vanzari = 4500;
        ag[10].dep = 3;
        ag[11] = new AgentiVanzariFirma();
        ag[11].nume = "Agent3_2";
        ag[11].vanzari = 6700;
        ag[11].dep = 3;
        ag[12] = new AgentiVanzariFirma();
        ag[12].nume = "Agent3_3";
        ag[12].vanzari = 100000;
        ag[12].dep = 3;
        ag[13] = new AgentiVanzariFirma();
        ag[13].nume = "Agent3_4";
        ag[13].vanzari = 8500;
        ag[13].dep = 3;
        ag[14] = new AgentiVanzariFirma();
        ag[14].nume = "Agent3_5";
        ag[14].vanzari = 9000;
        ag[14].dep = 3;
        ag[15] = new AgentiVanzariFirma();
        ag[15].nume = "Agent4_1";
        ag[15].vanzari = 5000;
        ag[15].dep = 4;
        ag[16] = new AgentiVanzariFirma();
        ag[16].nume = "Agent4_2";
        ag[16].vanzari = 8000;
        ag[16].dep = 4;
        ag[17] = new AgentiVanzariFirma();
        ag[17].nume = "Agent4_3";
        ag[17].vanzari = 34500;
        ag[17].dep = 4;
        ag[18] = new AgentiVanzariFirma();
        ag[18].nume = "Agent4_4";
        ag[18].vanzari = 9500;
        ag[18].dep = 4;
        ag[19] = new AgentiVanzariFirma();
        ag[19].nume = "Agent4_5";
        ag[19].vanzari = 10000;
        ag[19].dep = 4;

        //total vanzari departamentul nr 1
        double sum1 = 0;
        int dep1 = 0;
        for (int i = 0; i < 5; i++) {
            {
                sum1 = ag[i].vanzari + sum1;
                dep1 = ag[i].dep;
            }
        }
        System.out.println("Total vanzari ale departamentului nr. " + dep1 + ": " + sum1 + " lei");


        //total vanzari departamentul nr 2
        double sum2 = 0;
        int dep2 = 0;
        for (int i = 5; i < 10; i++) {
            sum2 = ag[i].vanzari + sum2;
            dep2 = ag[i].dep;
        }
        System.out.println("Total vanzari ale departamentului nr. " + dep2 + ": " + sum2 + " lei");

        //total vanzari departamentul nr 3
        double sum3 = 0;
        int dep3 = 0;
        for (int i = 10; i < 15; i++) {
            sum3 = ag[i].vanzari + sum3;
            dep3 = ag[i].dep;
        }
        System.out.println("Total vanzari ale departamentului nr. " + dep3 + ": " + sum3 + " lei");

        //total vanzari departamentul nr 4
        double sum4 = 0;
        int dep4 = 0;
        for (int i = 15; i < 20; i++) {
            sum4 = ag[i].vanzari + sum4;
            dep4 = ag[i].dep;
        }
        System.out.println("Total vanzari ale departamentului nr. " + dep4 + ": " + sum4 + " lei");

        System.out.println();
        double tot = sum1 + sum2 + sum3 + sum4;
        System.out.println("Total vanzari in firma: " + tot + " lei");

        //departamentul cu cele mai multe vanzari
        double[] valori_vanzari = {sum1, sum2, sum3, sum4};
        double maxim = valori_vanzari[0];
        for (int i = 0; i < 4; i++) {
            if (valori_vanzari[i] > maxim) {
                maxim = valori_vanzari[i];
            }
        }
        System.out.println();
        System.out.println("Departamentul cu vanzarile cele mai mari, a avut vanzari in valoare de: " + maxim + " lei");

        //cel mai bun agent de vanzari
        AgentiVanzariFirma largest = new AgentiVanzariFirma();
        largest.vanzari = 0;
        for (int i = 0; i < 20; i++) {
            if (ag[i].vanzari > largest.vanzari) {
                largest = ag[i];
            }
        }
        System.out.println();
        System.out.println("Agentul cel mai bun este: " + largest.nume);
    }
}





