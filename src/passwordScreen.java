
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.KeyStroke;

public class passwordScreen extends JFrame implements ActionListener{

    GeneratePass passwordGenerate = new GeneratePass();

    private JFrame frame = new JFrame();
    private JLabel labePass = new JLabel();
    private JLabel labelGenerator = new JLabel();
    private JLabel labelCaracteres = new JLabel();
    private JLabel labelOption = new JLabel();
    private JButton btnGeneratoPassword = new JButton();
    private JButton btnCopy = new JButton();
    private JTextField inputPass = new JTextField();
    private JTextField inputCaracteres = new JTextField();
    private JToggleButton btnUpper = new JToggleButton();
    private JToggleButton btnLower = new JToggleButton();
    private JToggleButton btnNumber = new JToggleButton();
    private JToggleButton btnSymbol = new JToggleButton();
    
    public passwordScreen() {

        labelGenerator.setText("PASSWORD GENERATOR");
        labelGenerator.setFont(new Font("Inter", Font.BOLD, 25));
        labelGenerator.setForeground(Color.WHITE);
        labelGenerator.setBounds(55, 10, 350, 70);

        labePass.setText("PASSWORD");
        labePass.setFont(new Font("Inter", Font.BOLD, 12));
        labePass.setForeground(Color.WHITE);
        labePass.setBounds(60, 75, 200, 50);
        labePass.setBackground(Color.red);

        labelCaracteres.setText("PASSWORD LENGTH");
        labelCaracteres.setFont(new Font("Inter", Font.BOLD, 12));
        labelCaracteres.setForeground(Color.WHITE);
        labelCaracteres.setBounds(60, 255, 200, 50);
        labelCaracteres.setBackground(Color.red);

        inputPass.setBackground(new Color(33, 33, 33));
        inputPass.setForeground(Color.WHITE);
        inputPass.setFont(new Font("Inter", Font.BOLD, 18));
        inputPass.setBounds(58, 110, 300, 30);
        inputPass.setBorder(null);

        labelOption.setText("OPTIONS");
        labelOption.setFont(new Font("Inter", Font.BOLD, 12));
        labelOption.setForeground(Color.WHITE);
        labelOption.setBounds(58, 155, 300, 30);
        labelOption.setBackground(Color.red);

        inputCaracteres.setBackground(new Color(33, 33, 33));
        inputCaracteres.setForeground(Color.WHITE);
        inputCaracteres.setFont(new Font("Inter", Font.BOLD, 18));
        inputCaracteres.setBounds(58, 290, 300, 30);
        inputCaracteres.setHorizontalAlignment(JTextField.CENTER);
        inputCaracteres.setBorder(null);

        btnUpper.setText("UPPERCASE");
        btnUpper.setBackground(new Color(30, 215, 96));
        btnUpper.setForeground(Color.WHITE);
        btnUpper.setFont(new Font("Inter", Font.BOLD, 15));
        btnUpper.setBounds(58, 180, 145, 30);
        btnUpper.setCursor(new Cursor(HAND_CURSOR));
        btnUpper.setBorder(null);

        btnUpper.addActionListener(this);

        btnUpper.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnUpper.setBackground(new Color(20, 101, 66));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnUpper.setBackground(new Color(30, 215, 96));
            }
        });

        btnLower.setText("LOWERCASE");
        btnLower.setBackground(new Color(30, 215, 96));
        btnLower.setForeground(Color.WHITE);
        btnLower.setFont(new Font("Inter", Font.BOLD, 15));
        btnLower.setBounds(212, 180, 145, 30);
        btnLower.setCursor(new Cursor(HAND_CURSOR));
        btnLower.setBorder(null);

        btnLower.addActionListener(this);

        btnLower.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnLower.setBackground(new Color(20, 101, 66));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnLower.setBackground(new Color(30, 215, 96));
            }
        });

        btnNumber.setText("NUMBER");
        btnNumber.setBackground(new Color(30, 215, 96));
        btnNumber.setForeground(Color.WHITE);
        btnNumber.setFont(new Font("Inter", Font.BOLD, 15));
        btnNumber.setBounds(58, 220, 145, 30);
        btnNumber.setCursor(new Cursor(HAND_CURSOR));
        btnNumber.setBorder(null);

        btnNumber.addActionListener(this);

        btnNumber.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnNumber.setBackground(new Color(20, 101, 66));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnNumber.setBackground(new Color(30, 215, 96));
            }
        });

        btnSymbol.setText("SYMBOL");
        btnSymbol.setBackground(new Color(30, 215, 96));
        btnSymbol.setForeground(Color.WHITE);
        btnSymbol.setFont(new Font("Inter", Font.BOLD, 15));
        btnSymbol.setBounds(212, 220, 145, 30);
        btnSymbol.setCursor(new Cursor(HAND_CURSOR));
        btnSymbol.setBorder(null);

        btnSymbol.addActionListener(this);

        btnSymbol.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnSymbol.setBackground(new Color(20, 101, 66));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSymbol.setBackground(new Color(30, 215, 96));
            }
        });

        btnCopy.setText("COPY");
        btnCopy.setBackground(new Color(30, 215, 96));
        btnCopy.setForeground(new Color(255, 255, 255));
        btnCopy.setFont(new Font("Inter", Font.BOLD, 15));
        btnCopy.setBounds(58, 400, 300, 35);
        btnCopy.setCursor(new Cursor(HAND_CURSOR));
        btnCopy.setBorder(null);

        btnCopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (inputPass.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Oops! It seems we forgot to create a password. Please generate a password before proceeding", "Copy", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    // Get the text from inputPass
                    String passwordText = inputPass.getText();

                    // Configure clipboard text
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    StringSelection selection = new StringSelection(passwordText);
                    clipboard.setContents(selection, selection);

                    JOptionPane.showMessageDialog(null, "Password copied successfully !");

                }
            }
        });

        btnCopy.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnCopy.setBackground(new Color(20, 101, 66));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnCopy.setBackground(new Color(30, 215, 96));
            }
        });

        btnGeneratoPassword.setText("GENERATE PASSWORD");
        btnGeneratoPassword.setBackground(new Color(30, 215, 96));
        btnGeneratoPassword.setForeground(new Color(255, 255, 255));
        btnGeneratoPassword.setFont(new Font("Inter", Font.BOLD, 15));
        btnGeneratoPassword.setBounds(58, 350, 300, 35);
        btnGeneratoPassword.setCursor(new Cursor(HAND_CURSOR));
        btnGeneratoPassword.setBorder(null);

        btnGeneratoPassword.addActionListener(this);

        btnGeneratoPassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnGeneratoPassword.setBackground(new Color(20, 101, 66));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnGeneratoPassword.setBackground(new Color(30, 215, 96));
            }
        });

        btnGeneratoPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (inputCaracteres.getText().length() <= 0) {
                        return;
                    }

                    boolean anyBtn = btnLower.isSelected()
                            || btnUpper.isSelected() || btnNumber.isSelected()
                            || btnSymbol.isSelected();

                    int passLength = Integer.parseInt(inputCaracteres.getText());
                    if (anyBtn) {
                        String passGenerate = passwordGenerate.gerarSenha(passLength, btnLower.isSelected(), btnUpper.isSelected(), btnNumber.isSelected(), btnSymbol.isSelected());

                        inputPass.setText(passGenerate);

                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a number !", "User", JOptionPane.WARNING_MESSAGE);
                    inputCaracteres.setBorder(BorderFactory.createLineBorder(new Color(30, 215, 96)));
                    ex.printStackTrace();
                }
            }
        });

        btnGeneratoPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    btnGeneratoPassword.doClick();
                }
            }
        });

        // Adding KeyBinding to JButton to handle the Enter key 
        int condition = JComponent.WHEN_IN_FOCUSED_WINDOW;
        InputMap inputMap = btnGeneratoPassword.getInputMap(condition);
        ActionMap actionMap = btnGeneratoPassword.getActionMap();

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "clickEnter");
        actionMap.put("clickEnter", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnGeneratoPassword.doClick();
            }
        });

        frame.add(labelGenerator);
        frame.add(inputPass);
        frame.add(inputCaracteres);
        frame.add(btnUpper);
        frame.add(btnLower);
        frame.add(btnNumber);
        frame.add(btnSymbol);
        frame.add(btnGeneratoPassword);
        frame.add(labePass);
        frame.add(labelCaracteres);
        frame.add(labelOption);
        frame.add(btnCopy);

        frame.setTitle("Generate Password");
        frame.setSize(440, 570);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(18, 18, 18));
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnGeneratoPassword)) {
            verifyInput();

        }

    }

    private void verifyInput() {

        if (inputCaracteres.getText().equals("") || inputCaracteres.getText().equals(0)) {

            JOptionPane.showMessageDialog(null, "Please enter password length");
            inputCaracteres.setBorder(BorderFactory.createLineBorder(new Color(30, 215, 96)));

        }
        if (!btnLower.isSelected() && !btnUpper.isSelected() && !btnNumber.isSelected() && !btnSymbol.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please select at least one option");
            return;
        }

    }
}

