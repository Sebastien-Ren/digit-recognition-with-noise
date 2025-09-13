import java.util.Arrays;
public class Perceptron{
    double []xarray;
    double []warray;
    double rate;
    double maxError;
    int maxIterations;
    
    public Perceptron(int n, double learning_rate, double error, int maximum){
        xarray = new double[n+1];
        xarray[0] = -1;
        rate = learning_rate;
        maxError = error;
        maxIterations = maximum;
        
        warray = new double[n+1];
        for(int i = 0; i < warray.length; i++){
            warray[i] = Math.random() * 4 - 2;
        }
    }
    public int training(double[][] trainingin, double[] trainingtar){
        double e = getExpected(trainingin, trainingtar);
        int count = 0;
        while(e != 0 && count <= maxIterations){
            for(int i = 0; i < trainingin.length; i++){
                int o = getOutput(trainingin[i], trainingtar[i]);
                int t = (int)trainingtar[i];
                
                if(o != t){
                    warray[0] = warray[0] + rate*(t-o)*(-1);
                    for(int j = 1; j < warray.length; j++){
                        warray[j] = warray[j] + rate*(t-o)*trainingin[i][j-1];
                    }
                }
            }
            
            count++;
            e = getExpected(trainingin, trainingtar);
            
        }
        if(count >= maxIterations){
            javax.swing.JOptionPane.showMessageDialog(null, "There is no best fit line for this set of data");
            return 0;
        }
        return 1;
    }
    public int getExpected(double[][] trainingin, double[] trainingtar){
        int e = 0;
        for(int i = 0; i < trainingin.length; i++){
            int o = getOutput(trainingin[i], 1);
            int t = (int)trainingtar[i];   
            if(o != t){
                e++;
            }
            
        }
        return e;
    }
    public int getOutput(double[] first, double trainingtar){
        double a = -1*warray[0];
        for(int i = 1; i < warray.length; i++){
            a += first[i-1]*warray[i];
        }
        if(a <= 0){
            return 0;
        }
        return 1;
    }
}