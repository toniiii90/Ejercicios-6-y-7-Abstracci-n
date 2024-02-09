import java.util.Arrays;

interface Redimensionable {
     void redimensionar(int x);
}

 class Rectangulo implements Redimensionable, Comparable<Rectangulo> {
     private int ancho;
     private int altura;

     public Rectangulo(int ancho, int altura) {
         this.ancho = ancho;
         this.altura = altura;
     }

     public int getAncho() {
         return ancho;
     }

     public int getAltura() {
         return altura;
     }

     public void setAncho(int ancho) {
         this.ancho = ancho;
     }

     public void setAltura(int altura) {
         this.altura = altura;
     }

     @Override
     public void redimensionar(int x) {
         this.ancho *= x;
         this.altura *= x;
     }

     public int calcularArea() {
         return ancho * altura;
     }

     public int calcularPerimetro() {
         return 2 * (ancho + altura);
     }

     @Override
     public int compareTo(Rectangulo otroRectangulo) {
         return Integer.compare(this.calcularArea(), otroRectangulo.calcularArea());
     }

     @Override
     public String toString() {
         return "Rectangulo [Ancho=" + ancho + ", Altura=" + altura + "]";
     }
 }

