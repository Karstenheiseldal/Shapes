import com.company.Rectangle;
import com.company.Triangle;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapesFunctionalityTest {
    //rectangle
    @Test
    public void createShape() {
        Rectangle rick = new Rectangle();
        rick.createShape();
        rick.getShape();
    }

    @Test
    public void getShapeTest() {
        Rectangle rick = new Rectangle();
        rick.createShape();
        rick.moveShape(5, 5);

        assertEquals(7, rick.topLeftX);
    }

    @Test
    public void calculateShapeAreaTest() {
        Rectangle rick = new Rectangle();
        rick.createShape();
        rick.calculateShapeArea();
        assertEquals(6, rick.area);
    }

    @Test
    public void calculateShapeCircumferenceTest() {
        Rectangle rick = new Rectangle();
        rick.createShape();
        rick.calculateShapeCircumference();
        assertEquals(10, rick.perimeter);
    }

    @Test
    public void getCenterTest() {
        Rectangle rick = new Rectangle();
        rick.createShape();
        rick.getCenter();
        assertEquals(3.5, rick.centreX);
        assertEquals(8, rick.centreY);
    }

    @Test
    public void moveShapeTest() {
        Rectangle ruben = new Rectangle();
        ruben.createShape();
        ruben.moveShape(4, 4);
        assertEquals(9, ruben.bottomRightX);
    }

    @Test
    public void setNameTest() {
        Rectangle roger = new Rectangle();
        roger.createShape();
        roger.setName("Roger");
        roger.getName();
    }

    @Test
    public void euclideanDistanceTest() {
        Rectangle rick = new Rectangle();
        Triangle truls = new Triangle();

        rick.createShape();
        truls.createShape();
        rick.getCenter();
        truls.getCenter();

        rick.euclideanDistance(rick.centreX, rick.centreY, truls.centreX, truls.centreY);
        assertEquals(1.21335164821342, rick.distanceCentre);

        truls.euclideanDistance(truls.centreX, truls.centreY, rick.centreX, rick.centreY);
        assertEquals(truls.distanceCentre, rick.distanceCentre);

    }
        @Test
        public void pointGameTest() {
            Rectangle rick = new Rectangle();
            rick.createShape();
            rick.calculateShapeArea();
            assertEquals(6, rick.area);
        }
    }