package ConnectGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomsGUIConnect {
    private JFrame mainFrame;
    private JButton userPortalButton;
    private JButton employeeListButton;

    public CustomsGUIConnect() {
        prepareGUI();
        addButtons();
    }

    public static void main(String[] args) {
        CustomsGUIConnect guiExample = new CustomsGUIConnect();
        guiExample.showEvent();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Custom Management");
        mainFrame.setSize(300, 200);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addButtons() {
        userPortalButton = new JButton("User Portal");
        employeeListButton = new JButton("Employee List");

        userPortalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showUserPortal();
            }
        });

        employeeListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showEmployeeList();
            }
        });

        mainFrame.add(userPortalButton);
        mainFrame.add(employeeListButton);
    }

    private void showUserPortal() {
        final JFrame userPortalFrame = new JFrame("User Portal");
        userPortalFrame.setSize(300, 200);

        JLabel nameLabel = new JLabel("Name:");
        final JTextField nameField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        final JPasswordField passwordField = new JPasswordField(20);

        JButton signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String password = new String(passwordField.getPassword());

                if (isValidPassword(password)) {
                    JOptionPane.showMessageDialog(userPortalFrame, "Signup successful!");

                    showAdditionalButtons(userPortalFrame);
                } else {
                    JOptionPane.showMessageDialog(userPortalFrame, "Invalid password! Password must contain " +
                            "at least 7 characters with 2 uppercase letters, 2 lowercase letters, and 2 digits.");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(signUpButton);

        userPortalFrame.add(panel);
        userPortalFrame.setVisible(true);
    }

    private boolean isValidPassword(String password) {
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        return password.length() >= 7 && uppercaseCount >= 2 && lowercaseCount >= 2 && digitCount >= 2;
    }

    private void showAdditionalButtons(JFrame parentFrame) {
        JButton exportProductsButton = new JButton("Export Products");
        JButton importedProductsButton = new JButton("Imported Products");

        exportProductsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showProductList("Export Products");
            }
        });

        importedProductsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showProductList("Imported Products");
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(exportProductsButton);
        panel.add(importedProductsButton);

        parentFrame.getContentPane().removeAll();
        parentFrame.getContentPane().add(panel);
        parentFrame.getContentPane().revalidate();
        parentFrame.getContentPane().repaint();
    }

    private void showProductList(String title) {
        JFrame productListFrame = new JFrame(title);
        productListFrame.setSize(400, 300);

        String[] productCategories = {"Electronic Products", "Clothing Products", "Food Products",
                "Books Products", "Medicine Products", "Automobile Products", "Toys Products"};

        JList<String> productList = new JList<>(productCategories);
        JScrollPane scrollPane = new JScrollPane(productList);

        productListFrame.add(scrollPane);
        productListFrame.setVisible(true);
    }

    private void showEmployeeList() {
        JFrame employeeListFrame = new JFrame("Employee List");
        employeeListFrame.setSize(700, 600);

        JTextArea employeeListArea = new JTextArea();
        employeeListArea.setEditable(false);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Customs_Employee.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                employeeListArea.append(line + "\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        JScrollPane scrollPane = new JScrollPane(employeeListArea);

        employeeListFrame.add(scrollPane);
        employeeListFrame.setVisible(true);
    }

    private void showEvent() {
        mainFrame.setVisible(true);
    }
}
