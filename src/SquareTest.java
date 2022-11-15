public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.0);
        System.out.println(square);

        square = new Square(2.0,"black",false);
        System.out.println(square);

        System.out.println(square.getArea());
        System.out.println(square.resize());
    }
}
