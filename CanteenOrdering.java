import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class CanteenOrdering {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PHINMA UI Canteen Order");
        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 960, 740);
        panel.setBackground(new Color(51, 0, 17));
        panel.setLayout(null);

        JLabel order = new JLabel("PHINMA UI Canteen");
        order.setForeground(Color.WHITE);
        order.setBounds(350, 30, 400, 40);
        order.setFont(new Font("Dialog", Font.BOLD, 24));

        JPanel categories = new JPanel();
        categories.setBounds(20, 80, 200, 590);
        categories.setBackground(new Color(153, 0, 51));
        categories.setLayout(null);

        JButton main = new JButton("Main Dishes");
        main.setFont(new Font("Dialog", Font.BOLD, 16));
        main.setBounds(25, 20, 150, 125);
        styleButton(main);

        JButton noodles = new JButton("Pasta/Noodles");
        noodles.setFont(new Font("Dialog", Font.BOLD, 16));
        noodles.setBounds(25, 165, 150, 125);
        styleButton(noodles);

        JButton ss = new JButton("<html>Snacks/Sandwiches");
        ss.setFont(new Font("Dialog", Font.BOLD, 16));
        ss.setBounds(25, 310, 150, 120);
        styleButton(ss);

        JButton drinks = new JButton("Drinks");
        drinks.setFont(new Font("Dialog", Font.BOLD, 16));
        drinks.setBounds(25, 450, 150, 120);
        styleButton(drinks);

        ImageIcon icon = new ImageIcon("Files/adobo.jpg");
        JLabel imageLabel = new JLabel(new ImageIcon(icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        imageLabel.setBounds(280, 85, 100, 100);
        panel.add(imageLabel);

        JLabel adoboPriceLabel = new JLabel(" Adobo ₱60", SwingConstants.CENTER);
        adoboPriceLabel.setForeground(Color.WHITE);
        adoboPriceLabel.setFont(new Font("Dialog", Font.BOLD, 14));
        adoboPriceLabel.setBounds(280, 185, 100, 20);
        panel.add(adoboPriceLabel);

        JLabel qtyLabel = new JLabel("Qty:");
        qtyLabel.setForeground(Color.WHITE);
        qtyLabel.setBounds(390, 120, 30, 30);
        JTextField qtyField = new JTextField("", 3);
        qtyField.setBounds(420, 120, 40, 30);

        ImageIcon icon5 = new ImageIcon("Files/chicken.jpg");
        JLabel imageLabel5 = new JLabel(new ImageIcon(icon5.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        imageLabel5.setBounds(500, 85, 100, 100);
        panel.add(imageLabel5);

        JLabel chickenPriceLabel = new JLabel(" Chicken ₱30", SwingConstants.CENTER);
        chickenPriceLabel.setForeground(Color.WHITE);
        chickenPriceLabel.setFont(new Font("Dialog", Font.BOLD, 14));
        chickenPriceLabel.setBounds(500, 185, 100, 20);
        panel.add(chickenPriceLabel);

        JLabel qtyLabel5 = new JLabel("Qty:");
        qtyLabel5.setForeground(Color.WHITE);
        qtyLabel5.setBounds(620, 120, 30, 30);
        JTextField qtyField5 = new JTextField("", 3);
        qtyField5.setBounds(650, 120, 40, 30);

        ImageIcon icon9 = new ImageIcon("Files/curry.jpg");
        JLabel imageLabel9 = new JLabel(new ImageIcon(icon9.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        imageLabel9.setBounds(730, 85, 100, 100);
        panel.add(imageLabel9);

        JLabel curryPriceLabel = new JLabel(" Curry ₱60", SwingConstants.CENTER);
        curryPriceLabel.setForeground(Color.WHITE);
        curryPriceLabel.setFont(new Font("Dialog", Font.BOLD, 14));
        curryPriceLabel.setBounds(730, 185, 100, 20);
        panel.add(curryPriceLabel);

        JLabel qtyLabel9 = new JLabel("Qty:");
        qtyLabel9.setForeground(Color.WHITE);
        qtyLabel9.setBounds(850, 120, 30, 30);
        JTextField qtyField9 = new JTextField("", 3);
        qtyField9.setBounds(880, 120, 40, 30);

       
        ImageIcon icon2 = new ImageIcon("Files/canton.jpg");
        JLabel imageLabel2 = new JLabel(new ImageIcon(icon2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        imageLabel2.setBounds(280, 230, 100, 100);
        panel.add(imageLabel2);

        JLabel cantonPriceLabel = new JLabel("Canton ₱40", SwingConstants.CENTER);
        cantonPriceLabel.setForeground(Color.WHITE);
        cantonPriceLabel.setFont(new Font("Dialog", Font.BOLD, 14));
        cantonPriceLabel.setBounds(280, 330, 100, 20);
        panel.add(cantonPriceLabel);

        JLabel qtyLabel2 = new JLabel("Qty:");
        qtyLabel2.setForeground(Color.WHITE);
        qtyLabel2.setBounds(390, 265, 30, 30);
        JTextField qtyField2 = new JTextField("", 3);
        qtyField2.setBounds(420, 265, 40, 30);

        ImageIcon icon6 = new ImageIcon("Files/spag.jpg");
        JLabel imageLabel6 = new JLabel(new ImageIcon(icon6.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        imageLabel6.setBounds(500, 230, 100, 100);
        panel.add(imageLabel6);

        JLabel spagPriceLabel = new JLabel("Spaghetti ₱35", SwingConstants.CENTER);
        spagPriceLabel.setForeground(Color.WHITE);
        spagPriceLabel.setFont(new Font("Dialog", Font.BOLD, 14));
        spagPriceLabel.setBounds(500, 330, 100, 20);
        panel.add(spagPriceLabel);

        JLabel qtyLabel6 = new JLabel("Qty:");
        qtyLabel6.setForeground(Color.WHITE);
        qtyLabel6.setBounds(620, 265, 30, 30);
        JTextField qtyField6 = new JTextField("", 3);
        qtyField6.setBounds(650, 265, 40, 30);

        ImageIcon icon10 = new ImageIcon("Files/carbonara.jpg");
        JLabel imageLabel10 = new JLabel(new ImageIcon(icon10.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        imageLabel10.setBounds(730, 230, 100, 100);
        panel.add(imageLabel10);

        JLabel carbonaraPriceLabel = new JLabel("<html>Carbonara ₱45", SwingConstants.CENTER);
        carbonaraPriceLabel.setForeground(Color.WHITE);
        carbonaraPriceLabel.setFont(new Font("Dialog", Font.BOLD, 14));
        carbonaraPriceLabel.setBounds(730, 330, 110, 20);
        panel.add(carbonaraPriceLabel);

        JLabel qtyLabel10 = new JLabel("Qty:");
        qtyLabel10.setForeground(Color.WHITE);
        qtyLabel10.setBounds(850, 265, 30, 30);
        JTextField qtyField10 = new JTextField("", 3);
        qtyField10.setBounds(880, 265, 40, 30);

       
        ImageIcon icon3 = new ImageIcon("Files/fries.jpg");
        JLabel imageLabel3 = new JLabel(new ImageIcon(icon3.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        imageLabel3.setBounds(280, 375, 100, 100);
        panel.add(imageLabel3);

        JLabel friesPriceLabel = new JLabel("Fries ₱30", SwingConstants.CENTER);
        friesPriceLabel.setForeground(Color.WHITE);
        friesPriceLabel.setFont(new Font("Dialog", Font.BOLD, 14));
        friesPriceLabel.setBounds(280, 475, 100, 20);
        panel.add(friesPriceLabel);

        JLabel qtyLabel3 = new JLabel("Qty:");
        qtyLabel3.setForeground(Color.WHITE);
        qtyLabel3.setBounds(390, 410, 30, 30);
        JTextField qtyField3 = new JTextField("", 3);
        qtyField3.setBounds(420, 410, 40, 30);

        ImageIcon icon7 = new ImageIcon("Files/sandwich.jpg");
        JLabel imageLabel7 = new JLabel(new ImageIcon(icon7.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        imageLabel7.setBounds(500, 375, 100, 100);
        panel.add(imageLabel7);

        JLabel sandwichPriceLabel = new JLabel("Sandwich ₱15", SwingConstants.CENTER);
        sandwichPriceLabel.setForeground(Color.WHITE);
        sandwichPriceLabel.setFont(new Font("Dialog", Font.BOLD, 14));
        sandwichPriceLabel.setBounds(500, 475, 100, 20);
        panel.add(sandwichPriceLabel);

        JLabel qtyLabel7 = new JLabel("Qty:");
        qtyLabel7.setForeground(Color.WHITE);
        qtyLabel7.setBounds(620, 410, 30, 30);
        JTextField qtyField7 = new JTextField("", 3);
        qtyField7.setBounds(650, 410, 40, 30);

        ImageIcon icon11 = new ImageIcon("Files/siomai.jpg");
        JLabel imageLabel11 = new JLabel(new ImageIcon(icon11.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        imageLabel11.setBounds(730, 375, 100, 100);
        panel.add(imageLabel11);

        JLabel siomaiPriceLabel = new JLabel("Siomai ₱20", SwingConstants.CENTER);
        siomaiPriceLabel.setForeground(Color.WHITE);
        siomaiPriceLabel.setFont(new Font("Dialog", Font.BOLD, 14));
        siomaiPriceLabel.setBounds(730, 475, 100, 20);
        panel.add(siomaiPriceLabel);

        JLabel qtyLabel11 = new JLabel("Qty:");
        qtyLabel11.setForeground(Color.WHITE);
        qtyLabel11.setBounds(850, 410, 30, 30);
        JTextField qtyField11 = new JTextField("", 3);
        qtyField11.setBounds(880, 410, 40, 30);

        
        ImageIcon icon4 = new ImageIcon("Files/water.jpg");
        JLabel imageLabel4 = new JLabel(new ImageIcon(icon4.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        imageLabel4.setBounds(280, 530, 100, 100);
        panel.add(imageLabel4);

        JLabel waterPriceLabel = new JLabel("Water ₱20", SwingConstants.CENTER);
        waterPriceLabel.setForeground(Color.WHITE);
        waterPriceLabel.setFont(new Font("Dialog", Font.BOLD, 14));
        waterPriceLabel.setBounds(280, 630, 100, 20);
        panel.add(waterPriceLabel);

        JLabel qtyLabel4 = new JLabel("Qty:");
        qtyLabel4.setForeground(Color.WHITE);
        qtyLabel4.setBounds(390, 570, 30, 30);
        JTextField qtyField4 = new JTextField("", 3);
        qtyField4.setBounds(420, 570, 40, 30);

        ImageIcon icon8 = new ImageIcon("Files/icetea.jpg");
        JLabel imageLabel8 = new JLabel(new ImageIcon(icon8.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        imageLabel8.setBounds(500, 530, 100, 100);
        panel.add(imageLabel8);

        JLabel iceteaPriceLabel = new JLabel("Ice Tea ₱15", SwingConstants.CENTER);
        iceteaPriceLabel.setForeground(Color.WHITE);
        iceteaPriceLabel.setFont(new Font("Dialog", Font.BOLD, 14));
        iceteaPriceLabel.setBounds(500, 630, 100, 20);
        panel.add(iceteaPriceLabel);

        JLabel qtyLabel8 = new JLabel("Qty:");
        qtyLabel8.setForeground(Color.WHITE);
        qtyLabel8.setBounds(620, 570, 30, 30);
        JTextField qtyField8 = new JTextField("", 3);
        qtyField8.setBounds(650, 570, 40, 30);

        ImageIcon icon12 = new ImageIcon("Files/cucumber.jpg");
        JLabel imageLabelh12 = new JLabel(new ImageIcon(icon12.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        imageLabelh12.setBounds(730, 530, 100, 100);
        panel.add(imageLabelh12);

        JLabel cucumberPriceLabel = new JLabel("Cucumber ₱15", SwingConstants.CENTER);
        cucumberPriceLabel.setForeground(Color.WHITE);
        cucumberPriceLabel.setFont(new Font("Dialog", Font.BOLD, 14));
        cucumberPriceLabel.setBounds(730, 630, 110, 20);
        panel.add(cucumberPriceLabel);

        JLabel qtyLabel12 = new JLabel("Qty:");
        qtyLabel12.setForeground(Color.WHITE);
        qtyLabel12.setBounds(850, 570, 30, 30);
        JTextField qtyField12 = new JTextField("", 3);
        qtyField12.setBounds(880, 570, 40, 30);

        
        JLabel totalLabel = new JLabel("Total: ₱0");
        totalLabel.setForeground(Color.WHITE);
        totalLabel.setBounds(630, 680, 140, 30);
        totalLabel.setFont(new Font("Dialog", Font.BOLD, 18));

        JButton checkoutBtn = new JButton("Checkout");
        checkoutBtn.setFont(new Font("Dialog", Font.BOLD, 16));
        checkoutBtn.setBounds(750, 675, 120, 40);
        styleButton(checkoutBtn);

        categories.add(main);
        categories.add(noodles);
        categories.add(ss);
        categories.add(drinks);

        panel.add(order);
        panel.add(categories);
        panel.add(qtyLabel); panel.add(qtyField);
        panel.add(qtyLabel5); panel.add(qtyField5);
        panel.add(qtyLabel9); panel.add(qtyField9);
        panel.add(qtyLabel2); panel.add(qtyField2);
        panel.add(qtyLabel6); panel.add(qtyField6);
        panel.add(qtyLabel10); panel.add(qtyField10);
        panel.add(qtyLabel3); panel.add(qtyField3);
        panel.add(qtyLabel7); panel.add(qtyField7);
        panel.add(qtyLabel11); panel.add(qtyField11);
        panel.add(qtyLabel4); panel.add(qtyField4);
        panel.add(qtyLabel8); panel.add(qtyField8);
        panel.add(qtyLabel12); panel.add(qtyField12);
        panel.add(totalLabel); panel.add(checkoutBtn);

        frame.add(panel);
        frame.setVisible(true);

        DocumentListener autoTotalListener = new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { updateTotal(qtyField, qtyField5, qtyField9, qtyField2, qtyField6, qtyField10, qtyField3, qtyField7, qtyField11, qtyField4, qtyField8, qtyField12, totalLabel); }
            public void removeUpdate(DocumentEvent e) { updateTotal(qtyField, qtyField5, qtyField9, qtyField2, qtyField6, qtyField10, qtyField3, qtyField7, qtyField11, qtyField4, qtyField8, qtyField12, totalLabel); }
            public void changedUpdate(DocumentEvent e) { updateTotal(qtyField, qtyField5, qtyField9, qtyField2, qtyField6, qtyField10, qtyField3, qtyField7, qtyField11, qtyField4, qtyField8, qtyField12, totalLabel); }
        };

        qtyField.getDocument().addDocumentListener(autoTotalListener);
        qtyField5.getDocument().addDocumentListener(autoTotalListener);
        qtyField9.getDocument().addDocumentListener(autoTotalListener);
        qtyField2.getDocument().addDocumentListener(autoTotalListener);
        qtyField6.getDocument().addDocumentListener(autoTotalListener);
        qtyField10.getDocument().addDocumentListener(autoTotalListener);
        qtyField3.getDocument().addDocumentListener(autoTotalListener);
        qtyField7.getDocument().addDocumentListener(autoTotalListener);
        qtyField11.getDocument().addDocumentListener(autoTotalListener);
        qtyField4.getDocument().addDocumentListener(autoTotalListener);
        qtyField8.getDocument().addDocumentListener(autoTotalListener);
        qtyField12.getDocument().addDocumentListener(autoTotalListener);

        checkoutBtn.addActionListener(e -> {
            try {
                int qty1 = Integer.parseInt(qtyField.getText().trim().isEmpty() ? "0" : qtyField.getText().trim());      
                int qty2 = Integer.parseInt(qtyField5.getText().trim().isEmpty() ? "0" : qtyField5.getText().trim());     
                int qty3 = Integer.parseInt(qtyField9.getText().trim().isEmpty() ? "0" : qtyField9.getText().trim());     
                int qty4 = Integer.parseInt(qtyField2.getText().trim().isEmpty() ? "0" : qtyField2.getText().trim());     
                int qty5 = Integer.parseInt(qtyField6.getText().trim().isEmpty() ? "0" : qtyField6.getText().trim());     
                int qty6 = Integer.parseInt(qtyField10.getText().trim().isEmpty() ? "0" : qtyField10.getText().trim());   
                int qty7 = Integer.parseInt(qtyField3.getText().trim().isEmpty() ? "0" : qtyField3.getText().trim());     
                int qty8 = Integer.parseInt(qtyField7.getText().trim().isEmpty() ? "0" : qtyField7.getText().trim());     
                int qty9 = Integer.parseInt(qtyField11.getText().trim().isEmpty() ? "0" : qtyField11.getText().trim());   
                int qty10 = Integer.parseInt(qtyField4.getText().trim().isEmpty() ? "0" : qtyField4.getText().trim());    
                int qty11 = Integer.parseInt(qtyField8.getText().trim().isEmpty() ? "0" : qtyField8.getText().trim());    
                int qty12 = Integer.parseInt(qtyField12.getText().trim().isEmpty() ? "0" : qtyField12.getText().trim());  
        
                
                int price1 = 60;  
                int price2 = 30; 
                int price3 = 60;  
                int price4 = 40;  
                int price5 = 35; 
                int price6 = 45;  
                int price7 = 30;  
                int price8 = 15;  
                int price9 = 20;  
                int price10 = 20; 
                int price11 = 15; 
                int price12 = 15; 
        
                int total = (qty1 * price1) + (qty2 * price2) + (qty3 * price3) + (qty4 * price4) +
                            (qty5 * price5) + (qty6 * price6) + (qty7 * price7) + (qty8 * price8) +
                            (qty9 * price9) + (qty10 * price10) + (qty11 * price11) + (qty12 * price12);
        
                StringBuilder summary = new StringBuilder();
                if (qty1 > 0) summary.append("Adobo x ").append(qty1).append(" = ₱").append(qty1 * price1).append("\n");
                if (qty2 > 0) summary.append("Chicken x ").append(qty2).append(" = ₱").append(qty2 * price2).append("\n");
                if (qty3 > 0) summary.append("Chicken Curry x ").append(qty3).append(" = ₱").append(qty3 * price3).append("\n");
                if (qty4 > 0) summary.append("Canton x ").append(qty4).append(" = ₱").append(qty4 * price4).append("\n");
                if (qty5 > 0) summary.append("Spaghetti x ").append(qty5).append(" = ₱").append(qty5 * price5).append("\n");
                if (qty6 > 0) summary.append("Carbonara x ").append(qty6).append(" = ₱").append(qty6 * price6).append("\n");
                if (qty7 > 0) summary.append("Fries x ").append(qty7).append(" = ₱").append(qty7 * price7).append("\n");
                if (qty8 > 0) summary.append("Sandwich x ").append(qty8).append(" = ₱").append(qty8 * price8).append("\n");
                if (qty9 > 0) summary.append("Siomai x ").append(qty9).append(" = ₱").append(qty9 * price9).append("\n");
                if (qty10 > 0) summary.append("Water x ").append(qty10).append(" = ₱").append(qty10 * price10).append("\n");
                if (qty11 > 0) summary.append("Ice Tea x ").append(qty11).append(" = ₱").append(qty11 * price11).append("\n");
                if (qty12 > 0) summary.append("Cucumber Juice x ").append(qty12).append(" = ₱").append(qty12 * price12).append("\n");
        
                summary.append("\nTotal: ₱").append(total);
        
                JOptionPane.showMessageDialog(null, summary.toString(), "Checkout Summary", JOptionPane.INFORMATION_MESSAGE);
        
                qtyField.setText("");
                qtyField5.setText("");
                qtyField9.setText("");
                qtyField2.setText("");
                qtyField6.setText("");
                qtyField10.setText("");
                qtyField3.setText("");
                qtyField7.setText("");
                qtyField11.setText("");
                qtyField4.setText("");
                qtyField8.setText("");
                qtyField12.setText("");
        
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid quantities.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }  
    private static void updateTotal(JTextField qtyField, JTextField qtyField5, JTextField qtyField9,
                                 JTextField qtyField2, JTextField qtyField6, JTextField qtyField10,
                                 JTextField qtyField3, JTextField qtyField7, JTextField qtyField11,
                                 JTextField qtyField4, JTextField qtyField8, JTextField qtyField12,
                                 JLabel totalLabel) {
    try {
        int qty1 = Integer.parseInt(qtyField.getText().trim().isEmpty() ? "0" : qtyField.getText().trim());       
        int qty2 = Integer.parseInt(qtyField5.getText().trim().isEmpty() ? "0" : qtyField5.getText().trim());     
        int qty3 = Integer.parseInt(qtyField9.getText().trim().isEmpty() ? "0" : qtyField9.getText().trim());     
        int qty4 = Integer.parseInt(qtyField2.getText().trim().isEmpty() ? "0" : qtyField2.getText().trim());    
        int qty5 = Integer.parseInt(qtyField6.getText().trim().isEmpty() ? "0" : qtyField6.getText().trim());     
        int qty6 = Integer.parseInt(qtyField10.getText().trim().isEmpty() ? "0" : qtyField10.getText().trim());   
        int qty7 = Integer.parseInt(qtyField3.getText().trim().isEmpty() ? "0" : qtyField3.getText().trim());     
        int qty8 = Integer.parseInt(qtyField7.getText().trim().isEmpty() ? "0" : qtyField7.getText().trim());     
        int qty9 = Integer.parseInt(qtyField11.getText().trim().isEmpty() ? "0" : qtyField11.getText().trim());   
        int qty10 = Integer.parseInt(qtyField4.getText().trim().isEmpty() ? "0" : qtyField4.getText().trim());    
        int qty11 = Integer.parseInt(qtyField8.getText().trim().isEmpty() ? "0" : qtyField8.getText().trim());    
        int qty12 = Integer.parseInt(qtyField12.getText().trim().isEmpty() ? "0" : qtyField12.getText().trim());  

        int price1 = 60;  
        int price2 = 30;  
        int price3 = 60;  
        int price4 = 40;  
        int price5 = 35;  
        int price6 = 45;  
        int price7 = 30;  
        int price8 = 15;  
        int price9 = 20;  
        int price10 = 20; 
        int price11 = 15; 
        int price12 = 15; 

        int total = (qty1 * price1) + (qty2 * price2) + (qty3 * price3) + (qty4 * price4) +
                    (qty5 * price5) + (qty6 * price6) + (qty7 * price7) + (qty8 * price8) +
                    (qty9 * price9) + (qty10 * price10) + (qty11 * price11) + (qty12 * price12);

        totalLabel.setText("Total: ₱" + total);
    } catch (NumberFormatException e) {
        totalLabel.setText("Total: ₱0");
    }
}


    private static void styleButton(JButton btn) {
        btn.setForeground(Color.BLACK);
        btn.setBackground(new Color(255, 179, 179));
        btn.setBorderPainted(false);
        btn.setOpaque(true);
        btn.setFocusPainted(false);
    }
}
