class vehiculo{
    public void acelerar(){
        System.out.println("el vehiculo esta acelerando");
    }
}

class Auto extends vehiculo{
    public void acelerar(){
        System.out.println("el vehiculo esta acelerando a 100 km/h");
    }
}

class Motocicleta extends vehiculo{
    public void acelerar(){
        System.out.println("la moto esta acelerando a 250km/h");
    }
}

public class Main{
    public static void main(String[] args) {
        vehiculo miVehiculo;

        miVehiculo = new Auto();
        miVehiculo.acelerar();

        miVehiculo = new Motocicleta();
        miVehiculo.acelerar(); 
    }
}

