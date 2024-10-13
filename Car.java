public class Car {
    private Rect carBody;
    private Rect carRoof;
    private Square window1;
    private Square window2;
    private Circle wheel1;
    private Circle wheel2;
    private Triangle light;
    private Person person;

    public Car() {
        carBody = new Rect();
        carRoof = new Rect();
        window1 = new Square();
        window2 = new Square();
        wheel1 = new Circle();
        wheel2 = new Circle();
        light = new Triangle();
        person = new Person();
    }

    public void draw() {
        carBody.changeSize(120, 50);
        carBody.changeColor("red");
        carBody.moveHorizontal(50);
        carBody.makeVisible();

        carRoof.changeSize(90, 40);
        carRoof.changeColor("red");
        carRoof.moveHorizontal(50);
        carRoof.moveVertical(-30);
        carRoof.makeVisible();

        window1.changeSize(28);
        window1.changeColor("blue");
        window1.moveHorizontal(-200);
        window1.moveVertical(-15);
        window1.makeVisible();

        window2.changeSize(28);
        window2.changeColor("blue");
        window2.moveHorizontal(-160);
        window2.moveVertical(-15);
        window2.makeVisible();

        wheel1.changeSize(40);
        wheel1.changeColor("black");
        wheel1.moveHorizontal(120);
        wheel1.moveVertical(25);
        wheel1.makeVisible();

        wheel2.changeSize(40);
        wheel2.changeColor("black");
        wheel2.moveHorizontal(60);
        wheel2.moveVertical(25);
        wheel2.makeVisible();

        light.changeSize(25, 25);
        light.changeColor("yellow");
        light.moveHorizontal(-65);
        light.moveVertical(40);
        light.makeVisible();

        person.moveHorizontal(-117);
        person.moveVertical(-65);
        person.makeVisible();
        person.changeSize(35,25);
    }

    public void highBeam(int maxBeamValue) {
        int originalSize = 20;
        int increment = (maxBeamValue - originalSize) / 5;

        // Increase light size
        for (int i = originalSize; i <= maxBeamValue; i += increment) {
            light.changeSize(i, i);
            Canvas.getCanvas().wait(200);
        }

        // Reduce light size
        for (int i = maxBeamValue; i >= originalSize; i -= increment) {
            light.changeSize(i, i);
            Canvas.getCanvas().wait(200);
        }
    }
}
