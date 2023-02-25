import javax.swing.JOptionPane;

public class Test{
  public static void main(String[] args){
    int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
    int input = n;
    int invertido = 0;
    int resto;
    while(n>0){
      resto = n % 10;
      invertido = invertido * 10 + resto;
      n /= 10;
    }
    System.out.println(invertido);
    if(input == invertido){
      JOptionPane.showMessageDialog(null, "Es capicua");
    }
    else{
      JOptionPane.showMessageDialog(null, "No es capicua");

    }

  }

}
