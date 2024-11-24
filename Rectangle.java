import java.awt.Color;

public class Rectangle{

    double xUpperLeft;
    double yUpperLeft;
    double width;
    double height;
    Color rectangleColor;
    
    public Rectangle(double xPos, double yPos, double rectangleWidth, double rectangleHeight ){
    
        xUpperLeft=xPos;
        yUpperLeft=yPos;
        width= rectangleWidth;
        height= rectangleHeight;
    }
    
    public double calculatePerimeter(){
    
        return 2*(width+height);
    }
    
    public double calculateArea(){
    
        return width*height;
    }
    
    public void setColor(Color shapeColor){
    
        rectangleColor=shapeColor;
    }
    
    public void setPos(double xPos, double yPos ){
    
        xUpperLeft=xPos;
        yUpperLeft=yPos;
    }
    
    public void setHeight(double rectangleHeight){
    
        height=rectangleHeight;
    }
    
    public void setWidth(double rectangleWidth){

        width=rectangleWidth;
    }

    public Color getColor(){
    
        return this.rectangleColor;
    }
    
    public double getXPos(){
    
        return this.xUpperLeft;
    }
    
    public double getYPos(){
    
        return this.yUpperLeft;
    }
    
    public double getHeight(){
    
        return this.height;
    }

    public double getWidth(){

        return this.width;
    }
    
    
 }



