import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JavaSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Portfolio");
        frame.setSize(800, 900);
        frame.setLocationRelativeTo(null);

        //Main Layout
        frame.setLayout(new GridLayout(8,1));

        //Profile Layout
        Border profileBorder = BorderFactory.createTitledBorder("PROFILE");
        JPanel profilePanel = new JPanel(new GridLayout(1,2));
        JLabel imgLabel = new JLabel("Image Goes Here");
        JLabel profileTxtLabel = new JLabel("Profile Text Goes Here!");
        profilePanel.add(imgLabel);
        profilePanel.add(profileTxtLabel);
        profilePanel.setBorder(profileBorder);
        frame.add(profilePanel);

        //Personal Summary Layout
        Border psBorder = BorderFactory.createTitledBorder("PERSONAL SUMMARY");
        JPanel psPanel = new JPanel();
        psPanel.setBorder(psBorder);
        frame.add(psPanel);

        //Qualifications Layout
        Border qBorder = BorderFactory.createTitledBorder("QUALIFICATIONS");
        JPanel qPanel = new JPanel();
        qPanel.setBorder(qBorder);
        frame.add(qPanel);

        //Work History Layout
        Border whBorder = BorderFactory.createTitledBorder("WORK HISTORY");
        JPanel whPanel = new JPanel();
        whPanel.setBorder(whBorder);
        frame.add(whPanel);

        //Experience Layout
        Border expBorder = BorderFactory.createTitledBorder("EXPERIENCE");
        JPanel expPanel = new JPanel();
        expPanel.setBorder(expBorder);
        frame.add(expPanel);

        //Other Skills Layout
        Border osBorder = BorderFactory.createTitledBorder("OTHER SKILLS");
        JPanel osPanel = new JPanel();
        osPanel.setBorder(osBorder);
        frame.add(osPanel);

        //Education Layout
        Border eduBorder = BorderFactory.createTitledBorder("EDUCATION");
        JPanel eduPanel = new JPanel();
        eduPanel.setBorder(eduBorder);
        frame.add(eduPanel);

        //References Layout
        Border refBorder = BorderFactory.createTitledBorder("REFERENCES");
        JPanel refPanel = new JPanel();
        refPanel.setBorder(refBorder);
        frame.add(refPanel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
