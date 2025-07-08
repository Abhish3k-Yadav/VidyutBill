package vidyutbill;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paytm extends JFrame implements ActionListener {

    String meter;
    JButton back;

    Paytm(String meter) {
        this.meter = meter;
        setLayout(new BorderLayout());

        JLabel infoLabel = new JLabel("<html><center>For security, the payment page will open in your default browser.<br>After completing payment, return here and click 'Back'.</center></html>", SwingConstants.CENTER);
        infoLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        infoLabel.setForeground(Color.RED);
        add(infoLabel, BorderLayout.CENTER);

        back = new JButton("Back");
        back.setPreferredSize(new Dimension(80, 30));
        back.addActionListener(this);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(back);
        add(buttonPanel, BorderLayout.NORTH);

        setSize(800, 600);
        setLocation(400, 250);
        setVisible(true);

        // Open Paytm in browser
        try {
            Desktop.getDesktop().browse(new java.net.URI("https://paytm.com/electricity-bill-payment"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Could not open browser. Please visit https://paytm.com/electricity-bill-payment manually.");
        }
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new PayBill(meter);
    }

    public static void main(String[] args) {
        new Paytm("");
    }
}
