public class Aula12_Contrutores {
    public static void main(String[] args) {
        VideoGame console = new VideoGame("PlayStation 5", 4000.0);
        System.out.println("Console cadastrado! " + console.nome + "\nPreço: "+ console.preco);
    }
}
