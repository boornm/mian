public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        SetPoint(x, y);
    }
    public void SetPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public double distanceTo (double x, double y){
        double d;
        d = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return d;
    }

    public String ToString(){
        return "x = " + this.x + " y = " + this.y;
    }
}