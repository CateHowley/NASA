import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;





// video to load jar
//https://www.youtube.com/watch?v=QAJ09o3Xl_0

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

// Program for print data in JSON format.
public class ReadJson {
    //public class Medium2 implements ActionListener {

        public JFrame mainframe;
        private JLabel statusLabel;
        private JPanel imagePanel;
        private JLabel imageLabel;
        private String image;

        private String title;
        private String description;

        private JPanel controlPanel;
        private JMenuBar mb;
        private JMenu file, edit, help;
        private JMenuItem cut, copy, paste, selectAll;
        private JTextArea ta; //typing area
        private int WIDTH = 900;
        private int HEIGHT = 700;
    private JLabel statusLabel2;


        public static void main(String args[]) throws ParseException, IOException {
            //prepareGUI();






            // In java JSONObject is used to create JSON object
            // which is a subclass of java.util.HashMap.

            JSONObject file = new JSONObject();
            // file.put("Full Name", "Ritu Sharma");
            // file.put("Roll No.", 1704310046);
            // file.put("Tution Fees", 65400);


            // To print in JSON format.
            System.out.print(file.get("Tution Fees"));
            // pull();
            ReadJson h = new ReadJson();

        }



        public ReadJson() throws ParseException, IOException {
            pull();
            prepareGUI();


        }


        private void prepareGUI() throws IOException {
            mainframe = new JFrame("Java SWING Examples");
            mainframe.setSize(WIDTH, HEIGHT);
            mainframe.setLayout(new GridLayout(3, 1));

            //   menu at top
            cut = new JMenuItem("cut");
            copy = new JMenuItem("copy");
            paste = new JMenuItem("paste");
            selectAll = new JMenuItem("selectAll");
            //cut.addActionListener(this);
            //copy.addActionListener(this);
            //paste.addActionListener(this);
            //selectAll.addActionListener(this);

            statusLabel = new JLabel("Label", JLabel.CENTER);
            statusLabel.setSize(250, 100);
            statusLabel2 = new JLabel("Label", JLabel.CENTER);
            statusLabel2.setSize(250, 100);

            mainframe.add(statusLabel);
            imagePanel=new JPanel();
            addImage();
            mainframe.add(statusLabel2);
            statusLabel.setText(title);
            statusLabel2.setText(description);


            mainframe.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    System.exit(0);
                }
            });

            mainframe.setVisible(true);

        }
    private void showEventDemo() {
        JButton okButton = new JButton("button 1");
        JButton submitButton = new JButton("button 2");
        JButton cancelButton = new JButton("button 3");
        JButton myButton = new JButton("button 4");
        JButton helloButton = new JButton("button 5");
        JButton sixButton = new JButton("button 6");
        JButton sevenButton = new JButton("button 7");
        JButton eightButton = new JButton("button 8");
        JButton nineButton = new JButton("button 9");
        JButton tenButton = new JButton("button 10");


        okButton.setActionCommand("button 1");
        submitButton.setActionCommand("button 2");
        cancelButton.setActionCommand("button 3");
        myButton.setActionCommand("button 4");
        myButton.setActionCommand("button 5");
        sixButton.setActionCommand("button 6");
        sevenButton.setActionCommand("button 7");
        eightButton.setActionCommand("button 8");
        nineButton.setActionCommand("button 9");
        tenButton.setActionCommand("button 10");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());
        myButton.addActionListener(new ButtonClickListener());
        helloButton.addActionListener(new ButtonClickListener());

        mainframe.add(okButton);
        mainframe.add(submitButton);
        mainframe.add(cancelButton);
        mainframe.add(myButton);
        mainframe.add(helloButton);
        mainframe.setVisible(true);
        mainframe.add(sixButton);
        mainframe.add(sevenButton);
        mainframe.add(eightButton);
        mainframe.add(tenButton);
        controlPanel.add(nineButton,BorderLayout.EAST);
        controlPanel.add(tenButton,BorderLayout.WEST);
        mainframe.setVisible(true);


    }
    private void addImage() throws IOException {
        try {
            String path = "";
//                if (!ta.getText().contains("http")) {
            path = "https://i.pinimg.com/originals/07/16/ba/0716ba54fe3b77b3a5b0b16c7bc33389.png";
//                } else {
//                    path = ta.getText();
//                    if (path.contains("url")) {
//                        path = path.substring(path.indexOf("http"));
//                    }
//                }

            URL url = new URL(image);
            BufferedImage ErrorImage = ImageIO.read(new File("images.png"));
            BufferedImage inputImageBuff = ImageIO.read(url.openStream());
            // weiYing =

            ImageIcon inputImage;
            if (inputImageBuff != null) {
                inputImage = new ImageIcon(inputImageBuff.getScaledInstance(700, 300, Image.SCALE_SMOOTH));
                // = new JLabel();
                if (inputImage != null) {
                    imageLabel = new JLabel(inputImage);
                } else {
                    imageLabel =new JLabel(new ImageIcon(ErrorImage.getScaledInstance(800, 589, Image.SCALE_SMOOTH)));

                }
                imagePanel.removeAll();
                imagePanel.add(imageLabel);
                 mainframe.add(imagePanel, BorderLayout.CENTER);

            }

        } catch(Exception e ){
            System.out.println(e);
            System.out.println("error");
        }
        mainframe.setVisible(true);


        // private void showEventDemo() {

//            JButton okButton = new JButton("button 1");
//            JButton submitButton = new JButton("button 2");
//            JButton cancelButton = new JButton("button 3");
//            JButton myButton = new JButton("button 4");
//            JButton helloButton = new JButton("button 5");
//            JButton sixButton = new JButton("button 6");
//            JButton sevenButton = new JButton("button 7");
//            JButton eightButton = new JButton("button 8");
//            JButton nineButton = new JButton("button 9");
//            JButton tenButton = new JButton("button 10");

//
//            okButton.setActionCommand("button 1");
//            submitButton.setActionCommand("button 2");
//            cancelButton.setActionCommand("button 3");
//            myButton.setActionCommand("button 4");
//            myButton.setActionCommand("button 5");
//            sixButton.setActionCommand("button 6");
//            sevenButton.setActionCommand("button 7");
//            eightButton.setActionCommand("button 8");
//            nineButton.setActionCommand("button 9");
//            tenButton.setActionCommand("button 10");
//
//            okButton.addActionListener(new ButtonClickListener());
//            submitButton.addActionListener(new ButtonClickListener());
//            cancelButton.addActionListener(new ButtonClickListener());
//            myButton.addActionListener(new ButtonClickListener());
//            helloButton.addActionListener(new ButtonClickListener());
//
//
//            mainFrame.add(okButton);
//            mainFrame.add(submitButton);
//            mainFrame.add(cancelButton);
//            mainFrame.add(myButton);
//            mainFrame.add(helloButton);
//            mainFrame.setVisible(true);
//            mainFrame.add(sixButton);
//            mainFrame.add(sevenButton);
//            mainFrame.add(eightButton);
//            mainFrame.add(nineButton);
//            mainFrame.add(tenButton);
//            controlPanel.add(nineButton,BorderLayout.EAST);
//            controlPanel.add(tenButton,BorderLayout.WEST);
//            mainFrame.setVisible(true);
    }

