package Programa;
import java.util.HashMap;

public class calculos {

    public static double getMediana(double[] v) {
        int meio = v.length / 2;
        if (v.length % 2 == 1) {
            return v[meio];
        } else {
            return (v[meio - 1] + v[meio]) / 2;
        }
    }

    public static double getMedia(double[] v) {
        double soma = 0;

        for (int i = 0; i < v.length; i++) {
            soma = soma + v[i];
        }
        double media = soma / v.length;
        return media;
    }

    public static double getModa(double v[]) {
        HashMap map = new HashMap();
        Integer i;
        Double moda = 0.0;
        Integer numAtual, numMaior = 0;
        for (int count = 0; count < v.length; count++) {
            i = (Integer) map.get(new Double(v[count]));
            if (i == null) {
                map.put(new Double(v[count]), new Integer(1));
            } else {
                map.put(new Double(v[count]), new Integer(i.intValue() + 1));
                numAtual = i.intValue() + 1;
                if (numAtual > numMaior) {
                    numMaior = numAtual;
                    moda = new Double(v[count]);
                }
                
            }
            
        }
        return moda;
    }
    
    public static double getVariancia (double v[]){
        double media = getMedia(v);
        double somaNumeros = 0;
        
        for (int i = 0; i < v.length; i++) {
            somaNumeros = somaNumeros + Math.pow(media - v[i], 2);
        }
        double variancia = somaNumeros / (v.length-1);
        
        return variancia;
    }
    
    public static double getDesvioPadrao (double v[]){
        double variancia = getVariancia(v);
        double desvioPadrao = Math.sqrt(variancia);
        
        return desvioPadrao;
    }
    
    public static double getCoeficienteVariacao(double v[]){
        double coef = (getDesvioPadrao(v)/getMedia(v))*100;
        return coef;
    }
    
}
