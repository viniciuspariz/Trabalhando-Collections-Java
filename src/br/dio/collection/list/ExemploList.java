package br.dio.collection.list;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {

        //Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//        List lista = new ArrayList(); // antes do java 5
//        List<Double> notas = new ArrayList<>(); //Generics(jdk5)  - Diamond Operator (jdk 7)
//        ArrayList<Double> notas = new ArrayList<>(); // não é recomendado programar orientado para a implementação e sim para a interface
//        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));


/*        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // método limitado. Não é possivel adicionar ou excluir valores

        notas.add(10d);
        System.out.println(notas);
*/
/*

        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // Lista imutável. Não adiciona ou remove
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);

*/

        System.out.println("Crie uma lista e adicione as 7 notas: ");

        List<Double> notas = new ArrayList<>(); //Generics(jdk5)  - Diamond Operator (jdk 7)

        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);


        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("Adicione a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("Confira e a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");

        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();

        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());


        // Para você: Resolva esses exercícios utilizando os métodos de implementação LinkedList:

        System.out.println("Crie um lista chamada lista2 " +
                "e coloque todas os elementos da list ArrayList nessa nova lista: ");

        List<Double> lista2 = new LinkedList<>();

        lista2.add(7d);
        lista2.add(8.5);
        lista2.add(9.3);
        lista2.add(5.0);
        lista2.add(7.0);
        lista2.add(0.0);
        lista2.add(3.6);

        System.out.println(lista2.toString());

        System.out.println("Mostre a primeira nota da nova lista sem removê-la: " + lista2.get(0));

        lista2.remove(0);

        System.out.println("Mostre a primeira nota da nova lista removendo-a: " + lista2.get(0));

    }

}