public void pull() throws ParseException {
            String output = "abc";
            String totlaJson = "";
            try {

                URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=bBgKXSnoBu20JOwfzZnrx21PnMd9VIHuaugqDg8T");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setRequestProperty("Accept", "application/json");

                if (conn.getResponseCode() != 200) {

                    throw new RuntimeException("Failed : HTTP error code : "
                            + conn.getResponseCode());
                }

                BufferedReader br = new BufferedReader(new InputStreamReader(
                        (conn.getInputStream())));


                System.out.println("Output from Server .... \n");
                while ((output = br.readLine()) != null) {
                    System.out.println(output);
                    totlaJson += output;
                }

                conn.disconnect();

            } catch (MalformedURLException e) {
                e.printStackTrace();

            } catch (IOException e) {
                e.printStackTrace();
            }

            JSONParser parser = new JSONParser();
            //System.out.println(str);
            org.json.simple.JSONObject jsonObject = (org.json.simple.JSONObject) parser.parse(totlaJson);
            System.out.println(jsonObject);

            try {

                //String name = (String)jsonObject.get(0);
                System.out.println(jsonObject.get("title"));
                System.out.println(jsonObject.get("explanation"));
                System.out.println(jsonObject.get("url"));
                image = (String) jsonObject.get("url");
                title= (String)jsonObject.get("title");
                description = (String) jsonObject.get("explanation");

//            org.json.simple.JSONObject msg = (org.json.simple.JSONObject) jsonObject.get(0);
//            System.out.println(msg.get("image"));
//            System.out.println(msg.get("image"));
//            int n =   msg.size(); //(msg).length();
//            for (int i = 0; i < n; ++i) {
//                String test =(String) msg.get(i);
//                System.out.println(test);
//                // System.out.println(person.getInt("key"));
//            }

                //System.out.println(name);
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("OK")) {
                statusLabel.setText("Ok Button clicked.");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else if (command.equals("Cate!")) {
                statusLabel.setText("Cate! Button clicked");
            } else if (command.equals("hello")) {
                statusLabel.setText("hello! Button clicked");
            } else{
                statusLabel.setText("Cancel Button clicked.");

            }
        }
    }
    }




