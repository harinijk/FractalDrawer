import java.awt.Color;

public class Triangle{

    double xBottomLeft;
    double yBottomLeft;
    double width;
    double height;
    Color triangleColor;
    
    public Triangle(double xPos, double yPos, double triangleWidth, double triangleHeight ){
    
        xBottomLeft=xPos;
        yBottomLeft=yPos;
        width= triangleWidth;
        height= triangleHeight;
    }
    
    public double calculatePerimeter(){
    
        return (2*(Math.sqrt(height*height-width/2*width/2))+ width);
    }
    
    public double calculateArea(){
    
        return (1.0/2*width*height);
    }
    
    public void setColor(Color shapeColor){
    
        triangleColor=shapeColor;
    }
    
    public void setPos(double xPos, double yPos ){
    
        xBottomLeft=xPos;
        yBottomLeft=yPos;
    }
    
    public void setHeight(double triangleHeight){
    
        height=triangleHeight;
    }
    
    public void setWidth(double triangleWidth){

        width=triangleWidth;
    }

    public Color getColor(){
    
        return this.triangleColor;
    }
    
    public double getXPos(){
    
        return this.xBottomLeft;
    }
    
    public double getYPos(){
    
        return this.yBottomLeft;
    }
    
    public double getHeight(){
    
        return this.height;
    }

    public double getWidth(){

        return this.width;
    }
    
 }



