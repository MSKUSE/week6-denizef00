public class Triangle extends Shape {
    private int sideA, sideB, sideC;

    public Triangle(Point location,int sideA,int sideB,int sideC) {
        super(location);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideB <= 0) {
            throw new IllegalArgumentException("Side B can't be negative!!!");
        } else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException("Side B can't be negative!!!");
        }else {
            this.sideB = sideB;
        }
    }

    @Override
    public double area() {
        return (sideA * sideB) / 2;
    }

    @Override
    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}

