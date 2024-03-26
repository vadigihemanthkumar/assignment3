class Shape {

    public void calculateArea() {

        System.out.println("Calculating area for a generic shape");

    }

}



class Circle extends Shape {

    private double radius;



    // Constructor, getter



    @Override

    public void calculateArea() {

        double area = Math.PI * radius * radius;

        System.out.println("Area of circle: " + area);

    }



    // Overloaded method with an argument

    public double calculateArea(double newRadius) {

        return Math.PI * newRadius * newRadius;

    }

}
