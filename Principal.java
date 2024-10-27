public class Principal {
    public static void main(String[] args) {
        
        PinoRedondoConcreto pinoRedondo = new PinoRedondoConcreto(5);
        BuracoRedondo buracoRedondo = new BuracoRedondo(5);
        System.out.println("Pino redondo encaixa? " + buracoRedondo.encaixa(pinoRedondo)); // true

        PinoQuadrado pinoQuadrado = new PinoQuadrado(10);
        AdaptadorPinoQuadrado adaptadorPinoQuadrado = new AdaptadorPinoQuadrado(pinoQuadrado);
        System.out.println("Pino quadrado adaptado encaixa? " + buracoRedondo.encaixa(adaptadorPinoQuadrado)); // true ou false dependendo do tamanho
    }
}

