import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProfitLossCalculator extends JFrame {
    
/* Imiphumela ekugcineni  */ 
    
    private JLabel incomeLabel, expenseLabel, resultLabel;
    private JTextField incomeTextField, expenseTextField, resultTextField;
    private JButton calculateButton, clearButton, exitButton;

    public ProfitLossCalculator() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Profit/Loss Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
/* Lawa Ama Label Asekhona Kwi Java IDE Ngokwayo Akha Ibhokisi */

        incomeLabel = new JLabel("Income:");
        expenseLabel = new JLabel("Expense:");
        resultLabel = new JLabel("Profit/Loss:");
        incomeTextField = new JTextField(10);
        expenseTextField = new JTextField(10);
        resultTextField = new JTextField(10);
        resultTextField.setEditable(false);
        calculateButton = new JButton("Calculate");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");

        calculateButton.addActionListener((evt) -> {
            double income = Double.parseDouble(incomeTextField.getText());
            double expense = Double.parseDouble(expenseTextField.getText());
            double result = income - expense;
            resultTextField.setText(String.format("%.2f", result));
        });

        clearButton.addActionListener((evt) -> {
            incomeTextField.setText("");
            expenseTextField.setText("");
            resultTextField.setText("");
        });

        exitButton.addActionListener((evt) -> {
            dispose();
        });

        var layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(calculateButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clearButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(exitButton))
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(incomeLabel)
                                                .addComponent(expenseLabel)
                                                .addComponent(resultLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(incomeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                .addComponent(expenseTextField)
                                                .addComponent(resultTextField))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(incomeLabel)
                                .addComponent(incomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(expenseLabel)
                                .addComponent(expenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(resultLabel)
                                .addComponent(resultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(calculateButton)
                                .addComponent(clearButton)
                                .addComponent(exitButton))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ProfitLossCalculator();
    }
}
