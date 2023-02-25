import javax.swing.JOptionPane;

public class Test{
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        boolean primo = true;
        for(int i = 2; i<=n; i++){
            if(i != n && n%i == 0){
                System.out.println();
                primo = false;
            }
        }
        if(n != 1 && primo){
            JOptionPane.showMessageDialog(null, "El número " + n + " es primo");
        }
        else{
            JOptionPane.showMessageDialog(null, "El número " + n + " no es primo");

        }
    }
}
