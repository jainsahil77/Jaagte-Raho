package pvt.sj.keep.alive.impl;

import java.awt.AWTException;
import java.awt.Robot;

import pvt.sj.keep.alive.KeepAlive;
import pvt.sj.keep.alive.common.CommonUtil;

/** @author sahil.jain */
public class Mouse implements KeepAlive {
    @Override
    public void start() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        long sleepTime = CommonUtil.LONG_50 * CommonUtil.LONG_1000;
        while (CommonUtil.BOOL_TRUE) {
            CommonUtil.moveMouse(robot);
            Thread.sleep(sleepTime);
        }
    }
}
