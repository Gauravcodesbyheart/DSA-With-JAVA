public class interfacejava{
    public static void main (String args[]){
        Queen q = new Queen() ;
        q.moves();

    }
    
}
interface Chessplayer{  
    void moves(); // interface created. 
}
                              // each class inherits the property from the interface.
class Queen implements Chessplayer{
    public void moves(){                // each class implement the move property
        System.out.println("UP , DOWN , LEFT , RIGHT DIAGOMNAL in all directions.");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("UP, DOWN , LEFT , RIGHT");
    }
}

class King implements Chessplayer{
    public void moves(){
        System.out.println("UP, DOWN , LEFT RIGHT < DIAGONAL in all direction one step only.");
    }
}

