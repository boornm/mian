public class Shape {
    private Point[] p;
    private int size;
    private int buffer = 3;

    public Shape(){
        p = new Point[buffer];
    }

    private void IncreaseBuffer() {
        buffer *= 2;
        Point[] newP = new Point[buffer];

        for(int i = 0; i < p.length; i++){
            newP[i] = p[i];
        }

        p = newP;
    }

    public void add(Point point) {
        if (size == buffer){
            IncreaseBuffer();
        }
        p[size++] = point;
    }

    public double perimetr(){
        double d = 0;
        for(int i = 0; i < p.length - 1; i++){
           d += p[i].distanceTo(p[i + 1].getX(), p[i + 1].getY());
        }
        return d;
    }

    public double LongestSide(){
        double d = 0;
        for(int i = 0; i < p.length - 2; i++){
            if (p[i].distanceTo(p[i + 1].getX(), p[i + 1].getY()) > p[i + 1].distanceTo(p[i + 2].getX(), p[i + 2].getY())){
                d = p[i].distanceTo(p[i + 1].getX(), p[i + 1].getY());
            }
            else {
                d = p[i + 1].distanceTo(p[i + 2].getX(), p[i + 2].getY());
            }
        }
        return d;
    }

    public double AvarageSide(){
        double d = 0;
        for(int i = 0; i < p.length - 1; i++){
            d += p[i].distanceTo(p[i + 1].getX(), p[i + 1].getY());
        }
        return d / p.length;
    }

}