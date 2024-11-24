// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;


public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area

    public FractalDrawer() {}  // contructor


    
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {

        Canvas drawing = new Canvas(1000,1000);

        if(type.equals("Circle")){
            
            this.drawCircleFractal(125, 400, 400, new Color(255,255,0), drawing, 7 );
        }

        else if(type.equals("Triangle")){

            this.drawTriangleFractal(300, 250, 300,450, new Color(255,255,0), drawing, 7); 
        }

        else if(type.equals("Rectangle")){

            this.drawRectangleFractal(100, 100, 400,300, new Color(0,0,0), drawing, 7);

        }   
        
        return totalArea;
    }


    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        
        Color[] colors ={new Color(0,0,255),new Color(0,0,0), new Color(160,32,240),new Color(73, 216, 230), new Color(255, 192, 203) }; // array for getting different colors for different levels

        if (level <=1){

            Triangle triangleOne= new Triangle(x,y,width,height);

            triangleOne.setColor(c);

            can.drawShape(triangleOne);

            totalArea+=triangleOne.calculateArea(); // to calculate total area
        }

        else{
            double yDiff= height/2; // variable used to change Triangle's verticle position
            double xDiff= width/2;  // variable used to change Triangle's horizontal position

            Color newColor= colors[(level-1)%5];

            Triangle triangleTwo= new Triangle(x,y,width,height);

            triangleTwo.setColor(c);

            totalArea+=triangleTwo.calculateArea(); // to calculate total area

            can.drawShape(triangleTwo); 

            // Drawing 4 triangles for each triangle recursively 
            drawTriangleFractal(width/2,height/2,x-xDiff/2,y-yDiff,newColor,can,level-1);
            drawTriangleFractal(width/2,height/2,x+1.5*xDiff,y-yDiff,newColor,can,level-1);
            drawTriangleFractal(width/2,height/2,x+xDiff/2,y+yDiff,newColor,can,level-1);
                
        }

    }


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {

        Color[] colors ={new Color(0,0,255),new Color(0,0,0), new Color(160,32,240),new Color(73, 216, 230), new Color(255, 192, 203) }; // array for getting different colors for different levels

        if (level <=1){

            Circle circleOne = new Circle(x,y,radius);

            circleOne.setColor(new Color(0,255,0));

            can.drawShape(circleOne);

            totalArea+=circleOne.calculateArea(); // to calculate total area
        }

        else{

            double pDiff= 1.5*radius;  // variable used to change the postion of the circle 
            
            Color newColor= colors[(level)%5];

            Circle circleTwo = new Circle(x,y,radius);

            circleTwo.setColor(c);

            totalArea+=circleTwo.calculateArea(); // to calculate total area

            can.drawShape(circleTwo);

            // Drawing 4 circles for each circle recursively 
            drawCircleFractal(radius/2,x-pDiff,y,newColor,can,level-1);
            drawCircleFractal(radius/2,x+pDiff,y,newColor,can,level-1);
            drawCircleFractal(radius/2,x,y-pDiff,newColor,can,level-1);
            drawCircleFractal(radius/2,x,y+pDiff,newColor,can,level-1);

        }
    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {

        Color[] colors ={new Color(0,0,255),new Color(0,0,0), new Color(160,32,240)}; // array for getting different colors for different levels

        if (level <=1){

            Rectangle rectangleOne = new Rectangle(x,y,width,height);

            rectangleOne.setColor(c);

            can.drawShape(rectangleOne);

            totalArea+= rectangleOne.calculateArea(); // to calculate total area
        }

        else{
            
            double yDiff= height/2; // variable used to change the verticle postion of the rectangle
            double xDiff= width/2; // variable used to change the horizontal postion of the rectangle

            Color newColor= colors[(level-1)%3];

            Rectangle rectangleTwo = new Rectangle(x,y,width,height);

            rectangleTwo.setColor(c);

            totalArea+=rectangleTwo.calculateArea(); // to calculate total area

            can.drawShape(rectangleTwo);

            // Drawing 4 circles for each circle recursively 
            drawRectangleFractal(width/2,height/2,x-2.5*xDiff,y+yDiff/2,newColor,can,level-1);
            drawRectangleFractal(width/2,height/2,x+3.5*xDiff,y+yDiff/2,newColor,can,level-1);
            drawRectangleFractal(width/2,height/2,x+0.5*xDiff,y+3.5*yDiff,newColor,can,level-1);
            drawRectangleFractal(width/2,height/2,x+xDiff/2,y-2.5*yDiff,newColor,can,level-1);
        }

    }

    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal
    public static void main(String[] args){

        //asking for input
        Scanner scanner = new Scanner(System.in);
        String shape= "";

        while(!shape.equals("Circle") && !shape.equals("Triangle")&&!shape.equals("Rectangle")){
            System.out.println("Choose a shape: Circle, Rectangle, Triangle");
             shape= scanner.nextLine();
        }

        FractalDrawer fdraw= new FractalDrawer();
        System.out.print(fdraw.drawFractal(shape));
        
    }
}
