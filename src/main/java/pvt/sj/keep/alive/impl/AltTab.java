package pvt.sj.keep.alive.impl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import pvt.sj.keep.alive.KeepAlive;
import pvt.sj.keep.alive.common.CommonUtil;

/** @author sahil.jain */
public class AltTab implements KeepAlive {
    @Override
    public void start() throws AWTException, InterruptedException {
        // System.out.println("#### Keep Alive ####");
        Thread.sleep(50000);
        long sleepTime = CommonUtil.LONG_50 * CommonUtil.LONG_1000;
        Robot robot = new Robot();
        long iteration = 1;
        while (CommonUtil.BOOL_TRUE) {
            // System.out.println("Changing window");
            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_ALT);
            iteration++;
            Thread.sleep(sleepTime);
            // CommonUtil.mouseClick(robot);
            // System.out.println("Window changed, now sleeping for " + sleepTime + " milliseconds....");
        }
    }
}
