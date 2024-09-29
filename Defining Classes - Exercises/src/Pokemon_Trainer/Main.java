package Pokemon_Trainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] trainers = scanner.nextLine().split("\\s+");

        LinkedHashSet <Pokemon> pokemonLinkedHashSet;
        LinkedHashMap<String, Trainer> trainerSet = new LinkedHashMap<>();

        Trainer trainer;
        Pokemon pokemon;
        while (!trainers[0].equals("Tournament")){
            if(trainerSet.containsKey(trainers[0])){
                trainer = trainerSet.get(trainers[0]);
                pokemon = new Pokemon(trainers[1], trainers[2], Integer.parseInt(trainers[3]));
                pokemonLinkedHashSet = trainer.getPokemons();
                pokemonLinkedHashSet.add(pokemon);

                trainer.setPokemons(pokemonLinkedHashSet);
                trainerSet.put(trainers[0], trainer);
            } else {
                pokemon = new Pokemon(trainers[1], trainers[2], Integer.parseInt(trainers[3]));
                Pokemon finalPokemon = pokemon;

                pokemonLinkedHashSet = new LinkedHashSet<>(){{add(finalPokemon);}};
                trainer = new Trainer(trainers[0], pokemonLinkedHashSet);
                trainerSet.put(trainers[0], trainer);
            }


            trainers = scanner.nextLine().split("\\s+");
        }

        LinkedHashSet <Trainer> trainerList = new LinkedHashSet<>();

        for(Map.Entry<String, Trainer> entry: trainerSet.entrySet()){
            Trainer value = entry.getValue();
            trainerList.add(value);
        }

        String element = scanner.nextLine();
        while (!element.equals("End")){

            String finalElement = element;

            trainerList.stream().forEach(trainer1 -> {
                boolean hasElementalPokemon = trainer1.getPokemons().stream()
                        .anyMatch(pokemon1 -> pokemon1.getElement().equals(finalElement));

                if (hasElementalPokemon) {

                    trainer1.setBadges(trainer1.getBadges() + 1);
                } else {
                    trainer1.getPokemons().forEach(pokemon1 -> pokemon1.setHealth(pokemon1.getHealth() - 10));
                    trainer1.getPokemons().removeIf(pokemon1 -> pokemon1.getHealth() <= 0);
                }
            });


            element = scanner.nextLine();
        }

        trainerList.stream()
                .sorted(Comparator.comparing(Trainer::getBadges).reversed())
                .forEach( trainer1 -> System.out.println(String.format("%s %d %d", trainer1.getName(), trainer1.getBadges(), trainer1.getPokemons().size())));

    }

}
