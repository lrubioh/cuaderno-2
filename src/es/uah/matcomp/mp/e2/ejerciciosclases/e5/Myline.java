package es.uah.matcomp.mp.e2.ejerciciosclases.e5;

public class Myline {
    //establezco el inicio y el final de mi linea como puntos pertenecientes al otro programa
    private MyPoint begin;
    private MyPoint end;

    //defino las clases publicas

    //defino el inicio y el final con dos coordenadas
    public Myline(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }
    //inplemento begin y end
    public Myline(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }
    public MyPoint getBegin() {
        return begin;
    }
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    public MyPoint getEnd() {
        return end;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }
    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int endX) {
        this.end.setX(endX);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int endY) {
        this.end.setY(endY);
    }
    public int[] getBeginXY(){
        return new int[]{begin.getX(), begin.getY()};
    }
    public void setBeginXY(int beginX, int beginY){
        this.begin.setX(beginX);
        this.begin.setY(beginY);
    }
    public int[] getEndXY(){
        return new int[]{end.getX(), end.getY()};
    }
    public void setEndXY(int endX, int endY){
        this.end.setX(endX);
        this.end.setY(endY);
    }
    public double getLength(){
        return begin.distance(end);
    }
    public double getGradient(){
        return Math.atan2(end.getY()-begin.getY(), end.getX()-begin.getX());
    }

    @Override
    public String toString() {
        return "Myline [begin=" +"("+getBeginX()+ "," + getBeginY()+ ")" + ", end=" + "("+getEndX()+ "," + getEndY()+ ")"+ "]";
    }
}
