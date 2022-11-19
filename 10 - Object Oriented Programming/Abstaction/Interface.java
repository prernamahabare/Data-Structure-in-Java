public class Interface {

    public static void main(String[] args) {
        Queeen q = new Queeen();
        q.moves();

        Beer b = new Beer();
        b.eatgrass();
    }
}
interface ChessPlayer{
  void moves();
}

class Queeen implements ChessPlayer{
    public void moves(){
        System.out.println("queen moves");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("king moves");
    }
}

// multiple inheritance are not there in java but we can implement it with the help of the interfaces

interface Herbivore{
  void eatgrass();
}

interface Carnivore{
    void eatmeat();
}

class Beer implements Carnivore, Herbivore {
    public void eatgrass(){
        System.out.println("eatgrass");
    }

    public void eatmeat(){
        System.out.println("eatmeat");
    }
}
