import javax.swing.*;
import java.awt.*;



public class CalcFace extends JFrame {

    JButton addbtn,subbtn,divbtn,mulbtn,eqlbtn,delbtn,minbtn,maxbtn,sinbtn,cosbtn,tanbtn,log10btn,sqrtbtn,pwrbtn,ansbtn;
    JTextField txtwork, txtwork2,txtresult;
    public CalcFace(){
        JPanel panel_screen=new JPanel();
        panel_screen.setBounds(12,10,350,90);
        panel_screen.setBackground(Color.BLUE);

        txtwork=new JTextField(10);
        txtwork2 =new JTextField(10);

        txtresult=new JTextField(20);
        txtresult.setEditable(false);

        JPanel trig_panel=new JPanel();
        trig_panel.setBounds(240,110,130,80);
        trig_panel.setBackground(Color.orange);

        sinbtn=new JButton("sin");cosbtn=new JButton("cos");tanbtn=new JButton("tan");
        sinbtn.setFocusable(false);cosbtn.setFocusable(false);tanbtn.setFocusable(false);


        JPanel minPanel=new JPanel();
        minPanel.setBounds(130,110,100,80);
        minPanel.setBackground(Color.green);

        minbtn=new JButton("MIN");minbtn.setFocusable(false);
        maxbtn=new JButton("MAX");maxbtn.setFocusable(false);


        JPanel simple_arithmetic=new JPanel();
        simple_arithmetic.setBounds(5,110,120,80);
        simple_arithmetic.setBackground(Color.red);

        addbtn=new JButton("+");addbtn.setFocusable(false);
        subbtn=new JButton("-");subbtn.setFocusable(false);
        mulbtn=new JButton("*");mulbtn.setFocusable(false);
        divbtn=new JButton("/");divbtn.setFocusable(false);

        eqlbtn=new JButton("=");
        eqlbtn.setBounds(300,490,50,40);
        eqlbtn.setForeground(Color.YELLOW);
        eqlbtn.setBackground(Color.BLACK);
        eqlbtn.setFocusable(false);
        eqlbtn.setFont(new Font("georgia",Font.CENTER_BASELINE,12));

        delbtn=new JButton("DEL");
       delbtn.setBounds(40,200,90,50);
        delbtn.setFocusable(false);
        delbtn.setBackground(Color.yellow);
        delbtn.setFont(new Font("algerian",Font.BOLD,18));

        ansbtn=new JButton("Ans");
        ansbtn.setFocusable(false);
        ansbtn.setBounds(40,260,90,40);

        JPanel logpanel=new JPanel();
        logpanel.setBounds(150,200,200,80);
        logpanel.setBackground(Color.CYAN);

        log10btn=new JButton("log");    log10btn.setFocusable(false);
        sqrtbtn=new JButton("square_rt");   sqrtbtn.setFocusable(false);
        pwrbtn=new JButton("power");    pwrbtn.setFocusable(false);


        setTitle("calculator interface");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,700);
        setVisible(true);
        setLayout(null);


        add(panel_screen);
        panel_screen.add(txtwork);panel_screen.add(txtwork2);panel_screen.add(txtresult);//screen area panel

        add(simple_arithmetic);//panel for add,subb,div,mul buttons
        simple_arithmetic.add(addbtn);simple_arithmetic.add(subbtn);simple_arithmetic.add(divbtn);simple_arithmetic.add(mulbtn);

        add(eqlbtn);add(delbtn);add(ansbtn);

        operation_buttons();//button for add,subtract,multiply,division,answer,delete
        trigonometry_buttons();//button for sin,cos,tan
        minmax_buttons();//buttons for max and min
        sq_pwr_log_buttons();//buttons for square root,power and log

        add(minPanel);minPanel.add(minbtn);minPanel.add(maxbtn);//max and min panel

        add(trig_panel);trig_panel.add(sinbtn);trig_panel.add(cosbtn);trig_panel.add(tanbtn);//trigonometry panel

