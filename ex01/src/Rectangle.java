public class Rectangle {
    public double width;
    public double height;

    public double Area(){
      return width*height;
    }

    public double Perimeter(){
        return 2*(width+height);
    }

    public double Diagonal() {
        double p = (width * width) + (height * height);
        return Math.sqrt(p);
    }

    public String toString(){
        return "Area = "+Area()+"\n Perimeter = "+Perimeter()+"\n Diagonal = "+Diagonal();
    }
}

