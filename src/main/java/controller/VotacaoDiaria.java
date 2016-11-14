package controller;

import model.Voto;

import java.util.List;

/**
 * Created by kassianesmentz on 14/11/16.
 */

/**
 * A semana será de segunda a sexta.
 * Existirá um hashmap de 5 posicoes (uma para cada dia da semana) que armazenará os vencedores de cada dia.
 * A cada segunda feira o hashmap será zerado (se for segunda, zera o hashmap)
 * A cada votação será verificado se aquele restaurante ja nao foi escolhido como vencedor nos demais dias da semana. Se foi, informar e pedir que mude o voto
 * A cada votação verificar se o profissional já votou naquele dia (array list de votações). Caso ja tenha votado, informar que só pode votar uma vez por dia.
 * A votaçáo só pode ser feita até as 11:30. Após isso, mostrar o resultado da votação e impedir outros votos naquele dia.
 * Fazer a verificação de cada item através de TDD
 */
public class VotacaoDiaria {

    List<Voto> listaDeVotos;
}
