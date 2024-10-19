class animal{
    public void hacerSonido(){
        System.out.println("el animal hace un sonido");
        }
    }

        class Perro extends  animal {
        public void hacerSonido(){
        System.out.println("el perro ladra");
        }
    }

    class gato extends  animal {
        public void hacerSonido(){
        System.out.println("el gato maulla");
        }
    }

    class vaca extends  animal {
        public void hacerSonido(){
        System.out.println("ela vaca muge");
        }
    }

    public class MainUno {

        public static void main(String[] args) {
            animal animalUno;

            animalUno = new Perro();
            animalUno.hacerSonido();

            animalUno = new gato();
            animalUno.hacerSonido();

            animalUno = new vaca();
            animalUno.hacerSonido();
        }

}


