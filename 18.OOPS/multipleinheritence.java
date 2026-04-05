class multipleinheritence {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();
    }
}

interface Herbivore {
    void eatGrass();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore {
    public void eatGrass() {
        System.out.println("Eating grass");
    }

    public void eatMeat() {
        System.out.println("Eating meat");
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right in each direction.");
    }
}
