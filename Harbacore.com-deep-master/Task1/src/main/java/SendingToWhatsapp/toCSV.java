package SendingToWhatsapp;

import com.opencsv.CSVWriter;
import lombok.SneakyThrows;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class toCSV implements ActionListener {

    public static JTextField name, email, phoneno,pathtocsv;
    public static JTextArea area;
    JLabel nameL, emailL, phonenoL, areaL,pathtocsvL,dispRes;
    JButton b = new JButton("Submit");



    toCSV() {
        JFrame f = new JFrame("Button Example");
        JButton btn = new JButton("Click Here");

        name = new JTextField();
        email = new JTextField();
        phoneno = new JTextField();
        area = new JTextArea();
        pathtocsv= new JTextField("src/test/java/items.csv");
        nameL = new JLabel("NAME :");
        emailL = new JLabel("E-mail :");
        phonenoL = new JLabel("Phone-No :");
        areaL = new JLabel("Comment :");
        pathtocsvL =new JLabel("Path for csv");
        dispRes = new JLabel("");


        b.setBounds(90, 330, 95, 30);
        nameL.setBounds(10, 50, 70, 20);
        name.setBounds(90, 50, 200, 20);
        emailL.setBounds(10, 100, 70, 20);
        email.setBounds(90, 100, 200, 20);
        phonenoL.setBounds(10, 150, 70, 20);
        phoneno.setBounds(90, 150, 200, 20);
        areaL.setBounds(10, 200, 70, 20);
        area.setBounds(90, 200, 200, 100);
        pathtocsvL.setBounds(10,430,80,20);
        pathtocsv.setBounds(90,430,200, 20);
        dispRes.setBounds(90,370,100,30);



        b.addActionListener(this);

        f.add(nameL); f.add(pathtocsvL);f.add(pathtocsv);
        f.add(name);f.add(dispRes);
        f.add(email);
        f.add(phoneno);/*f.add(button);*/
        f.add(area);
        f.add(emailL);
        f.add(phonenoL);
        f.add(areaL);
        f.add(b);
        f.setSize(500, 700);
        f.setLayout(null);
        f.setVisible(true);
    }

    @SneakyThrows
    public void actionPerformed(ActionEvent e) {

        System.out.println(pathtocsv.getText());
        CSVWriter writer = new CSVWriter(new FileWriter(pathtocsv.getText(), true), ';', '"', '/', CSVWriter.DEFAULT_LINE_END);

        String[] row1 = new String[]{name.getText(), email.getText(), phoneno.getText(), area.getText()};
        dispRes.setText("Details Updated");

        writer.writeNext(row1);
        writer.close();


    }

    public static void main(String[] args) {
        new toCSV();
    }


}
