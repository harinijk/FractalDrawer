import java.awt.Color;

public class Circle{

    double xPos;
    double yPos;
    double radius;
    Color circleColor;

    public Circle(double xPosition, double yPosition, double circleR){

        xPos=xPosition;
        yPos=yPosition;
        radius= circleR;
       // circleColor= Color.BLACK;
    }

    public double calculatePerimeter(){

        return 2*Math.PI*radius;
    }

    public double calculateArea(){

        return Math.PI*radius*radius;
    }

    public void setColor(Color shapeColor){

        circleColor=shapeColor;
    }

    public void setPos(double xCenter, double yCenter ){

        xPos= xCenter;
        yPos= yCenter;
    }

    public void setRadius(double circleR){

        radius= circleR;
    }

    public Color getColor(){

        return this.circleColor;
    }

    public double getXPos(){

        return this.xPos;
    }

    public double getYPos(){

        return this.yPos;
    }

    public double getRadius(){

        return this.radius;
    }



public static void main(String[]args){
    

}
}