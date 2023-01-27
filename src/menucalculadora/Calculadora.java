
package menucalculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Calculadora {

    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0, num1, num2;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. sumar \n"
                        + "2. restar \n"
                        + "3. multiplicar \n"
                        + "4.dividir \n"
                        + "5.continuar \n"
                        + "6.salir ", "elija la opcion ",
                         JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingrese el numero 1", "ingresando numero", JOptionPane.QUESTION_MESSAGE));
                        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingrese el numero 2", "ingresando numero", JOptionPane.QUESTION_MESSAGE));
                        int sumar = num1 + num2;
                        JOptionPane.showMessageDialog(null,"La suma es: "+ sumar);
                        break;
                    case 2:
                        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingrese el numero 1", "ingresando numero", JOptionPane.QUESTION_MESSAGE));
                        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingrese el numero 2", "ingresando numero", JOptionPane.QUESTION_MESSAGE));
                        int restar = num1 - num2;
                        JOptionPane.showMessageDialog(null,"La resta es: "+ restar);

                        break;
                    case 3:
                        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingrese el numero 1", "ingresando numero", JOptionPane.QUESTION_MESSAGE));
                        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingrese el numero 2", "ingresando numero", JOptionPane.QUESTION_MESSAGE));
                        int multiplicar = num1 * num2;
                        JOptionPane.showMessageDialog(null,"La Multiplicación es: "+ multiplicar);

                        break;
                    case 4:
                        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingrese el numero 1", "ingresando numero", JOptionPane.QUESTION_MESSAGE));
                        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingrese el numero 2", "ingresando numero", JOptionPane.QUESTION_MESSAGE));
                        int dividir = num1 / num2;
                        JOptionPane.showMessageDialog(null,"La división es: "+ dividir);
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "continuar",
                                "elija la opcion", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "aplicacion finalizada",
                                "fin", JOptionPane.INFORMATION_MESSAGE);

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion incorrecta",
                                "¡cuidado!", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "error" + n.getMessage());
            }

        } while (opcion != 6);

    }

}
