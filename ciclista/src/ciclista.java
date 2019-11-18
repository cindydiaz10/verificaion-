
import javax.swing.JOptionPane;


public class ciclista {

       static int departamento []= new int [5];
       static int hidratacion []= new int [5];
       static int promedio []= new int [9];
       static int acum =0;
       
      public static void ciclista (){
       
          for (int i = 0; i < 9; i++) {
             for (int a = 0; a < 5; a++) {
               
                 for (int c = 0; c < 5; c++) {
                    departamento[c] = Integer.parseInt(JOptionPane.showInputDialog("Digite la distacia recorrida en la vuelta " + (c+1)));
                    acum =acum + departamento [c];
                 }
                 
                 hidratacion[a] = Integer.parseInt(JOptionPane.showInputDialog("Litros de Hidratacion" + (a+1)));
                 
                 promedio[i] = (acum/departamento.length);
                 JOptionPane.showMessageDialog(null,"PROMEDIO NUMERO "+(i+1)+": "+ promedio[i]);
                 }
                acum = 0;
          }
          
          
          JOptionPane.showMessageDialog(null,"PROMEDIOS DE TODAS  LAS CARRERAS" +
                                               "\nPromedio 1" + promedio[0]+
                                               "\nPromedio 2" + promedio[1]+
                                               "\nPromedio 3" + promedio[2]+
                                               "\nPromedio 4" + promedio[3]+
                                               "\nPromedio 5" + promedio[4]+
                                               "\nPromedio 6" + promedio[5]+
                                               "\nPromedio 7" + promedio[6]+
                                               "\nPromedio 8" + promedio[7]+
                                               "\nPromedio 9" + promedio[8]);
       }
    public static void main(String[] args) {
        // TODO code application logic here
        ciclista();
    }
    
}
