import javax.swing.*;

public class Prueba1 extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton enviarButton;
    private JPanel caja;

    public Prueba1(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(caja);
        setSize(300,300);
    }

    public static void main(String[] args) {
        Prueba1 p1 = new Prueba1();
    }
}
