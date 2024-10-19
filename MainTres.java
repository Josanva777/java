class Area {


    public double calcular(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }


    public double calcular(double base, double altura) {
        return base * altura;
    }

   
    public double calcular(double base, double altura, boolean esTriangulo) {
        return (base * altura) / 2;
    }
}

public class MainTres {
    public static void main(String[] args) {
       
        Area area = new Area();

      System.out.println("el area del circulo es: " + area.calcular(6));
      System.out.println("el area del rectangulo es: " + area.calcular(4,5));
      System.out.println("el area del triangulo es: " + area.calcular(7,8));
    
    }
}