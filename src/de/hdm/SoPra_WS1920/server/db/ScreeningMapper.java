package de.hdm.SP1920.server.db;

import java.util.*;

/**
 * 
 */
public class ScreeningMapper {

    /**
     * Default constructor
     */
    public ScreeningMapper() {
    }

    /**
     * 
     */
    public ScreeningMapper screeningMapper;

    /**
     * 
     */
    protected void ScreeningMapper() {
        // TODO implement here
    }

    /**
     * @return
     */
    public static ScreeningMapper screeningMapper() {
        // TODO implement here
        return null;
    }

    /**
     * @param screening 
     * @return
     */
    public Screening insertScreening(Screening screening) {
        // TODO implement here
        return null;
    }

    /**
     * @param screening 
     * @return
     */
    public Screening updateScreening(Screening screening) {
        // TODO implement here
        return null;
    }

    /**
     * @param screening 
     * @return
     */
    public void deleteScreening(Screening screening) {
        // TODO implement here
        return null;
    }

    /**
     * @param screeningID 
     * @return
     */
    public Screening findScreeningByID(int screeningID) {
        // TODO implement here
        return null;
    }

    /**
     * @param DateTime 
     * @return
     */
    public vector<Screening> findScreeningByScreeningDateTime(String DateTime) {
        // TODO implement here
        return null;
    }

    /**
     * @param DateTime 
     * @return
     */
    public void deleteScreeningDateTime(String DateTime) {
        // TODO implement here
        return null;
    }

    /**
     * @param movie 
     * @return
     */
    public vector<Screening> findScreeningByMovieFK(Movie movie) {
        // TODO implement here
        return null;
    }

    /**
     * @param movie 
     * @return
     */
    public void deleteScreeningByMovieFK(Movie movie) {
        // TODO implement here
        return null;
    }

    /**
     * @param cinema 
     * @return
     */
    public vector<Screening> findScreeningByCinemaFK(Cinema cinema) {
        // TODO implement here
        return null;
    }

    /**
     * @param cinema 
     * @return
     */
    public void deleteScreeningByCinemaFK(Cinema cinema) {
        // TODO implement here
        return null;
    }

    /**
     * @param person 
     * @return
     */
    public vector<Screening> findScreeningByPersonFK(Person person) {
        // TODO implement here
        return null;
    }

    /**
     * @param person 
     * @return
     */
    public void deleteScreeningByPersonFK(Person person) {
        // TODO implement here
        return null;
    }

}