import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "My zoo";

     public static void main (String[] args){
         ZooManagement z = new ZooManagement();
         z.entrerZoo();
         z.afficherZoo();
     }


     public void entrerZoo (){
         Scanner sc = new Scanner(System.in); // first initiate el escanner

         do {
             System.out.println("Donner nom du Zoo");
             zooName = sc.nextLine();                   //awel read tkoun bel next Line i think
             if (zooName.isEmpty()){
                 System.out.println("name doit etre pas vide");
             }
         }while (zooName.isEmpty());



         do {
             System.out.println("donner nombre de cages");

             while (!sc.hasNextInt()) {                       // peek into the next first to check entier
                 System.out.println("Entier ya m3allem!");
                 sc.next();                                    // if not int scanner yaawd yakra el next that why sc.next()
             }

             nbrCages = sc.nextInt();                          // kn cbn int el nbrcages yekhou el value
             if (nbrCages <= 0) {
                 System.out.println("positif belehi");
             }

         }while (nbrCages <= 0);

    }



    void afficherZoo (){
         System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
}
