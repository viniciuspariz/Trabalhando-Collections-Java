package br.dio.collection.streamsAPI;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

import br.dio.collection.map.Contato;

import java.util.*;
import java.util.function.Function;

public class RefatoracaoOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");

        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
//        System.out.println(agenda);

        for (Map.Entry<Integer, Contato> contato : agenda.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome() + " - " + contato.getValue().getNumero());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
//        System.out.println(agenda);

        for (Map.Entry<Integer, Contato> contato : agenda1.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome() + " - " + contato.getValue().getNumero());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);

        for (Map.Entry<Integer, Contato> contato : agenda2.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome() + " - " + contato.getValue().getNumero());
        }

        System.out.println("--\tOrdem número telefone\t--");

//        Set<Map.Entry<Integer,Contato>> agenda3 = new TreeSet<>(new ComparatorNumeroTelefone());
/*
        //Utilizando o classe abstrata
        Set<Map.Entry<Integer,Contato>> agenda3 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
                return Integer.compare(c1.getValue().getNumero(),c2.getValue().getNumero());
            }
        });

        agenda3.addAll(agenda.entrySet());

        for (Map.Entry<Integer,Contato> contato :agenda3) {
            System.out.println(contato.getKey()+" - " + contato.getValue().getNome() + " - "+ contato.getValue().getNumero());
        }
*/
/*

        // Utilizando o método comparing
        Set<Map.Entry<Integer, Contato>> agenda3 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contato> cont) {
                return cont.getValue().getNumero();
            }
        }));
        agenda3.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> contato : agenda3) {
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome() + " - " + contato.getValue().getNumero());
        }
*/

        //Utilizando o Lambda

        Set<Map.Entry<Integer, Contato>> agenda3 = new TreeSet<>(Comparator.comparing(
                 cont -> cont.getValue().getNumero()));

        agenda3.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> contato : agenda3) {
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome() + " - " + contato.getValue().getNumero());
        }











//        System.out.println("--\tOrdem nome contato\t--");


    }


}
/*
class ComparatorNumeroTelefone implements Comparator<Map.Entry<Integer, Contato>>{

    @Override
    public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
        return Integer.compare(c1.getValue().getNumero(),c2.getValue().getNumero());
    }
*/

