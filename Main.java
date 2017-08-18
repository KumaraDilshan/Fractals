import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {    
    private static int WIDTH = 800;    
    private static int HEIGHT = 800;

    public static double x_start=0;    //Fields for mandelbrot set
    public static double x_end=0;
    public static double y_start=0;
    public static double y_end=0;
    public static int iteration_mandel=0;


    public static double c_real=0;     //Fields for julia set
    public static double c_imag=0;
    public static int iteration_juliya=0;

    public static boolean condition;   //Boolean condition to check the string given for arg[0] 

	
	
    public static void main(String[] args) {  
		if (args.length==0)
		{
			System.out.println("Error!No inputs!");    //print an error if user input nothing
            System.exit(-1);
		}
		
		else if(args[0].equals("Mandelbrot"))   //check weathe the arg[0] is Mandelbrot and checking various arguments
        {
            condition=true;
            if(args.length==1)
            {
                x_start=-1;
                x_end=1;
                y_start=-1;
                y_end=1;
                iteration_mandel=1000;
            }
            if(args.length==5)
            {
                x_start=Double.parseDouble(args[1]);
                x_end=Double.parseDouble(args[2]);
                y_start=Double.parseDouble(args[3]);
                y_end=Double.parseDouble(args[4]);
                iteration_mandel=1000;
            }
            if(args.length==6)
            {
                x_start=Double.parseDouble(args[1]);
                x_end=Double.parseDouble(args[2]);
                y_start=Double.parseDouble(args[3]);
                y_end=Double.parseDouble(args[4]);
                iteration_mandel=Integer.parseInt(args[5]);
                if(iteration_mandel<=0){
                    System.out.println("Wrong iteration input!");    //print an error if user input negetive iterations
                    System.exit(-1);
                }
            }

        }
        else if(args[0].equals("Julia"))    //check weathe the arg[0] is Julia and checking various arguments
        {
            condition=false;
            if(args.length==1)
            {
                c_real=-0.4;
                c_imag=0.6;
                iteration_juliya=1000;
            }
            if(args.length==3)
            {
                c_real=Double.parseDouble(args[1]);
                c_imag=Double.parseDouble(args[2]);
                iteration_juliya=1000;
            }
            if(args.length==4)
            {
                c_real=Double.parseDouble(args[1]);
                c_imag=Double.parseDouble(args[2]);
                iteration_juliya=Integer.parseInt(args[3]);
                    if(iteration_juliya<=0){
                        System.out.println("Wrong iteration input!");    //print an error if user input negetive iterations
                        System.exit(-1);
                }
            }
        }
        else {
            System.out.println("Invalid inputs!");    //print an error if user input a wrong name for arg[0]
            System.exit(-1);
        }
		
		
		JFrame frame = new JFrame("Fractals");    //frame details and properties

        frame.setContentPane(new Main());
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setSize(WIDTH, HEIGHT);
        frame.pack();
        frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public void paintComponent(Graphics g) {    //method to print
        if (condition==true)    //draw a Mandelbrot suitable to the user inputs
        {
            Mandelbrot mandelbrot=new Mandelbrot(x_start,x_end,y_start,y_end,iteration_mandel);
            super.paintComponent(g);
            mandelbrot.draw(g);
        }
        else if (condition==false)    //draw a Julia suitable to the user inputs
        {
            Julia julia=new Julia(c_real,c_imag,iteration_juliya);
            super.paintComponent(g);
            julia.draw(g);
        }
    }
}
