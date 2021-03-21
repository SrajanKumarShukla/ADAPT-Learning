// Q5. Write the classes Line, Rectangle, Cube etc. & make the Shape as their base class. 
// Add an abstract draw() method in the class Shape & draw all shapes.
// Description:- Write a java class named Shape which has abstract draw() and also classes Line, Rectangle, Cube etc. 
// extends Shape to implement the draw method.
package Java.IntermediateOOPAssignment;
abstract class Shape5 {
    abstract public String draw();
}
class Cube5 extends Shape5{
    @Override
    public String draw() {
        return "Cube";
    }
}
class Line5 extends Shape5{
    @Override
    public String draw() {
        return "Line";
    }
}
class Rectangle5 extends Shape5{
    @Override
    public String draw() {
        return "Rectangle";
    }
}