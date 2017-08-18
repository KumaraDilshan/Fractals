
/**
 * Created by Gerrie on 9/3/2016.
 */
public class Colors {    //class to choose RGB values for points reguarding to the counter when z's abs>2
    int counter;
    int iteration;

    public Colors(int counter, int iteration) {
        this.counter = counter;
        this.iteration = iteration;
    }

    public int[] suit_color()
    {
        int rem=this.counter%9;   //10 different colors have been assigned to the points considering the modules by 9 of the counter exept black
        int arr1[]=new int[3];
       // double limit=iteration/20.0;

        if (this.counter==(this.iteration+1))   //Black color is assigned to points which are converged into the set according to the absolute condition
        {
            arr1[0] = 0;
            arr1[1] = 0;
            arr1[2] = 0;
        }
        else if(rem==0)
        {
            arr1[0] = 51;
            arr1[1] = 102;
            arr1[2] = 0;
        }
        else if(rem==1)
        {
            arr1[0] = 51;
            arr1[1] = 51;
            arr1[2] = 51;
        }
        else if(rem==2)
        {
            arr1[0] = 102;
            arr1[1] = 102;
            arr1[2] = 51;
        }
        else if(rem==3)
        {
            arr1[0] = 204;
            arr1[1] = 51;
            arr1[2] = 102;
        }
        else if(rem==4)
        {
            arr1[0] = 51;
            arr1[1] = 204;
            arr1[2] = 51;
        }
        else if(rem==5)
        {
            arr1[0] = 102;
            arr1[1] = 0;
            arr1[2] = 255;
        }
        else if(rem==6)
        {
            arr1[0] = 102;
            arr1[1] = 255;
            arr1[2] = 0;
        }
        else if(rem==7)
        {
            arr1[0] = 51;
            arr1[1] = 0;
            arr1[2] = 255;
        }
        else if(rem==8)
        {
            arr1[0] = 0;
            arr1[1] = 0;
            arr1[2] = 102;
        }
      /*  if (this.counter<=(limit*1)) {
            arr1[0] = 0;
            arr1[1] = 0;
            arr1[2] = 153;
        }
        else if(this.counter<=(limit*2)) {
            arr1[0] = 0;
            arr1[1] = 51;
            arr1[2] = 255;
        }
        else if(this.counter<=(limit*3)) {
            arr1[0] = 0;
            arr1[1] = 102;
            arr1[2] = 0;
        }
        else if(this.counter<=(limit*4)) {
            arr1[0] = 0;
            arr1[1] = 204;
            arr1[2] = 0;
        }
        else if(this.counter<=(limit*5)) {
            arr1[0] = 0;
            arr1[1] = 255;
            arr1[2] = 0;
        }
        else if(this.counter<=(limit*6)) {
            arr1[0] = 0;
            arr1[1] = 255;
            arr1[2] = 51;
        }
        else if(this.counter<=(limit*7)) {
            arr1[0] = 0;
            arr1[1] = 0;
            arr1[2] = 102;
        }
        else if(this.counter<=(limit*8)) {
            arr1[0] = 0;
            arr1[1] = 0;
            arr1[2] = 153;
        }
        else if(this.counter<=(limit*9)) {
            arr1[0] = 0;
            arr1[1] = 0;
            arr1[2] = 204;
        }
        else if(this.counter<=(limit*10)) {
            arr1[0] = 0;
            arr1[1] = 0;
            arr1[2] = 255;
        }
        else if(this.counter<=(limit*11)) {
            arr1[0] = 51;
            arr1[1] = 51;
            arr1[2] = 204;
        }
        else if(this.counter<=(limit*12)) {
            arr1[0] = 51;
            arr1[1] = 102;
            arr1[2] = 153;
        }
        else if(this.counter<=(limit*13)) {
            arr1[0] = 204;
            arr1[1] = 255;
            arr1[2] = 0;
        }
        else if(this.counter<=(limit*14)) {
            arr1[0] = 204;
            arr1[1] = 255;
            arr1[2] = 51;
        }
        else if(this.counter<=(limit*15)) {
            arr1[0] = 255;
            arr1[1] = 255;
            arr1[2] = 255;
        }
        else if(this.counter<=(limit*15)) {
            arr1[0] = 204;
            arr1[1] = 0;
            arr1[2] = 0;
        }
        else if(this.counter<=(limit*16)) {
            arr1[0] = 204;
            arr1[1] = 51;
            arr1[2] = 0;
        }
        else if(this.counter<=(limit*17)) {
            arr1[0] = 204;
            arr1[1] = 0;
            arr1[2] = 51;
        }
        else if(this.counter<=(limit*18)) {
            arr1[0] = 204;
            arr1[1] = 0;
            arr1[2] = 102;
        }
        else if(this.counter<=(limit*19)) {
            arr1[0] = 204;
            arr1[1] = 0;
            arr1[2] = 153;
        }
        else{
            arr1[0] = 0;
            arr1[1] = 0;
            arr1[2] = 0;
        }*/
        return arr1;
    }
}
