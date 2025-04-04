package pl.edu.pwr.student.lab02.UI.GUI;

import pl.edu.pwr.student.lab02.data.Constants;
import pl.edu.pwr.student.lab02.tactics.BruteForceMethod;
import pl.edu.pwr.student.lab02.tactics.MethodInterface;
import pl.edu.pwr.student.lab02.tactics.RandomMethod;
import pl.edu.pwr.student.lab02.reader.ConstantsReader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * GUI Class
 */
public class GUI {
    private JPanel app;
    private JTextField preferencePathField;
    private JTextField assortmentPathField;
    private JTextField discountsPathField;
    private JSpinner skiCostNum;
    private JSpinner penaltyLengthNum;
    private JSpinner noSkiNum;
    private JSpinner typePenaltyNum;
    private JLabel preferencePathLabel;
    private JLabel skiCostLabel;
    private JLabel penaltyLengthLabel;
    private JLabel noSkiLabel;
    private JLabel typePenaltyLabel;
    private JLabel assortmentPathLabel;
    private JLabel discountsPathLabel;
    private JButton bruteForceMethodButton;
    private JButton monteCasinoMethodButton;
    private JLabel methodLabel;
    private JTextPane resultField;

    /**
     * Instantiates a new Gui.
     */
    public GUI() {
        //initializes fields from constants
        skiCostNum.setValue(Constants.getSkiCost());
        noSkiNum.setValue(Constants.getNoSkiPenalty());
        penaltyLengthNum.setValue(Constants.getSkiLenDiffPenalty());
        typePenaltyNum.setValue(Constants.getSkiTypeDiffPenalty());

        //button action listeners
        monteCasinoMethodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MethodInterface method = new RandomMethod();
                calculate(method);
            }
        });
        bruteForceMethodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MethodInterface method = new BruteForceMethod();
                calculate(method);
            }
        });
    }

    /**
     * Initializes constants and prints results of according method
     */
    private void calculate(MethodInterface method) {
        try {
            ConstantsReader.initConstants(
                    preferencePathField.getText(),
                    assortmentPathField.getText(),
                    discountsPathField.getText(),
                    (Integer) skiCostNum.getValue(),
                    (Integer) penaltyLengthNum.getValue(),
                    (Integer) typePenaltyNum.getValue(),
                    (Integer) noSkiNum.getValue()
            );

            method.find();
            resultField.setText(method.toString());
        }
        catch (Exception e) {
            resultField.setText(e.getMessage());
        }
    }

    /**
     * Starts GUI
     */
    public static void start() {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().app);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        app = new JPanel();
        app.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(8, 4, new Insets(10, 10, 10, 10), -1, -1));
        preferencePathLabel = new JLabel();
        preferencePathLabel.setText("Path To Preferences");
        app.add(preferencePathLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        preferencePathField = new JTextField();
        app.add(preferencePathField, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        assortmentPathLabel = new JLabel();
        assortmentPathLabel.setText("Path To Assortment");
        app.add(assortmentPathLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        assortmentPathField = new JTextField();
        app.add(assortmentPathField, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        discountsPathField = new JTextField();
        app.add(discountsPathField, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        skiCostLabel = new JLabel();
        skiCostLabel.setText("Ski Cost");
        app.add(skiCostLabel, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        skiCostNum = new JSpinner();
        app.add(skiCostNum, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        penaltyLengthLabel = new JLabel();
        penaltyLengthLabel.setText("Length Difference Penalty");
        app.add(penaltyLengthLabel, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        penaltyLengthNum = new JSpinner();
        app.add(penaltyLengthNum, new com.intellij.uiDesigner.core.GridConstraints(3, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        typePenaltyLabel = new JLabel();
        typePenaltyLabel.setText("Type Difference Penalty");
        app.add(typePenaltyLabel, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        noSkiLabel = new JLabel();
        noSkiLabel.setText("No Ski Penalty");
        app.add(noSkiLabel, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        noSkiNum = new JSpinner();
        app.add(noSkiNum, new com.intellij.uiDesigner.core.GridConstraints(4, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        typePenaltyNum = new JSpinner();
        app.add(typePenaltyNum, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        discountsPathLabel = new JLabel();
        discountsPathLabel.setText("Path To Discounts");
        app.add(discountsPathLabel, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        bruteForceMethodButton = new JButton();
        bruteForceMethodButton.setText("Brute Force Method");
        app.add(bruteForceMethodButton, new com.intellij.uiDesigner.core.GridConstraints(6, 2, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        monteCasinoMethodButton = new JButton();
        monteCasinoMethodButton.setText("Monte Casino Method");
        app.add(monteCasinoMethodButton, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        methodLabel = new JLabel();
        methodLabel.setText("Click button below to select a method and calculate best result");
        app.add(methodLabel, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        resultField = new JTextPane();
        resultField.setEditable(false);
        app.add(resultField, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(500, 200), null, 0, false));
    }

    /**
     * $$$ get root component $$$ j component.
     *
     * @return the j component
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return app;
    }

}
