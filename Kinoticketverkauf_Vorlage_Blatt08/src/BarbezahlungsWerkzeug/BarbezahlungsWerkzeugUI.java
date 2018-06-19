package BarbezahlungsWerkzeug;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BarbezahlungsWerkzeugUI
{
    private JDialog _dialog;
    private JPanel _hauptpanel;
    private JButton _okButton;
    private JButton _abbrechenButton;
    private JTextField _bezahlterBetrag;
    private JLabel _aufsummierterPreis;
    private JLabel _restbetrag;
    private JLabel _bezahlt;

    public BarbezahlungsWerkzeugUI()
    {
        erzeugeDialog();
    }

    private void erzeugeDialog()
    {
        JDialog dialog = new JDialog(new javax.swing.JFrame(), true);
    }

}
