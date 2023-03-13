import java.util.Vector;

public class Cola implements Micontainer {
    private Vector<Object> V;

    public Cola() {
        V = new Vector<Object>();
    }

    public void aniadir(Object obj) {
        V.add(obj);
    }

    @Override
    public Object extraer() {
        if (V.size() != 0)
            return v.remove(0);
        return null;
    }

    @Override
    public String toString() {
        return "Cola: " + V;
    }
}
