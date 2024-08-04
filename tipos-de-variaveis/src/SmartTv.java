public class SmartTv {
    boolean ligada =false;
    static int canal = 1;
    int volume = 25;

public static void mudarCanal(int novoCanal) {
    canal = novoCanal;
}
    public void aumentarVolume(){
        //volume = volume +1;
        volume++;
    }

    public void subirCanal(){
        //volume = volume +1;
        canal++;
    }
    public void diminuirCanal(){
        //volume = volume +1;
        canal--;
    }


    
    public void diminuirVolume(){
        //volume = volume +1;
        volume--;
    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }
}
