public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.print("Volume atual: " + smartTv.volume);

        System.out.print("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.print("Canal atual: " + smartTv.canal);

        smartTv.ligar();
        System.out.print("Novo status -> TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.print("Novo status -> TV ligada ? " + smartTv.ligada);
    }
}
