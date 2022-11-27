public class Dozent {

     private String name;
     private String lehrgebiet;
     private boolean dekan = false;
     private char gescglecht;



     public Dozent(String name, String lehrgebiet, char geschlecht){
         this.name = name;
         this.lehrgebiet = lehrgebiet;
         this.gescglecht = geschlecht;

     }

     public void PrintInfo(){
         System.out.println("Name: " + getName() + "\nLehrgebiet: "  + getLehrgebiet() + "\nGeschlecht: " + getGescglecht());
     }


    public void setName(String name) {
        this.name = name;
    }

    public void setLehrgebiet(String lehrgebiet) {
        this.lehrgebiet = lehrgebiet;
    }

    public void setDekan(boolean dekan) {
        this.dekan = dekan;
    }

    public void setGescglecht(char gescglecht) {
        this.gescglecht = gescglecht;
    }

    public String getName() {
        return name;
    }

    public String getLehrgebiet() {
        return lehrgebiet;
    }

    public boolean isDekan(boolean dekan) {
        return dekan;
    }

    public char getGescglecht() {
        return gescglecht;
    }

}
