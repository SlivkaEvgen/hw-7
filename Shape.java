package zgroup.SlivkaEvgen.module07;

interface Shape {
     String getName();
}
class ShapeVoid{
    public static void main(String[] args){
        Circle circle = new Circle();
        circle.getName();
        Quad quad = new Quad();
        quad.getName();
        Triangular triangular = new Triangular();
        triangular.getName();
        Rectangle rectangle = new Rectangle();
        rectangle.getName();
        Rhombus rhombus = new Rhombus();
        rhombus.getName();
        System.out.println(circle.getName()+
                ","+quad.getName()+
                "," +triangular.getName()+
                ","+rectangle.getName()+
                ","+rhombus.getName());
    }
}
class Circle implements Shape{

    @Override
    public String getName() {
        return "Circle";
    }
}
class Quad implements Shape{
    @Override
    public String getName() {
        return "Quad";
    }
}
class Triangular implements Shape{
    @Override
    public String getName() {
        return "Triangular";
    }
}
class Rectangle implements Shape{
    @Override
    public String getName() {
        return "Rectangle";
    }
}
class Rhombus implements Shape{
    @Override
    public String getName() {
        return "Rhombus";
    }
}

