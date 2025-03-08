package es.uah.matcomp.mp.e3.ejerciciosclases.e4;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        xSpeed = xSpeed;
        ySpeed = ySpeed;
    }
    public MovablePoint() {
        super();
        xSpeed = 0;
        ySpeed = 0;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        super(xSpeed, ySpeed);
    }
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{xSpeed, ySpeed};
    }
    public String toString(){
        return  "(" + getX() + ", " + getY() + ")"+"speed=("+xSpeed+","+ySpeed+")";
    }


}
