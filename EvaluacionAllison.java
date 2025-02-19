/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacion.pkg1.allison.arias.castro;
import javax.swing.JOptionPane;
/**
 *
 * @author Allison
 */
public class Evaluacion1AllisonAriasCastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String empleadoespecifico = ""; // Declaramos la variable del nombre
        double salarioMensual = 0; //Salario bruto
        double salarioMensualDeduccionesSEM= 0; //Salario neto
        double salarioMensualDeduccionesIVM = 0; //Salario neto
        String variableTemporal="";
        
        empleadoespecifico= JOptionPane.showInputDialog("Digite su nombre");
        variableTemporal= JOptionPane.showInputDialog("Digite su salario");
        
      
        salarioMensual=Double.parseDouble(variableTemporal);
        
        salarioMensualDeduccionesSEM=salarioMensual*0.0925;
        salarioMensualDeduccionesIVM=salarioMensual*0.0508;
        
        JOptionPane.showMessageDialog(null, "El nombre es " + empleadoespecifico + "\n" +
                                            "El salario mensual (salario bruto)es "+ salarioMensual + "\n" +
                                            "El salario mensual con deducciones SEM (salario neto)es "+ salarioMensualDeduccionesSEM + "\n" +
                                            "El salario mensual con deducciones IVM (salario neto)es "+ salarioMensualDeduccionesIVM + "\n");

        
        
    }
    
}
