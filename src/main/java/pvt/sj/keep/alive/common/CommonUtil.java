package pvt.sj.keep.alive.common;

import java.awt.*;
import java.awt.event.InputEvent;

/** @author sahil.s.jain */
public class CommonUtil {
    private CommonUtil() {
        // Add a private constructor to hide the implicit public one.
    }

    public enum KeepAliveType {
        KEY_AND_MOUSE, ALT_TAB
    }

    public static final long LONG_90 = 90L;
    public static final long LONG_60 = 60L;
    public static final long LONG_50 = 50L;
    public static final long LONG_1000 = 1000L;
    public static final boolean BOOL_TRUE = true;
    public static final String INT_1 = "1";

    /**
     * Method for pressing and releasing key.
     *
     * @param robot
     *         Instance of AWT Robot class.
     * @param key
     *         Key.
     */
    public static void pressAndReleaseKey(Robot robot, int key) {
        robot.keyPress(key);
        robot.keyRelease(key);
    }

    /**
     * Method for pressing and releasing mouse left key.
     *
     * @param robot
     *         Instance of AWT Robot class.
     */
    public static void mouseClick(Robot robot) {
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    /**
     * Method for moving mouse.
     *
     * @param robot
     *         Instance of AWT Robot class.
     * @param iteration
     *         Long value for deciding mouse location.
     * @return sleep time.
     */
    public static long moveMouse(Robot robot, long iteration) {
        long sleepTime;
        Point currentMouseLocation = MouseInfo.getPointerInfo().getLocation();
        robot.mouseMove(currentMouseLocation.x + 1, currentMouseLocation.y + 1);
        sleepTime = CommonUtil.LONG_50 * CommonUtil.LONG_1000;
        return sleepTime;
    }
}
