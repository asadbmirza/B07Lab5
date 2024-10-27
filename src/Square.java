public class Square{
    Point A;
    Point B;
    Point C;
    Point D;

    public Square(Point A, Point B, Point C, Point D){
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public boolean isSquare() {
        double dAB = A.distance(B);
        double dBC = B.distance(C);
        double dCD = C.distance(D);
        double dDA = D.distance(A);
        if(dAB == dBC && dBC == dCD && dCD == dDA)
            return true;
        else
            return false;
    }
}