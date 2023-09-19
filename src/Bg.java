import java.awt.*;

public class Bg {
    //总分
    static int count =0;
    Image bg = Toolkit.getDefaultToolkit().getImage("imgs/bg.jpg");
    Image bg1 = Toolkit.getDefaultToolkit().getImage("imgs/bg1.jpg");
    Image peo = Toolkit.getDefaultToolkit().getImage("imgs/peo.png");

    //绘制
    void paintSelf(Graphics g){
        g.drawImage(bg1,0,0,null);
        g.drawImage(bg,0,200,null);
        g.drawImage(peo,310,50,null);

        drawWord(g,30,Color.black,"积分：" + count,30,150);
    }

    //绘制字符串的方法
    public static void drawWord(Graphics g,int size,Color color,String str,int x,int y){
        g.setColor(color);
        g.setFont(new Font("微软雅黑", Font.BOLD,size));
        g.drawString(str,x,y);
    }
}
