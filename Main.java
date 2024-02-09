import java.util.Arrays;

public class Main {
     public static void main(String[] args) {

         Rectangulo[] rectangulos = {
                 new Rectangulo(2, 3),
                 new Rectangulo(4, 5),
                 new Rectangulo(1, 8),
                 new Rectangulo(3, 6),
                 new Rectangulo(2, 2),
                 new Rectangulo(5, 4),
                 new Rectangulo(7, 1),
                 new Rectangulo(6, 3),
                 new Rectangulo(9, 2),
                 new Rectangulo(8, 4)
         };

         
         Arrays.sort(rectangulos);


         System.out.println("Rectángulos ordenados por área:");
         for (Rectangulo rectangulo : rectangulos) {
             System.out.println(rectangulo);
         }
     }
 }
