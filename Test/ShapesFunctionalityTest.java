import com.company.Circle;
import com.company.Main;
import com.company.Rectangle;
import com.company.Triangle;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapesFunctionalityTest {
    //rectangle
    @Test
    public void createShape() {
        Rectangle rick = new Rectangle();
        Triangle truls = new Triangle();
        Circle chris = new Circle();

        rick.createShape();
        truls.createShape();
        chris.createShape();

        rick.getShape();
        chris.getShape();
        truls.getShape();
    }

    @Test
    public void getShapeTest() {
        Rectangle rick = new Rectangle();
        Triangle truls = new Triangle();
        Circle chris = new Circle();

        rick.createShape();
        truls.createShape();
        chris.createShape();
        rick.moveShape(5, 5);
        truls.moveShape(2,5);
        chris.moveShape(2,4);

        assertEquals(7, rick.topLeftX);
    }

    @Test
    public void calculateShapeAreaTest() {
        Rectangle rick = new Rectangle();
        Triangle truls = new Triangle();
        Circle chris = new Circle();

        rick.createShape();
        truls.createShape();
        chris.createShape();

        rick.calculateShapeArea();
        truls.calculateShapeArea();
        chris.calculateShapeArea();

        assertEquals(6, rick.area);
    }

    @Test
    public void calculateShapeCircumferenceTest() {
        Rectangle rick = new Rectangle();
        Triangle truls = new Triangle();
        Circle chris = new Circle();

        rick.createShape();
        truls.createShape();
        chris.createShape();

        rick.calculateShapeCircumference();
        truls.calculateShapeCircumference();
        chris.calculateShapeCircumference();

        assertEquals(10, rick.perimeter);
    }

    @Test
    public void getCenterTest() {
        Rectangle rick = new Rectangle();
        Triangle truls = new Triangle();
        Circle chris = new Circle();

        rick.createShape();
        truls.createShape();
        chris.createShape();

        rick.getCenter();
        truls.getCenter();
        chris.getCenter();

        assertEquals(3.5, rick.centreX);
        assertEquals(8, rick.centreY);
    }

    @Test
    public void moveShapeTest() {
        Rectangle ruben = new Rectangle();
        Triangle truls = new Triangle();
        Circle chris = new Circle();

        ruben.createShape();
        truls.createShape();
        chris.createShape();

        ruben.moveShape(4, 4);
        truls.moveShape(4,4);
        chris.moveShape(2,4);
    }


    @Test
    public void euclideanDistanceTest() {


    }
        @Test
        public void pointGameTest() {
            Rectangle rick = new Rectangle();
            Triangle truls = new Triangle();
            Circle chris = new Circle();

            rick.createShape();
            truls.createShape();
            chris.createShape();

            rick.calculateShapeArea();
            truls.calculateShapeArea();
            chris.calculateShapeArea();

            rick.pointGame(6,9);
            truls.pointGame(4,5);
            chris.pointGame(2,4);
        }

    @Test
    public void setName() {
        Rectangle roger = new Rectangle();
        Triangle truls = new Triangle();
        Circle chris = new Circle();

        roger.setName("Roger");
        truls.setName("Truls");
        chris.setName("Chris");

        roger.getName();
        truls.getName();
        chris.getName();
    }


    @Test
    public void euclideanDistance() {
        Rectangle rick = new Rectangle();
        Triangle truls = new Triangle();
        Circle chris = new Circle();

        rick.createShape();
        truls.createShape();
        chris.createShape();

        rick.getCenter();
        truls.getCenter();
        chris.getCenter();

        rick.euclideanDistance(rick.centreX, rick.centreY, truls.centreX, truls.centreY);
        assertEquals(1.21335164821342, rick.distanceCentre);

        truls.euclideanDistance(truls.centreX, truls.centreY, rick.centreX, rick.centreY);
        assertEquals(truls.distanceCentre, rick.distanceCentre);

        chris.euclideanDistance(chris.centreX, chris.centreY, truls.centreX, truls.centreY);
    }

    public void mainTest(){

    }
}