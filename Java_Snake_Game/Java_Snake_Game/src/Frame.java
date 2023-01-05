import javax.swing.JFrame;

public class Frame extends JFrame{

    Frame(){
        this.add(new Panel());
        this.setTitle("snake");

        //ensuring same experiance across different devices
        this.setResizable(false);//set the frame fix size for same game experiances
        this.pack();//different screen or resolution

        this.setVisible(true);

        //making sure the frame spawns in the center of the screen
        this.setLocationRelativeTo(null);
    }
}
