package value.object;

public class Point extends ValueObject {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public Object[] getFields() {
        Object array[] = {x, y};
        return array;
    }
}