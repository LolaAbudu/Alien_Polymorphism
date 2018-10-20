package org.pursuit;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Monster monster = new Monster("people", "anywhere", "anything");
        monster.whoAmI();

        Vampire vampire = new Vampire("idk", "darkness", "teeth");
        vampire.whoAmI();
        vampire.getWeakness();

        Werewolf werewolf = new Werewolf("otherPeople", "forest", "claws");
        werewolf.whoAmI();
        werewolf.getTransformationTime();

        LagoonMonster lagoonMonster = new LagoonMonster("fish", "river", "scale");
        lagoonMonster.whoAmI();


        HashMap<String, Monster > monsterMap = new HashMap();
        monsterMap.put("Monster", monster);
        monsterMap.put("Werewolf", werewolf);
        monsterMap.put("Vampire", vampire);
        monsterMap.put("LagoonMonster", lagoonMonster);

        for(String newMonster : monsterMap.keySet()){
            monsterMap.get(newMonster).whoAmI();
        }

















//        Monster monster = new Monster("people", "anywhere", "anything");
//        //monster.whoAmI();
//
//        Werewolf werewolf = new Werewolf("humans", "woods", "claws");
//
//        LagoonMonster lagoonMonster = new LagoonMonster("Fish", "Lagoon", "Feet");
//        //lagoonMonster.whoAmI();
//
//        Vampire vampire = new Vampire("blood", "caves", "teeth");
//
//        HashMap<String, Monster> myMonster = new HashMap<>();
//        myMonster.put(monster.getClass().getSimpleName(), monster);
//        myMonster.put(vampire.getClass().getSimpleName(), vampire);
//        myMonster.put("Werewolf", werewolf);
//        myMonster.put("LagoonMonster", lagoonMonster);
//
//        for(String allMonsters : myMonster.keySet()){
//            myMonster.get(allMonsters).whoAmI();
//        }

//        AlienXenomorph alienXenomorph = new AlienXenomorph();
//
//        HumanXenomorph humanXenomorph = new HumanXenomorph();
//
//        DogXenomorph dogXenomorph = new DogXenomorph();
//
//        PredatorXenomorph predatorXenomorph = new PredatorXenomorph();

//        alienXenomorph.iAmAXenomorph();
//        alienXenomorph.acidBlood();
//
//        humanXenomorph.iAmAXenomorph();
//        humanXenomorph.acidBlood();
//        humanXenomorph.walkLikeAHuman();
//
//        dogXenomorph.iAmAXenomorph();
//        dogXenomorph.acidBlood();
//        dogXenomorph.walkLikeADog();
//
//        predatorXenomorph.iAmAXenomorph();
//        predatorXenomorph.acidBlood();
//        predatorXenomorph.biteLikeAPredator();

//        HashMap<String, AlienXenomorph> alienMap= new HashMap<>();
//        String alienXenomorphString = alienXenomorph.getClass().getSimpleName();
//
//        alienMap.put(alienXenomorphString, alienXenomorph);
//        alienMap.put("HumanXenomoprph", humanXenomorph);
//        alienMap.put("DogXenomorph", dogXenomorph);
//        alienMap.put("PredatorXenomorph", predatorXenomorph);

//        for(String s : alienMap.keySet()){  //for each String inside the keySet of
//                                        // alienMap, get the key, give me back the
//                                        //value and then run iAmAXenomorph Method to that key
//                                        //it has to be String in the for each loop
//                                        //because the key inside alienMap are Strings
//            alienMap.get(s).iAmAXenomorph();  //this runs the method .iAmAXenomorph on every key that you get
//            if(alienMap.get(s) instanceof HumanXenomorph){
//                ((HumanXenomorph)alienMap.get(s)).walkLikeAHuman();  //this is down casting
//            }
//        }


//        HashSet<AlienXenomorph> alienSet = new HashSet<>();
//        alienSet.add(alienXenomorph);
//        alienSet.add(predatorXenomorph);
//        alienSet.add(dogXenomorph);
//        alienSet.add(humanXenomorph);
//
//        for (AlienXenomorph a : alienSet) {
//            a.iAmAXenomorph();  //adds "I am a Xenomorph, I have a creepy inside murder jaw!" 4 times
//        }
    }
}
