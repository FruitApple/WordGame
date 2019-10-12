import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;

public class good {
    static class WordGameInterface extends JFrame {
        private JButton start;
        private JButton next;
        private JButton check;
        private JTextField word;
        private JTextField translation;

        public WordGameInterface() throws IOException {
            setTitle("Word Game");
            BufferedImage img = ImageIO.read(new File("src/3.png"));
            MyImagePanel panel = new MyImagePanel(img);
            panel.setLayout(null);
            word=new JTextField("word");
            translation=new JTextField("слово(перевод слова");
            word.setLayout(null);
            translation.setLayout(null);
            word.setBounds(100,90,200,30);
            translation.setBounds(100,130,200,30);
            word.setFont(new Font("Arial",Font.ROMAN_BASELINE, 16));
            translation.setFont(new Font("Arial",Font.ROMAN_BASELINE, 16));
            start=new JButton("Начать");
            start.setLayout(null);
            start.setBounds(100,50,200,30);
            start.setBackground(new Color(150, 0,100 ));
            start.setForeground(Color.white);
            start.setFont(new Font("Arial", Font.BOLD, 26));

            setContentPane(panel);
            setSize(1920, 1080);
            setVisible(true);
        }
    }

    public static void main(String[] args) throws IOException {
        new WordGameInterface();
    }
}
