import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RobotConstruction {
    public static void main(String[] args) {
        String[] robotParts = {
            "Kitt_wheels",
            "Kitt_engine",
            "Kitt_sensors",
            "R2D2_sensors",
            "R2D2_wheels",
            "R2D2_engine",
            "Oliver_sensors",
            "Oliver_tracks"
        };

        String partsUsed = "wheels,sensors,engine";
        String[] expectedRobotsBuilt = new String[]{"R2D2", "Kitt"};
        String[] robotsActuallyBuilt = makeRobot(robotParts, partsUsed);

        if (Arrays.equals(expectedRobotsBuilt, robotsActuallyBuilt)) {
            System.out.println("Success!");
            System.out.println("Robots Built" + Arrays.toString(robotsActuallyBuilt));
        } else {
            System.out.println("Failure!");
            System.out.println("Expected robots " + Arrays.toString(expectedRobotsBuilt));
            System.out.println("Robots built " + Arrays.toString(robotsActuallyBuilt));
        }
    }

    public static String[] makeRobot(String[] robotParts, String partsUsed) {
        // your logic here, what robots can we make with the parts?
        return new String[0];
    }
}