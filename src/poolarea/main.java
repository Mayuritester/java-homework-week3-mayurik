package poolarea;

public class main extends Rectangle {
    public main(double lenght, double width) {
        super(lenght, width);
    }

    public static void main(String[] args) {
        //all the expected outputs to get the Volume
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getlenght());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(10,5,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getlenght());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

    }

}
