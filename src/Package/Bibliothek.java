package Package;

public class Bibliothek {
    public String Name;
    private Buch[] Bücher = new Buch[10];
    public int counter;

    public Bibliothek(String na, Buch[] booka){
        Name = na;
        Bücher = booka;
        counter = 0;
    }

    public void addHouse(Buch h){
        try {
            Bücher[counter] = h;
            counter++;
            System.out.println("Büch Hinzugefügt");
        }catch (Exception e){
            System.out.println("Failed");
        }
    }

    public String getMostReadBook(){
        int max = 0;
        String name = "";
        for (int i = 1; i < Bücher.length ; i++) {

            if(max < Bücher[i].getNumberOfReader())
            {
                max = Bücher[i].getNumberOfReader();
                name = Bücher[i].getTitel();
            }
        }
        name = "Titel: "+ name + " " + max;
        return name;

    }


    public void borrowBook(int i){
        if(Bücher[i].isBorrowed() == false){
            Bücher[i].setNumberOfReader(Bücher[i].getNumberOfReader()+1);
            Bücher[i].setBorrowed(true);
            System.out.println("Buch: " + i);
            System.out.println(Bücher[i].getNumberOfReader());
            System.out.println("Wurde Ausgeliehen ");
        }else {

            System.out.println("Buch schon Ausgeliehen ");
        }

    }
    public void returnBook(int i){
        Bücher[i].setBorrowed(false);
    }


}
