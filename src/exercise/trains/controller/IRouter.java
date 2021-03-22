/**
 * Interface for Router Service.
 */
package exercise.trains.controller;

import exercise.trains.exception.InvalidExceptions;

public interface IRouter {
    public String calculateDistanceBetweenTowns(String towns) throws InvalidExceptions;
}
