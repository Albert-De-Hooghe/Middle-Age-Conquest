/** Trouvé sur le net, permet de d'avoir des tuples sous java. Permet d'utiliser un couple de coordonnées pour la Hashtable de Pays */

public class Tuple {
    int x;
    int y;

    public Tuple(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tuple other = (Tuple) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
}