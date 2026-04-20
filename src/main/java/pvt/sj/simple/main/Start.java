package pvt.sj.simple.main;

import java.awt.AWTException;

import pvt.sj.keep.alive.KeepAlive;
import pvt.sj.keep.alive.common.CommonUtil;
import pvt.sj.keep.alive.common.CommonUtil.KeepAliveType;
import pvt.sj.keep.alive.impl.AltTab;
import pvt.sj.keep.alive.impl.Mouse;

/** @author sahil.s.jain */
public class Start {

    public static void main(String[] args) throws AWTException, InterruptedException {
        KeepAliveType keepAliveType = KeepAliveType.ALT_TAB;
        if (args.length > 0 && CommonUtil.INT_1.equals(args[0])) {
            keepAliveType = KeepAliveType.KEY_AND_MOUSE;
        }
        KeepAlive keepAlive;
        switch (keepAliveType) {
            case KEY_AND_MOUSE:
                keepAlive = new Mouse();
                break;
            case ALT_TAB:
            default:
                keepAlive = new AltTab();
                break;
        }
        keepAlive.start();
    }

}
