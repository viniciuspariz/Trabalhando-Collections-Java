package br.dio.collection.streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
/*
        // método completo

        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
*/
/*
        // usando o lambda
        numerosAleatorios.stream().forEach(s ->System.out.println(s));
*/

/*
        // usando o forEach do List
        numerosAleatorios.forEach(s -> System.out.println(s));

 */

        // transformando lambda em method reference
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");

        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
/*
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
*/
        System.out.println("Transforme esta lista em uma lista de números inteiros: ");
/*
        numerosAleatorios.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                });
*/
/*

        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);
*/

/*

        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
*/

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma List: ");
/*

        List<Integer> ListParesMaioresQueDois = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if (i % 2 == 0 && i > 2) return true;
                        return false;
                    }
                })
                .collect(Collectors.toList());
        System.out.println(ListParesMaioresQueDois);
*/
/*

        List<Integer> ListParesMaioresQueDois2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());
        System.out.println(ListParesMaioresQueDois2);
*/

        System.out.println("Mostre a média dos números: ");

/*
        numerosAleatorios.stream()
                .mapToInt(new ToIntFunction<String>() {
                    @Override
                    public int applyAsInt(String s) {
                        return Integer.parseInt(s);
                    }
                });
*/
/*
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
*/

        System.out.println("Remova os números ímpares: ");
/*

        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer%2!=0) return true;
                return false;
            }
        });
        System.out.println(numerosAleatoriosInteger);
*/

        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatoriosInteger.removeIf(integer -> integer % 2 != 0);
        System.out.println(numerosAleatoriosInteger);

        // Para você

        System.out.println("Ignore os 3 primeiros elementos da List e imprima o restante: ");

        System.out.println("Retirando os números repetidos da List, quantos números ficam? ");

        System.out.println("Mostre o menor valor da List: ");

        System.out.println("Mostre o maior valor da List: ");

        System.out.println("Pegue apenas os números impares e some: ");

        System.out.println("Mostre a lista na ordem numérica: ");

        System.out.println("Agrupe os números impares múltiplos de 3 e 5: ");
        //dica: collect(Collections.groupingBy(new Function())

    }

}
