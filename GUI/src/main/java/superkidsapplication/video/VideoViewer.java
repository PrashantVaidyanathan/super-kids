package superkidsapplication.video;


import com.xuggle.mediatool.MediaListenerAdapter;
import com.xuggle.mediatool.event.IVideoPictureEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class VideoViewer extends MediaListenerAdapter {

    private static int mVideoStreamIndex = -1;
    private JPanel panel;
    private BufferedImage image;

    public VideoViewer() {
        image = new BufferedImage(640, 400, BufferedImage.TYPE_3BYTE_BGR);
        this.panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters
            }
        };
        panel.setPreferredSize(new Dimension(640,400));
    }

    public JPanel getPanel() {
        return panel;
    }

    @Override
    public void onVideoPicture(IVideoPictureEvent event) {
        if (event.getStreamIndex() != mVideoStreamIndex) {
            // if the selected video stream id is not yet set, go ahead an
            // select this lucky video stream
            if (mVideoStreamIndex == -1)
                mVideoStreamIndex = event.getStreamIndex();
                // no need to show frames from this video stream
            else
                return;
        }
        image = event.getImage();
        panel.repaint();
    }

}
