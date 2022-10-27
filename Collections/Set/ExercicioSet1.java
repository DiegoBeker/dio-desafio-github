import java.util.*;

public class ExercicioSet1 {
    public static void main(String[] args) {
        Set<Cor> arcoIris = new HashSet<Cor>();
        arcoIris.add(new Cor("Vermelho"));
        arcoIris.add(new Cor("Laranja"));
        arcoIris.add(new Cor("Amarelo"));
        arcoIris.add(new Cor("Verde"));
        arcoIris.add(new Cor("Azul"));
        arcoIris.add(new Cor("Anil"));
        arcoIris.add(new Cor("Violeta"));

        System.out.println("Exiba todas as cores uma abaixo da outra");
        Iterator<Cor> iterator = arcoIris.iterator();
        while (iterator.hasNext()) {
            Cor cor = iterator.next();
                System.out.println(cor.getCor()+ " ");
        }

        System.out.println("Quantidade de cores: "+arcoIris.size());

        System.out.println("Exiba todas as cores em ordem alfabetica: ");
        Set<Cor> arcoIris2 = new TreeSet<>(arcoIris);
        System.out.println(arcoIris2.toString());

        List<Cor> arcoIris3 = new ArrayList<>(arcoIris);
        Collections.sort(arcoIris3, Collections.reverseOrder());
        System.out.println("Exiba as cores na ordem iversa da que foi informada:");
        System.out.println(arcoIris3.toString());

        System.out.println("Cores comecando com V: ");
        iterator = arcoIris2.iterator();
        while (iterator.hasNext()) {
            Cor cor = iterator.next();
            if(cor.getCor().charAt(0) == 'V')
                System.out.print(cor.getCor()+ "  ");
        }

        System.out.println();
        System.out.println("Removendo cores que nao comecam com V: ");
        iterator = arcoIris2.iterator();
        while (iterator.hasNext()) {
            Cor cor = iterator.next();
            if(cor.getCor().charAt(0) != 'V')
                iterator.remove();
        }
        System.out.println(arcoIris2.toString());

        System.out.println("Limpe o conjunto.");
        arcoIris2.clear();
        System.out.println("O conjunto está vazio? = "+ arcoIris2.isEmpty());

    }
}
class Cor implements Comparable<Cor> {
    private String cor;

    @Override
    public String toString() {
        return "'" + cor + '\'' ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cor cor1 = (Cor) o;
        return Objects.equals(cor, cor1.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Cor(String cor) {
        this.cor = cor;
    }

    @Override
    public int compareTo(Cor c) {
        int cor = this.getCor().compareTo(c.getCor());
        return cor;
    }
}