        add(logpanel);  logpanel.add(pwrbtn);   logpanel.add(sqrtbtn);  logpanel.add(log10btn);//panel for squareroot,log and power

    }

    public void operation_buttons(){
        addbtn.addActionListener(e->{
            double a = Double.parseDouble(txtwork.getText());
            double b = Double.parseDouble(txtwork2.getText());
            double result=a+b;
            txtresult.setText(Double.toString(result));


        });

        subbtn.addActionListener(e->{
            double a = Integer.parseInt(txtwork.getText());
            double b = Integer.parseInt(txtwork2.getText());
            double result=a-b;
            txtresult.setText(Double.toString(result));

        });

        divbtn.addActionListener(e->{
            double a = Integer.parseInt(txtwork.getText());
            double b = Integer.parseInt(txtwork2.getText());
            double result=a/b;
            txtresult.setText(Double.toString( result));

        });

        mulbtn.addActionListener(e->{
            double a = Integer.parseInt(txtwork.getText());
            double b = Integer.parseInt(txtwork2.getText());
            double result=a*b;
            txtresult.setText(Double.toString(result));

        });

        delbtn.addActionListener(e->{
            txtresult.setText("");
            txtwork2.setText("");txtwork.setText("");
        });

        ansbtn.addActionListener(e->{
            if(e.getSource()==ansbtn){
                txtresult.getText();
                System.out.println(txtresult.getText());
            }
        });
    }

    public void min() {
        double a = Double.parseDouble(txtwork.getText());
        double b = Double.parseDouble(txtwork2.getText());
        double min = Math.min(a, b);
        txtresult.setText(String.valueOf(min));
    }

    public void max() {
        double a = Double.parseDouble(txtwork.getText());
        double b = Double.parseDouble(txtwork2.getText());
        double max = Math.max(a, b);
        txtresult.setText(String.valueOf(max));}

    public void sin() {
        double a = Double.parseDouble(txtwork.getText());
      a= Math.toRadians(a);
      double rad=Math.sin(a);
      txtresult.setText(String.valueOf(rad));

        }



    public void cos() {
        double a = Double.parseDouble(txtwork.getText());
        a= Math.toRadians(a);
        double rad=Math.cos(a);
        txtresult.setText(String.valueOf(rad));

    }

    public void tan() {
        double a = Double.parseDouble(txtwork.getText());
        a= Math.toRadians(a);
        double rad=Math.tan(a);
        txtresult.setText(String.valueOf(rad));

    }

    public void sqrt(){
        double a = Double.parseDouble(txtwork.getText());
        double square_root=Math.sqrt(a);
        txtresult.setText(String.valueOf(square_root));


    }

    public void power(){
        double a = Double.parseDouble(txtwork.getText());
        double b = Double.parseDouble(txtwork2.getText());
        double power=Math.pow(a,b);
        txtresult.setText(String.valueOf(power));


    }

    public void log10(){
        double a = Double.parseDouble(txtwork.getText());
      double log=Math.log10(a);
        txtresult.setText(String.valueOf(log));


    }

    public void trigonometry_buttons(){
        sinbtn.addActionListener(e->{

            sin();

        });

        cosbtn.addActionListener(e->{
            cos();
        });

        tanbtn.addActionListener(e->{
            tan();
        });

    }
    public void minmax_buttons(){
        minbtn.addActionListener(e -> {
            min();
        });

        maxbtn.addActionListener(e -> {
            max();
        });
    }

    public void sq_pwr_log_buttons(){
        sqrtbtn.addActionListener(e->{
            sqrt();
            StringDetector();
        });

        pwrbtn.addActionListener(e->{
            power();
        });

        log10btn.addActionListener(e->{
            log10();

        });
    }


   public void StringDetector() {
        try{
       String UserInput = txtwork.getText();
       Double a = Double.parseDouble(UserInput);
       System.out.println("string btn clicked");


   } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null,"Warning: You have entered a string. Please enter a valid double.");
    }


   }
        public static void main(String[] args) {
        new CalcFace();
    }
}
