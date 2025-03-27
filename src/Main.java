public class Main {
    public static void main(String[] args) {
        /*Point p = new Point(3,4);
        Rectangle r1 = new Rectangle(p,3,4);
        System.out.println(r1.counterforobject);
        System.out.println(Rectangle.counter);

        Rectangle r2 = new Rectangle(p,5,6);
        System.out.println(r1.counterforobject);
        System.out.println(r2.counterforobject);
        System.out.println(Rectangle.counter);
        System.out.println(Integer.max(3,4));
        System.out.println(Integer.parseInt("1"));
        System.out.println(r1);
        String a0 = new String("aaa");
        System.out.println(a0);*/

        Rectangle r = new Rectangle(new Point(3,4),5,6);
        System.out.println(r.getLocation());
        System.out.println(r);

        System.out.println(r.area());
        System.out.println(r.perimeter());

        Circle c = new Circle(new Point(3,4),5);
        System.out.println(c);
        System.out.println(c.area());
        System.out.println(c.perimeter());

        Triangle t = new Triangle(new Point(3,4),3,4,5);
        System.out.println(t.area());
        System.out.println(t.perimeter());
    }
}