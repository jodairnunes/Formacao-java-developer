public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        
        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);


        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Volume Atual: " + smartTv.volume);

        smartTv.mudarCanal(10);
        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);  
        
        smartTv.aumentarCanal();
        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);  

        smartTv.diminuirCanal();
        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);  

    }
}
