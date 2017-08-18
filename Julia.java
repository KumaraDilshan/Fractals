
/**
 * Created by Gerrie on 9/2/2016.
 */
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.Color;

public class Julia extends Fractals {
    double c_real;
    double c_imag;

	
    public Julia(double c_real, double c_imag, int iteration) {
		super (iteration);		//iterations are inherited from Fractals class 
        this.c_real = c_real;
        this.c_imag = c_imag;
    }

    public void draw(Graphics g) {		//draw the relevant Julia after relevant calculations
        Graphics2D g2 = (Graphics2D) g;

        double x_real,y_imag,pre_x_real,pre_y_imag,abs;
        for(int width=0;width<=800;width++)
        {
            for(int height=0;height<=800;height++)
            {
                x_real=-1+(width/800.0)*2;		//find the real part of the c value when mapping
                y_imag=1-(height/800.0)*2;		//find the imaginary part of the c value when mapping

                int counter;
                for(counter=0;counter<=iteration;counter++)
                {
                    pre_x_real=x_real;		//pre values keep the real & imaginary values of previous iteration
                    pre_y_imag=y_imag;
					
                    x_real=(pre_x_real*pre_x_real)-(pre_y_imag*pre_y_imag)+this.c_real;		//calculate the real & imaginary parts of current iteration
                    y_imag=2*pre_x_real*pre_y_imag+this.c_imag;
					
                    abs=Math.sqrt(x_real*x_real+y_imag*y_imag);		 //calculate the absolute value for current z value
                    if(abs>2)
                    {
                        break;
                    }
                }

                Colors colors1=new Colors(counter,iteration);		//draw the point with the suitable color from pre defined colours in colors class according to the iterations ran before exit the previous loop
                int RGB[]=colors1.suit_color();
                Color mycolor=new Color(RGB[0],RGB[1],RGB[2]);
                g2.setColor(mycolor);
                g2.draw(new Line2D.Double(width, height, width, height));
            }
        }
    }

}
