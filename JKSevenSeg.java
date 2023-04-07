/**
 * 
 */

public class JKSevenSeg
{

    public static void main(String [] args)
    {
        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        int nextW = 0;
        for(int i = 0; x <= 10; x++)
        {
            //display BCD
            nextW = ffOutput(calcJa(w, x, y), calcKa(w), w);
            w = nextW;
        }
 
    }
    
    public static int ffOutput(int j, int k, int q){
        return or(and(not(q), j), and(q, not(k)));
    }
    
    public static int or(int i , int j)
    {
        if (i == 1 || j == 1)
            return 1;
        return 0;
    }
    
    
    public static int calcJa(int w, int x, int y)
    {
        return and(w,x,y);
    }
    
    public static int calcKa(int w)
    {
        return w;
    }
    
    public static int calcJb(int w, int x)
    {
        return and(w,x);
    }
    public static int calcKb(int w, int x)
    {
        return and(w,x);
    }
    public static int calcJc(int w, int x)
    {
        return and(not(w),x);
    }
    public static int calcKc(int w)
    {
        return w;
    }
    
    public static int and(int w, int x)
    {
        if(w == 1 && x == 1)
            return 1;
        return 0;
    }
    
    public static int and(int w, int x, int y)
    {
        if (w == 1 && x == 1 && y == 1)
            return 1;
        return 0;
    }
    
    public static int not(int w)
    {
        if(w == 1)
            return 0;
        return 1;
    }
    
    
}
