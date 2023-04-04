public class Principal {
    public static void main(String[] args) {
        Filme f = new Filme();

        f.setCodigo(13);
        f.setNome("Jonh Wick 4");
        f.setValor(24.50);

        f.setDisponivel(true);
        if (f.isDisponivel()) {
            System.out.println("O codigo do filme é "+f.getCodigo());
            System.out.println("O nome do filme é "+f.getNome());
            System.out.println("E o valor do filme é "+f.getValor()+" Merréis");
        } else {

            System.out.println("Filme não disponivel");
        }
    }
}
