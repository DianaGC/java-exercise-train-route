package exercise.trains.service;

import exercise.trains.exception.InvalidExceptions;
import exercise.trains.infraestructure.Errors;

public class Read {
    public static String[] validateRoute(String towns) throws IllegalArgumentException, InvalidExceptions {
        String[] townsList = towns.split("\\s+|-\\s*");
        if( townsList.length > 1){
            for( String town: townsList){
                if(town.length() != 1 && !isLetter(town.charAt(0))){
                    throw new InvalidExceptions(Errors.ERROR_001);
                }
            }
        }else{
            throw new InvalidExceptions(Errors.ERROR_001);
        }

        return  townsList;
    }

    private static boolean isLetter(char letter) throws InvalidExceptions {
        if( Character.isLetter(letter)) return true;
        throw new InvalidExceptions(Errors.ERROR_002);
    }

}
