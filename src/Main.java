package academy.learnprogramming;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        ResizeMe appwin = new ResizeMe();

        appwin.setSize(new Dimension(200,200));
        appwin.setTitle("ResizeMe");
        appwin.setVisible(true);
    }
}
