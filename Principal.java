public class Principal {
    public static void main(String args[]) {
        System.out.println("Antes da Janela:" + Thread.activeCount());
        MultiplaThread janela = new MultiplaThread();
        janela.setVisible(true);
        System.out.println("Depois da Janela:" + Thread.activeCount());
    }
}
