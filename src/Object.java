/**
 * @author kerwinz
 * @changtime 2023/9/19
 * @projectname The Gold Miner
 */

import java.awt.*;

public class Object {
    //坐标
    int x;
    int y;
    //宽高
    int width;
    int height;
    //图片
    Image img;
    //标记,是否能移动
    boolean flag;
    //质量
    int m;
    //积分
    int count;

    void paintSelf(Graphics g) {
        g.drawImage(img, x, y, null);
    }

    public int getWidth() {
        return width;
    }

    //获取矩形
    public Rectangle getRec() {
        return new Rectangle(x, y, width, height);
    }
}
