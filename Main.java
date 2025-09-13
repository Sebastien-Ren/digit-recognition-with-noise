    import java.awt.Point;
    import java.util.*;
    import java.awt.Font;
    
    public class Main
    {
    
        static double[][] zero = {{0,1,1,1,0},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {0,1,1,1,0}};
    
        static double[][] one = {{0,1,1,0,0},
                {0,0,1,0,0},
                {0,0,1,0,0},
                {0,0,1,0,0},
                {0,0,1,0,0},
                {0,0,1,0,0},
                {1,1,1,1,1}};
    
        static double[][] two = {{0,1,1,1,0},
                {1,0,0,0,1},
                {0,0,0,1,0},
                {0,0,1,0,0},
                {0,1,0,0,0},
                {1,0,0,0,0},
                {1,1,1,1,1}};
    
                               
        static double[][] three = {{0,1,1,1,0},
                {1,0,0,0,1},
                {0,0,0,0,1},
                {0,0,1,1,0},
                {0,0,0,0,1},
                {1,0,0,0,1},
                {0,1,1,1,0}};
    
        static double[][] four =     {{0,0,1,1,0},
                {0,1,0,1,0},
                {0,1,0,1,0},
                {1,0,0,1,0},
                {1,1,1,1,1},
                {0,0,0,1,0},
                {0,0,0,1,0}};
    
        static double[][] five  =        {{1,1,1,1,1},
                {1,0,0,0,0},
                {1,1,1,1,0},
                {0,0,0,0,1},
                {0,0,0,0,1},
                {1,0,0,0,1},
                {0,1,1,1,0}};
    
        static double[][] six =              {{0,0,1,1,1},
                {0,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {0,1,1,1,0}};
    
        static double[][] seven =                {{1,1,1,1,1},
                {0,0,0,0,1},
                {0,0,0,1,0},
                {0,0,1,0,0},
                {0,0,1,0,0},
                {0,1,0,0,0},
                {0,1,0,0,0}};
    
        static double[][] eight =                    {{0,1,1,1,0},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {0,1,1,1,0},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {0,1,1,1,0}};
    
        static double[][] nine =                         {{0,1,1,1,0},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {0,1,1,1,1},
                {0,0,0,0,1},
                {0,0,0,1,0},
                {0,1,1,0,0}};
    
        static double[][] zeroAfterTrain = {{0,1,1,1,0},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {0,1,1,1,0}};
    
        static double[][] oneAfterTrain = {{0,1,1,0,0},
                {0,0,1,0,0},
                {0,0,1,0,0},
                {0,0,1,0,0},
                {0,0,1,0,0},
                {0,0,1,0,0},
                {1,1,1,1,1}};
    
        static double[][] twoAfterTrain = {{0,1,1,1,0},
                {1,0,0,0,1},
                {0,0,0,1,0},
                {0,0,1,0,0},
                {0,1,0,0,0},
                {1,0,0,0,0},
                {1,1,1,1,1}};
    
                                                        
        static double[][] threeAfterTrain = {{0,1,1,1,0},
                {1,0,0,0,1},
                {0,0,0,0,1},
                {0,0,1,1,0},
                {0,0,0,0,1},
                {1,0,0,0,1},
                {0,1,1,1,0}};
    
        static double[][] fourAfterTrain =     {{0,0,1,1,0},
                {0,1,0,1,0},
                {0,1,0,1,0},
                {1,0,0,1,0},
                {1,1,1,1,1},
                {0,0,0,1,0},
                {0,0,0,1,0}};
    
        static double[][] fiveAfterTrain  =        {{1,1,1,1,1},
                {1,0,0,0,0},
                {1,1,1,1,0},
                {0,0,0,0,1},
                {0,0,0,0,1},
                {1,0,0,0,1},
                {0,1,1,1,0}};
    
        static double[][] sixAfterTrain =              {{0,0,1,1,1},
                {0,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {0,1,1,1,0}};
    
        static double[][] sevenAfterTrain =                {{1,1,1,1,1},
                {0,0,0,0,1},
                {0,0,0,1,0},
                {0,0,1,0,0},
                {0,0,1,0,0},
                {0,1,0,0,0},
                {0,1,0,0,0}};
    
        static double[][] eightAfterTrain =                    {{0,1,1,1,0},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {0,1,1,1,0},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {0,1,1,1,0}};
    
        static double[][] nineAfterTrain =              {{0,1,1,1,0},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {0,1,1,1,1},
                {0,0,0,0,1},
                {0,0,0,1,0},
                {0,1,1,0,0}};
    
        static double[][] errornewArr =              {{0,0,0,0,0},{1,0,0,0,1},
                {0,1,0,1,0},
                {0,0,1,0,0}, 
                {0,1,0,1,0}, 
                {1, 0,0,0,1}, {0,0,0,0,0}};                                                                             
    
        static double[][] gridArray;
        static double[][] trainingSet = new double[300][35];
        static Perceptron pereptronForZero = new Perceptron(35, 0.000009, 0.0004, 5000000);
    
        static Perceptron pereptronForOne = new Perceptron(35, 0.000009, 0.0004, 5000000);
        static Perceptron pereptronForTwo= new Perceptron(35, 0.000009, 0.0004, 5000000);
    
        static Perceptron pereptronForThree = new Perceptron(35, 0.000009, 0.0004, 5000000);
        static Perceptron pereptronForFour = new Perceptron(35, 0.000009, 0.0004, 5000000);
        static Perceptron pereptronForFive = new Perceptron(35, 0.000009, 0.0004, 5000000);
        static Perceptron pereptronForSix = new Perceptron(35, 0.000009, 0.0004, 5000000);
        static Perceptron pereptronForSeven = new Perceptron(35, 0.000009, 0.0004, 5000000);
        static Perceptron pereptronForEight = new Perceptron(35, 0.000009, 0.0004, 5000000);
        static Perceptron pereptronForNine = new Perceptron(35, 0.000009, 0.0004, 5000000);
    
        static double[] zeroOutputArray = new double[300];
        static double[] oneOutputArray = new double[300];
        static double[] twoOutputArray = new double[300];
        static double[] threeOutputArray = new double[300];
        static double[] fourOutputArray = new double[300];
        static double[] fiveOutputArray = new double[300];
        static double[] sixOutputArray = new double[300];
        static double[] sevenOutputArray = new double[300];
        static double[] eightOutputArray = new double[300];
        static double[] nineOutputArray = new double[300];
    
        public static void main(String[] args)
        {
    
            StdDraw.enableDoubleBuffering();
            StdDraw.setCanvasSize(1200,600);
            StdDraw.setXscale(0, 200);
            StdDraw.setYscale(0,100);
            StdDraw.setPenRadius(0.002);
            Font font = new Font("Arial", Font.BOLD, 25);
            StdDraw.setFont(font);
    
            for(int i = 4; i <= 11; i++)
            {
                StdDraw.line(59.5, i* 5.5 +10 , 32, i*5.5 +10);
            }
            for(int i = 4; i <= 9; i++)
            {
                StdDraw.line(i*5.5 + 10, 32, i*5.5 + 10, 70.5);
            }
    
            for(int i = 4; i <= 11; i++)
            {
                StdDraw.line(59.5 + 100, i* 5.5 +10 , 32 + 100, i*5.5 +10);
            }
            for(int i = 4; i <= 9; i++)
            {
                StdDraw.line(i*5.5 + 10 + 100, 32, i*5.5 + 10 + 100, 70.5);
            }
    
            StdDraw.rectangle(95, 75, 16, 6);
            StdDraw.text(95,75, "Refresh");
            StdDraw.rectangle(95, 60, 16, 6);
            StdDraw.text(95,60, "Train");
            StdDraw.rectangle(95, 45, 16, 6);
            StdDraw.text(95,45, "Noise");
            StdDraw.rectangle(95, 30, 16, 6);
            StdDraw.text(95,30, "Guess");
            StdDraw.square(30 + 20,10,4);
            StdDraw.text(30+ 20,10, "0");
            StdDraw.square(30+ 20,10,4);
            StdDraw.text(40+ 20,10, "1");
            StdDraw.square(40+ 20,10,4);
            StdDraw.text(50+ 20,10, "2");
            StdDraw.square(50+ 20,10,4);
            StdDraw.text(60+ 20,10, "3");
            StdDraw.square(60+ 20,10,4);
            StdDraw.text(70+ 20,10, "4");
            StdDraw.square(70+ 20,10,4);
            StdDraw.text(80+ 20,10, "5");
            StdDraw.square(80+ 20,10,4);
            StdDraw.text(90+ 20,10, "6");
            StdDraw.square(90+ 20,10,4);
            StdDraw.text(100+ 20,10, "7");
            StdDraw.square(100+ 20,10,4);
            StdDraw.text(110+ 20,10,"8");
            StdDraw.square(110+ 20,10,4);
            StdDraw.text(120+ 20,10, "9");
            StdDraw.square(120+ 20,10,4);
    
            gridArray = zero;
            gridding(gridArray);
    
            for(int i = 0; i < 300; i++)
            {
                if(i <30)
                {
                    zeroOutputArray[i] = 1;
                }
                else
                {
                    zeroOutputArray[i] = 0;
                }
            }
            for(int i = 0; i < 300; i++)
            {
                if( 30 <= i  && i < 60)
                {
                    oneOutputArray[i] = 1;
                }
                else
                {
                    oneOutputArray[i] = 0;
                }
            }
            for(int i = 0; i < 300; i++)
            {
                if( 60 <= i  && i < 90)
                {
                    twoOutputArray[i] = 1;
                }
                else
                {
                    twoOutputArray[i] = 0;
                }
            }
            for(int i = 0; i < 300; i++)
            {
                if( 90 <= i  && i < 120)
                {
                    threeOutputArray[i] = 1;
                }
                else
                {
                    threeOutputArray[i] = 0;
                }
            }
            for(int i = 0; i < 300; i++)
            {
                if( 120 <= i  && i < 150)
                {
                    fourOutputArray[i] = 1;
                }
                else
                {
                    fourOutputArray[i] = 0;
                }
            }
            for(int i = 0; i < 300; i++)
            {
                if( 150 <= i  && i < 180)
                {
                    fiveOutputArray[i] = 1;
                }
                else
                {
                    fiveOutputArray[i] = 0;
                }
            }
            for(int i = 0; i < 300; i++)
            {
                if( 180 <= i  && i < 210)
                {
                    sixOutputArray[i] = 1;
                }
                else
                {
                    sixOutputArray[i] = 0;
                }
            }
            for(int i = 0; i < 300; i++)
            {
                if( 210 <= i  && i < 240)
                {
                    sevenOutputArray[i] = 1;
                }
                else
                {
                    sevenOutputArray[i] = 0;
                }
            }
            for(int i = 0; i < 300; i++)
            {
                if( 240 <= i  && i < 270)
                {
                    eightOutputArray[i] = 1;
                }
                else
                {
                    eightOutputArray[i] = 0;
                }
            }
            for(int i = 0; i < 300; i++)
            {
                if( 270 <= i  && i < 300)
                {
                    nineOutputArray[i] = 1;
                }
                else
                {
                    nineOutputArray[i] = 0;
                }
            }
    
            double[][] newArr =  {{0,0,0,0,0},
                    {0,0,0,0,0},
                    {0,0,0,0,0},
                    {0,0,0,0,0},
                    {0,0,0,0,0},
                    {0,0,0,0,0},
                    {0,0,0,0,0}};
            
            refresh();
            gridding(newArr);
            StdDraw.show();
    
            while(!StdDraw.isKeyPressed(32))
            {
    
                if(StdDraw.mousePressed())
                {
                    double xValFromSTD = StdDraw.mouseX();
                    double yValFromSTD = StdDraw.mouseY();
                    int xSideAsGrid = (int)((5/(59.5-32.166666))*(xValFromSTD - 32.1666666));
                    int ySideAsGrid = (int)((7/(31.8333333-70.5))*(yValFromSTD-70.5));
                    if(xSideAsGrid < 0 || xSideAsGrid > 4 || ySideAsGrid < 0 || ySideAsGrid > 6)
                    {
                        if(xValFromSTD >= 83 && xValFromSTD <= 108 && yValFromSTD <= 79 && yValFromSTD >= 71)
                        {
                            for(int i = 0; i < newArr.length; i++)
                            {
                                for(int j = 0; j < newArr[0].length; j++)
                                {
                                    newArr[i][j] = 0;
                                }
                            }
                            refresh();
    
                            StdDraw.show();
                        }
                        if(xValFromSTD >= 83 && xValFromSTD <= 108 && yValFromSTD <= 64 && yValFromSTD >= 57)
                        {
                            trainingMethod();
                            for(int i = 0; i < newArr.length; i++)
                            {
                                for(int j = 0; j < newArr[0].length; j++)
                                {
                                    newArr[i][j] = 0;
                                }
                            }
                            refresh();
    
                            StdDraw.show();
                        }
                        if(xValFromSTD >= 83 && xValFromSTD <= 108 && yValFromSTD <= 50 && yValFromSTD >= 41)
                        {
                            createNoise(newArr);
                            gridding(newArr);
                            StdDraw.pause(300);
                        }
                        if(xValFromSTD >= 83 && xValFromSTD <= 107 && yValFromSTD <= 34 && yValFromSTD >= 25)
                        {
                            int h = 0;
                            if(pereptronForZero.getOutput(make1D(newArr), 1) == 1)
                            {
                                drawGridSecond(zeroAfterTrain);
                                StdDraw.show();
                                h++;
                            }
                            if(pereptronForOne.getOutput(make1D(newArr), 1) == 1)
                            {
                                drawGridSecond(oneAfterTrain);
                                StdDraw.show();
                                h++;
                            }
                            if(pereptronForTwo.getOutput(make1D(newArr), 1) == 1)
                            {
                                drawGridSecond(twoAfterTrain);
                                StdDraw.show();
                                h++;
                            }
                            if(pereptronForThree.getOutput(make1D(newArr), 1) == 1)
                            {
                                drawGridSecond(threeAfterTrain);
                                StdDraw.show();
                                h++;
    
                            }
                            if(pereptronForFour.getOutput(make1D(newArr), 1) == 1)
                            {
                                drawGridSecond(fourAfterTrain);
                                StdDraw.show();
                                h++;
    
                            }
                            if(pereptronForFive.getOutput(make1D(newArr), 1) == 1)
                            {
                                drawGridSecond(fiveAfterTrain);
                                StdDraw.show();
                                h++;
    
                            }
                            if(pereptronForSix.getOutput(make1D(newArr), 1) == 1)
                            {
                                drawGridSecond(sixAfterTrain);
                                StdDraw.show();
                                h++;
    
                            }
                            if(pereptronForSeven.getOutput(make1D(newArr), 1) == 1)
                            {
                                drawGridSecond(sevenAfterTrain);
                                StdDraw.show();
                                h++;
    
                            }
                            if(pereptronForEight.getOutput(make1D(newArr), 1) == 1)
                            {
                                drawGridSecond(eightAfterTrain);
                                StdDraw.show();
                                h++;
    
                            }
                            if(pereptronForNine.getOutput(make1D(newArr), 1) == 1)
                            {
                                drawGridSecond(nineAfterTrain);
                                StdDraw.show();
                                h++;
    
                            }
                            if(h == 0 || h >1)
                            {
                                refresh();
                                gridding(newArr);
                                drawGridSecond(errornewArr);
                                StdDraw.show();
                            }
                        }
    
                    }
                    else
                    {
    
                        if(newArr[ySideAsGrid][xSideAsGrid] > 0)
                        {
                            newArr[ySideAsGrid][xSideAsGrid] = 0;
                            refresh();
                            gridding(newArr);
    
                        }
                        else
                        {
                            newArr[ySideAsGrid][xSideAsGrid] = 1;
                            refresh();
                            gridding(newArr);
                        }
                        StdDraw.pause(800);
                        StdDraw.show();
                    }
    
                    if(xValFromSTD > 30 + 20 - 4 && xValFromSTD < 30+20 + 4 && yValFromSTD > 10-4 && yValFromSTD < 10+4){
                        refresh();
                        gridding(zeroAfterTrain);
                        setEqual(newArr,zeroAfterTrain);
                    }
                    else if(xValFromSTD > 40 + 20 - 4 && xValFromSTD < 40+20 + 4 && yValFromSTD > 10-4 && yValFromSTD < 10+4){
                        refresh();
                        gridding(oneAfterTrain);
                        setEqual(newArr,oneAfterTrain);
                    }
                    else if(xValFromSTD > 50 + 20 - 4 && xValFromSTD < 50+20 + 4 && yValFromSTD > 10-4 && yValFromSTD < 10+4){
                        refresh();
                        gridding(twoAfterTrain);
                        setEqual(newArr,twoAfterTrain);
                    }
                    else if(xValFromSTD > 60 + 20 - 4 && xValFromSTD < 60+20 + 4 && yValFromSTD > 10-4 && yValFromSTD < 10+4){
                        refresh();
                        gridding(threeAfterTrain);
                        setEqual(newArr,threeAfterTrain);
                    }
                    else if(xValFromSTD > 70 + 20 - 4 && xValFromSTD < 70+20 + 4 && yValFromSTD > 10-4 && yValFromSTD < 10+4){
                        refresh();
                        gridding(fourAfterTrain);
                        setEqual(newArr,fourAfterTrain);
                    }
                    else if(xValFromSTD > 80 + 20 - 4 && xValFromSTD < 80+20 + 4 && yValFromSTD > 10-4 && yValFromSTD < 10+4){
                        refresh();
                        gridding(fiveAfterTrain);
                        setEqual(newArr,fiveAfterTrain);
                    }
                    else if(xValFromSTD > 90 + 20 - 4 && xValFromSTD < 90+20 + 4 && yValFromSTD > 10-4 && yValFromSTD < 10+4){
                        refresh();
                        gridding(sixAfterTrain);
                        setEqual(newArr,sixAfterTrain);
                    }
                    else if(xValFromSTD > 100 + 20 - 4 && xValFromSTD < 100+20 + 4 && yValFromSTD > 10-4 && yValFromSTD < 10+4){
                        refresh();
                        gridding(sevenAfterTrain);
                        setEqual(newArr,sevenAfterTrain);
                    }
                    else if(xValFromSTD > 110 + 20 - 4 && xValFromSTD < 110+20 + 4 && yValFromSTD > 10-4 && yValFromSTD < 10+4){
                        refresh();
                        gridding(eightAfterTrain);
                        setEqual(newArr,eightAfterTrain);
                    }
                    else if(xValFromSTD > 120 + 20 - 4 && xValFromSTD < 120+20 + 4 && yValFromSTD > 10-4 && yValFromSTD < 10+4){
                        refresh();
                        gridding(nineAfterTrain);
                        setEqual(newArr,nineAfterTrain);
                    }
    
                }
            }    
        }

    public static void setEqual(double[][] one, double[][] two)
    {
        for(int i = 0; i < one.length; i++)
        {
            for(int j = 0; j < one[0].length; j++)
            {
                one[i][j] = two[i][j];
            }
        }
    }

    public static void createNoise()
    {
        int len = (int) (Math.random()*2 + 3);
        for(int i = 0; i < len; i++)
        {
            int a = (int)(Math.random()*5);
            int b = (int)(Math.random()*7);
            double color = Math.random() * 0.20;
            if(gridArray[b][a] >= 0.5)
            {
                color = gridArray[b][a] - color;
            }
            else{
                color = gridArray[b][a] + color;
            }
            gridArray[b][a] = color;
            int colorInt = (int) (color * 255);
            StdDraw.setPenColor(colorInt, colorInt, colorInt);
            box(a,b, colorInt);
        }

    }
    public static void createNoise(int squares)
    {
        int len = squares;
        for(int i = 0; i < len; i++)
        {
            int a = (int)(Math.random()*5);
            int b = (int)(Math.random()*7);
            double color = Math.random() * 0.5 + 0.5;

            gridArray[b][a] = color;
            int colorInt = (int) (color * 255);
            StdDraw.setPenColor(colorInt, colorInt, colorInt);
            box(a,b, colorInt);
        }
        StdDraw.pause(2);

    }

    public static void createNoise(double[][] e)
    {
        for(int i = 0; i < 1; i++)
        {
            int a = (int)(Math.random()*5);
            int b = (int)(Math.random()*7);
            double color = Math.random() * 0.5 + 0.5;

            e[b][a] = color;
            int colorInt = (int) (color * 255);
            StdDraw.setPenColor(colorInt, colorInt, colorInt);
            box(a,b, colorInt);
        }

    }

    public static void box(int one, int two)
    {
        StdDraw.filledSquare(29.25 + (one+1)* 5.5,  44+29.25 - (two+1)* 5.5, 2.7);
        StdDraw.setPenColor(0,0,0);
    }

    public static void drawSquareSecond(int one, int two)
    {
        StdDraw.filledSquare(29.25 + (one+1)* 5.5 + 100,  44+29.25 - (two+1)* 5.5, 2.7);
        StdDraw.setPenColor(0,0,0);
    }

    public static void drawGridSecond(double[][] grid)
    {
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 0)
                {
                    continue;
                }
                if(grid[i][j] == 1)
                {
                    drawSquareSecond(j,i);
                }
                else
                {
                    int color = (int) (grid[i][j] * 255);
                    StdDraw.setPenColor(color, color, color);
                    drawSquareSecond(j,i);
                }

            }
        }
        StdDraw.show();
        StdDraw.pause(10);
    }



    public static void box(int one, int two, int color)
    {
        StdDraw.setPenColor(color,color,color);
        StdDraw.filledSquare(29.25 + (one+1)* 5.5,  44+29.25 - (two+1)* 5.5, 2.7);
        StdDraw.setPenColor(0,0,0);
    }

    public static void refresh()
    {
        StdDraw.clear();
        for(int i = 4; i <= 11; i++)
        {
            StdDraw.line(59.5, i* 5.5 +10 , 32, i*5.5 +10);
        }
        for(int i = 4; i <= 9; i++)
        {
            StdDraw.line(i*5.5 + 10, 32, i*5.5 + 10, 70.5);
        }

        for(int i = 4; i <= 11; i++)
        {
            StdDraw.line(59.5 + 100, i* 5.5 +10 , 32 + 100, i*5.5 +10);
        }
        for(int i = 4; i <= 9; i++)
        {
            StdDraw.line(i*5.5 + 10 + 100, 32, i*5.5 + 10 + 100, 70.5);
        }
        StdDraw.rectangle(95, 75, 16, 6);
        StdDraw.text(95,75, "Refresh");
        StdDraw.rectangle(95, 60, 16, 6);
        StdDraw.text(95,60, "Train");
        StdDraw.rectangle(95, 45, 16, 6);
        StdDraw.text(95,45, "Noise");
        StdDraw.rectangle(95, 30, 16, 6);
        StdDraw.text(95,30, "Guess");
        StdDraw.square(30 + 20,10,4);
        StdDraw.text(30+ 20,10, "0");
        StdDraw.square(30+ 20,10,4);
        StdDraw.text(40+ 20,10, "1");
        StdDraw.square(40+ 20,10,4);
        StdDraw.text(50+ 20,10, "2");
        StdDraw.square(50+ 20,10,4);
        StdDraw.text(60+ 20,10, "3");
        StdDraw.square(60+ 20,10,4);
        StdDraw.text(70+ 20,10, "4");
        StdDraw.square(70+ 20,10,4);
        StdDraw.text(80+ 20,10, "5");
        StdDraw.square(80+ 20,10,4);
        StdDraw.text(90+ 20,10, "6");
        StdDraw.square(90+ 20,10,4);
        StdDraw.text(100+ 20,10, "7");
        StdDraw.square(100+ 20,10,4);
        StdDraw.text(110+ 20,10,"8");
        StdDraw.square(110+ 20,10,4);
        StdDraw.text(120+ 20,10, "9");
        StdDraw.square(120+ 20,10,4);



    }
    public static void gridding(double[][] grid)
    {
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 0)
                {
                    continue;
                }
                if(grid[i][j] == 1)
                {
                    box(j,i);
                }
                else
                {
                    int color = (int) (grid[i][j] * 255);
                    StdDraw.setPenColor(color, color, color);
                    box(j,i);
                }

            }
        }
        StdDraw.show();
        StdDraw.pause(5);
    }

    public static double[] make1D(double[][] oldarr)
    {
        double[] newarr = new double[35];
        int var = 0;
        for(int i = 0 ; i < oldarr.length; i++)
        {
            for(int j = 0; j < oldarr[0].length; j++)
            {
                newarr[var++] = oldarr[i][j];
            }
        }
        return newarr;
    }

    public static void trainingMethod()
    {
        refresh();
        setEqual(gridArray,zeroAfterTrain);
        int j= 0;
        for(int i = 0; i < 30; i++)
        {
            refresh();
            gridding(gridArray);
            trainingSet[i] = make1D(gridArray);
            setEqual(gridArray, zeroAfterTrain);
            createNoise(j/3+3);
            j++;

        }
        refresh();
        setEqual(gridArray, one);
        j= 0;
        for(int i = 30; i < 60; i++)
        {
            refresh();
            gridding(gridArray);
            trainingSet[i] = make1D(gridArray);
            setEqual(gridArray,one);
            createNoise(j/3+3);
            j++;

        }
        setEqual(gridArray, two);
        refresh();
        j=0;
        for(int i = 60; i < 90; i++)
        {
            refresh();
            gridding(gridArray);
            trainingSet[i] = make1D(gridArray);
            setEqual(gridArray, two);

            createNoise(j/3+3);
            j++;
        }
        setEqual(gridArray, three);
        refresh();
        j = 0;
        for(int i = 90; i < 120; i++)
        {
            refresh();
            gridding(gridArray);
            trainingSet[i] = make1D(gridArray);
            setEqual(gridArray, three);

            createNoise(j/3+3);
            j++;
        }
        setEqual(gridArray, four);
        refresh();
        j=0;
        for(int i = 120; i < 150; i++)
        {
            refresh();
            gridding(gridArray);
            trainingSet[i] = make1D(gridArray);
            setEqual(gridArray, four);

            createNoise(j/3+3);
            j++;
        }
        setEqual(gridArray, five);
        refresh();
        j=0;
        for(int i = 150; i < 180; i++)
        {
            refresh();
            gridding(gridArray);
            trainingSet[i] = make1D(gridArray);
            setEqual(gridArray, five);

            createNoise(j/3+3);
            j++;
        }
        setEqual(gridArray, six);
        refresh();
        j=0;
        for(int i = 180; i < 210; i++)
        {
            refresh();
            gridding(gridArray);
            trainingSet[i] = make1D(gridArray);
            setEqual(gridArray, six);

            createNoise(j/3+3);
            j++;
        }
        setEqual(gridArray, seven);
        refresh();
        j=0;
        for(int i = 210; i < 240; i++)
        {
            refresh();
            gridding(gridArray);
            trainingSet[i] = make1D(gridArray);
            setEqual(gridArray, seven);

            createNoise(j/3+3);
            j++;
        }
        setEqual(gridArray, eight);
        refresh();
        j=0;
        for(int i = 240; i < 270; i++)
        {
            refresh();
            gridding(gridArray);
            trainingSet[i] = make1D(gridArray);
            setEqual(gridArray, eight);

            createNoise(j/3+3);
            j++;
        }
        setEqual(gridArray, nine);
        refresh();
        j=0;
        for(int i = 270; i < 300; i++)
        {
            refresh();
            gridding(gridArray);
            trainingSet[i] = make1D(gridArray);
            setEqual(gridArray, nine);

            createNoise(j/3+3);
            j++;
        }
        pereptronForZero.training(trainingSet,zeroOutputArray);
        pereptronForOne.training(trainingSet, oneOutputArray);
        pereptronForTwo.training(trainingSet, twoOutputArray);
        pereptronForThree.training(trainingSet, threeOutputArray);
        pereptronForFour.training(trainingSet, fourOutputArray);
        pereptronForFive.training(trainingSet, fiveOutputArray);
        pereptronForSix.training(trainingSet, sixOutputArray);
        pereptronForSeven.training(trainingSet, sevenOutputArray);
        pereptronForEight.training(trainingSet, eightOutputArray);
        pereptronForNine.training(trainingSet, nineOutputArray);

    }
}