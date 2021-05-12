package demo04;


import java.util.List;

public class Canvas {
    // 在画布上画一个
    public  void  draw(Shape shape){
        shape.xingzhuang();

    }
    // 在画布上画多个
    public  void  drawAll (List< ? extends Shape > shapeList){
        for (Shape s : shapeList){
            s.xingzhuang();
        }
    }

}
