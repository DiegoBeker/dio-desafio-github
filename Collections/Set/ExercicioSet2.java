import java.util.*;

public class ExercicioSet2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<LinguagemFavorita>();
        linguagens.add(new LinguagemFavorita("Java", 1991, "Eclipse"));
        linguagens.add(new LinguagemFavorita("C", 1972, "Code::Blocks"));
        linguagens.add(new LinguagemFavorita("JavaScript", 1995, "VScode"));
        System.out.println("Ordem de insercao:");
        System.out.println(linguagens.toString());

        System.out.println("Ordem natural(nome):");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
        System.out.println(linguagens2.toString());

        System.out.println("Ordem(ide) :");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorIde());
        linguagens3.addAll(linguagens);
        System.out.println(linguagens3.toString());

        System.out.println("Ordem(ano/nome) :");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorAnoNome());
        linguagens4.addAll(linguagens);
        System.out.println(linguagens4.toString());

        System.out.println("Ordem(nome/ano/ide) :");
        Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagens5.addAll(linguagens);
        System.out.println(linguagens5.toString());

    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return Objects.equals(nome, that.nome) && Objects.equals(anoDeCriacao, that.anoDeCriacao) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public String toString() {
        return "{" + "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' + "}";
    }

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public int compareTo(LinguagemFavorita o) {
        return this.getNome().compareTo(o.getNome());
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ide = o1.getIde().compareTo(o2.getIde());
        if(ide!=0) return ide;

        return o1.getNome().compareTo(o2.getNome());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ano = o1.getAnoDeCriacao().compareTo(o2.getAnoDeCriacao());
        if(ano!=0) return ano;
        return o1.getNome().compareTo(o2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        if(nome!=0) return nome;

        int ano = o1.getAnoDeCriacao().compareTo(o2.getAnoDeCriacao());
        if(ano!=0) return ano;

        return o1.getIde().compareTo(o2.getIde());
    }
}