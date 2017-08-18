
/**
 * Created by Gerrie on 9/2/2016.
 */
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.Color;

public class Mandelbrot extends Fractals {
    double x_start;
    double x_end;
    double y_start;
    double y_end;

	
    public Mandelbrot(double x_start, double x_end, double y_start, double y_end, int iteration) {
		super (iteration);    //iterations are inherited from Fractals class 
        this.x_start = x_start;
        this.x_end = x_end;
        this.y_start = y_start;
        this.y_end = y_end;
    }


    public void draw(Graphics g) {    //draw the relevant Mandelbrot after relevant calculations
        Graphics2D g2 = (Graphics2D) g;

        double c_real, c_imag, pre_x_real, pre_y_imag,z_real,z_imag, abs;
        for (int width = 0; width <= 800; width++) {
            for (int height = 0; height <= 800; height++) {
                c_real=x_start+(width/800.0)*(x_end-x_start);    //find the real part of the c value when mapping
                c_imag=y_end-(height/800.0)*(y_end-y_start);    //find the imaginary part of the c value when mapping

                int counter;
                z_real=0;    //always initialized the default z=0 when starting the loop for given iterations
                z_imag=0;
                for(counter=0;counter<=iteration;counter++)
                {
                    pre_x_real=z_real;       //pre values keep the real & imaginary values of previous iteration
                    pre_y_imag=z_imag;
					
                    z_real=(pre_x_real*pre_x_real)-(pre_y_imag*pre_y_imag)+c_real;   //calculate the real & imaginary parts of current iteration
                    z_imag=2*pre_x_real*pre_y_imag+c_imag;
					
                    abs=Math.sqrt(z_real*z_real+z_imag*z_imag);   //calculate the absolute value for current z value
                    if(abs>2)
                    {
                        break;
                    }
                }

                Colors colors1=new Colors(counter,iteration);    //draw the point with the suitable color from pre defined colours in colors class according to the iterations ran before exit the previous loop
                int RGB[]=colors1.suit_color();
                Color mycolor=new Color(RGB[0],RGB[1],RGB[2]);
                g2.setColor(mycolor);
                g2.draw(new Line2D.Double(width, height, width, height));
            }

            }


        }


    }

