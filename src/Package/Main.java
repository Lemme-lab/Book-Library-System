package Package;

import java.util.Random;

public class Main {
    public static void main(String[] args) {



        Buch Buch1 = new Buch("Junkie", "Noah", 2021);
        Buch Buch2 = new Buch("Junkie 2", "Adr", 2022);
        Buch Buch3 = new Buch("Vortnite", "David", 2025);
        Buch Buch4 = new Buch("idk", "idk", 2020);
        Buch Buch5 = new Buch("unbekannt", "unbekannt", 2021);
        Buch Buch6 = new Buch("unbekannt", "unbekannt", 2021);
        Buch Buch7 = new Buch("unbekannt", "unbekannt", 2021);
        Buch Buch8 = new Buch("unbekannt", "unbekannt", 2021);
        Buch Buch9 = new Buch("unbekannt", "unbekannt", 2021);
        Buch Buch10 = new Buch("unbekannt", "unbekannt", 2021);

        Buch[] arr = {Buch1, Buch2, Buch3, Buch4 ,Buch5 , Buch6 ,Buch7 ,Buch8 ,Buch9 ,Buch10};

        Bibliothek Bibliotheka1 = new Bibliothek("Bibiliotheka",arr);


        for (int i = 0; i < 20; i++) {
            Random rnd = new Random();
            int low = 0;
            int high = 9;
            int rn = rnd.nextInt(high-low) + low;
            Bibliotheka1.borrowBook(rn);
            Bibliotheka1.returnBook(rn);
        }

        System.out.println(Bibliotheka1.getMostReadBook());


    }
}
