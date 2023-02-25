package ejecutable;

import javax.swing.JOptionPane;

public class Test{
    public static void main(String[] args) {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número para calcular su factorial:"));
        double fact = 1;
        if(n > 0){
            for(int i = 1; i<=n; i++){
                fact *= i;
            }
            JOptionPane.showMessageDialog(null, "El factorial de " + n + "es " + fact);
        }
        else{
            JOptionPane.showMessageDialog(null, "No se pueden introducir números negativos");
        }  
    }


}