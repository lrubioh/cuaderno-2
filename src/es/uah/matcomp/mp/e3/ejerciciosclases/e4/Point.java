package es.uah.matcomp.mp.e3.ejerciciosclases.e4;

public class Point {
    private float x;
    private float y;
    public Point(float x, float y){
        this.x= x;
        this.y= y;
    }
    public Point(){
        this.x= 0;
        this.y= 0;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x= x;
        this.y= y;
    }
    public float[] getXY(){
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
