import javax.swing.*;

public class TalLista {
    public static void main (String[] args){

        int antal = Integer.parseInt(JOptionPane.showInputDialog("Hur manga tal? "));
        int[] lista = new int[antal];
        int summa = 0;
        int medel;
        int storst = 0;
        int minst = 0;
        String s = "Lista: ";

        for (int i = 0; i < antal; i++){
            lista[i] = Integer.parseInt(JOptionPane.showInputDialog("Tal: "));
            summa += lista[i];
            s = s + lista[i] + " ";
            if (i == 0){
                minst = lista[i];
            }
            else if (lista[i] > storst){
                storst = lista[i];
            }
            else if (lista[i] < minst){
                minst = lista[i];
            }
        }

        medel = summa / antal;

        System.out.print(s);
        System.out.print("\nMedel: " + medel);
        System.out.print("\nStorst: " + storst);
        System.out.print("\nMinst: " + minst);

    }
}
