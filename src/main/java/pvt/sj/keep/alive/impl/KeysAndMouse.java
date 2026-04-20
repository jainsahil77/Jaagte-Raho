package pvt.sj.keep.alive.impl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import pvt.sj.keep.alive.KeepAlive;
import pvt.sj.keep.alive.common.CommonUtil;

/** @author sahil.jain */
public class KeysAndMouse implements KeepAlive {
    @Override
    public void start() throws AWTException, InterruptedException {
        // System.out.println("#### Keep Alive ####");
        Robot robot = new Robot();
        long sleepTime;
        long iteration = 1;
        while (CommonUtil.BOOL_TRUE) {
            // System.out.println("Pressing keys and moving mouse");
//            CommonUtil.pressAndReleaseKey(robot, KeyEvent.VK_ENTER);
//            CommonUtil.pressAndReleaseKey(robot, KeyEvent.VK_SPACE);
            sleepTime = CommonUtil.moveMouse(robot, iteration);
            iteration++;
            // System.out.println("Keys pressed, now sleeping for " + sleepTime + " milliseconds....");
            Thread.sleep(sleepTime);
        }
    }
}
