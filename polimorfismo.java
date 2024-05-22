class Carro { // Cria uma classe pública "Carro"
    public void MaximumSpeed(){ 
        System.out.println("The Maximum Speed this car is"); //  utilizado para aparecer o que está dentro do "()" na tela
    }
}
class BMWM5 extends Carro { // 
public void MaximumSpeed(){   
    System.out.println("BMW M5 top speed is 350km");    
    
    }
    }
class MercedesGT63 extends Carro{
public void MaximumSpeed(){   
    System.out.println("Mercedes GT63 top speed is 315km");
    }   
}
class AudiR8 extends Carro{
public void MaximumSpeed(){
    System.out.println("Audi R8 top speed is 320km");
    }
}

class Main {
    public static void main(String[] args) {
    Carro myCarro = new Carro();        
    Carro myBMWM5 = new BMWM5();    
    Carro myMercedesGT63 = new MercedesGT63();
    Carro myAudiR8 = new AudiR8();
    myCarro.MaximumSpeed();
    myBMWM5.MaximumSpeed();
    myMercedesGT63.MaximumSpeed();
    myAudiR8.MaximumSpeed();
    }
}












