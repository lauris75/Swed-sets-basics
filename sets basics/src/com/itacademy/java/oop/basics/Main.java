package com.itacademy.java.oop.basics;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Game fourthGame = new Game("MineCraft", Genre.Sandbox, 20.0, 238000000);
        Game firstGame = new Game("GTA5", Genre.ActionAdventure, 15.0, 160000000);
        Game thirdGame = new Game("Tetris", Genre.Platformer, 0.0, 100000000);
        Game secondGame = new Game("PUBG", Genre.FirstPersonShooters, 20.0, 82900000);
	    List<Game> gameList = new ArrayList<>();
        gameList.add(firstGame);
        gameList.add(secondGame);
        gameList.add(thirdGame);
        gameList.add(fourthGame);
        printList(gameList);
        //List<Game> sortedGameList = gameList.stream().sorted(Comparator.comparing(Game::getCopiesSold).reversed()).collect(Collectors.toList());
        //printList(sortedGameList);
        Game maxByCopiesSold = gameList.stream().max(Comparator.comparing(Game::getCopiesSold)).orElseThrow(NoSuchElementException::new);
        System.out.println(maxByCopiesSold.toString());
    }

    public static void printList(List<Game> listOfGames){
        for(int i = 0; i < listOfGames.size(); i++){
            System.out.println(listOfGames.get(i).toString());
        }
        System.out.println("");
    }
}
