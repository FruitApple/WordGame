import javax.imageio.event.IIOWriteProgressListener;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MyImagePanel extends JPanel{
        private Image image=null;
        private int iWidth2;
        private int iHeight2;
        public MyImagePanel(Image image) {
            this.image = image;
            this.iHeight2 = image.getHeight(this)/2;
            this.iWidth2 = image.getWidth(this)/2;
        }

    public void paintComponent(Graphics g){
            super.paintComponent(g);
            if(image!=null){
                int x =this.getParent().getWidth()/2- iWidth2;
                int y =this.getParent().getHeight()/2-iHeight2;
                g.drawImage(image,x,y,this);

            }
        }
        }
