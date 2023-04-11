package aula09;
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Method

    
    public String detalhes() {
        return "Livro: " + titulo + "\nAutor = " 
                + autor + "\nTotal de Páginas = " + totPaginas 
                + ", Página Atual = " + pagAtual + "\nAberto = " 
                + aberto + "\nLeitor = " + leitor.getNome()
                + "\nIdade = " + leitor.getIdade()
                + ", Sexo = " + leitor.getSexo() + "\n";
                
    }
    
 
    //Constructor Methods

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    //Getter and Setter Methods

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setAutor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //Abstract Methods
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas){
            System.out.println("Impossível abrir nessa página, o livro contém " + this.totPaginas + " páginas." );           
        }else{
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++; //this.pagAtual = this.pagAtual + 1
    }

    @Override
    public void voltarPag() {
        this.pagAtual--; //this.pagAtual = this.pagAtual - 1
    }
    
}
