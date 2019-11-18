
import java.util.*;

/**
 * 
 */
public interface SurveyManagementAsync {

    /**
     * @param id 
     * @param firstName 
     * @param lastName 
     * @param email 
     * @param isAdmin 
     * @param callback 
     * @return
     */
    public Void createPerson(int id, String firstName, String lastName, String email, int isAdmin, AsyncCallback<Person> callback);

    /**
     * @param id 
     * @param name 
     * @param callback 
     * @return
     */
    public Void createGroup(int id, String name, AsyncCallback<Group> callback);

    /**
     * @param id 
     * @param startDate 
     * @param endDate 
     * @param callback 
     * @return
     */
    public Void createSurvey(int id, DateTime startDate, DateTime endDate, AsyncCallback<Survey> callback);

    /**
     * @param id 
     * @param votingWeight 
     * @param callback 
     * @return
     */
    public Void createVote(int id, int votingWeight, AsyncCallback<Vote> callback);

    /**
     * @param id 
     * @param callback 
     * @return
     */
    public Void createSurveyEntry(int id, AsyncCallback <SurveyEntry callback);

    /**
     * @param person 
     * @param callback 
     * @return
     */
    public Void updatePerson(Person person, AsyncCallback <Person> callback);

    /**
     * @param group 
     * @param callback 
     * @return
     */
    public Void updateGroup(Group group, AsyncCallback <Group> callback);

    /**
     * @param survey 
     * @param callback 
     * @return
     */
    public Void updateSurvey(Survey survey, AsyncCallback <Survey> callback);

    /**
     * @param vote 
     * @param callback 
     * @return
     */
    public Void updateVote(Vote vote, AsyncCallback <Vote> callback);

    /**
     * @param surveyentry 
     * @param callback 
     * @return
     */
    public Void updateSurveyEntry(SurveyEntry surveyentry, AsyncCallback<SurveyEntry> callback);

    /**
     * @param person 
     * @param callback 
     * @return
     */
    public Void deletePerson(Person person, AsyncCallback <Person> callback);

    /**
     * @param group 
     * @param callback 
     * @return
     */
    public Void deleteGroup(Group group, AsyncCallback <Group> callback);

    /**
     * @param survey 
     * @param callback 
     * @return
     */
    public Void deleteSurvey(Survey survey, AsyncCallback<Survey> callback);

    /**
     * @param vote 
     * @param callback 
     * @return
     */
    public Void deleteVote(Vote vote, AsyncCallback <Vote> callback);

    /**
     * @param surveyentry 
     * @param callback 
     * @return
     */
    public Void deleteSurveyEntry(SurveyEntry surveyentry, AsyncCallback <SurveyEntry> callback);

    /**
     * @param firstName 
     * @param callback 
     * @return
     */
    public Void getPersonByFirstname(String firstName, AsyncCallback <Vector <Person>> callback);

    /**
     * @param lastName 
     * @param callback 
     * @return
     */
    public Void getPersonByLastname(String lastName, AsyncCallback <Vector <Person>> callback);

    /**
     * @param email 
     * @param callback 
     * @return
     */
    public Void getPersonByEmail(String email, AsyncCallback <Vector <Person>> callback);

    /**
     * @param name 
     * @param callback 
     * @return
     */
    public Void getGroupByName(String name, AsyncCallback <Vector <Group>> callback);

    /**
     * @param startDate 
     * @param callback 
     * @return
     */
    public Void getSurveyByStartDate(DateTime startDate, AsyncCallback <Vector<Survey>> callback);

    /**
     * @param endDate 
     * @param callback 
     * @return
     */
    public Void getSurveyByEndDate(DateTime endDate, AsyncCallback <Vector<Survey>> callback);

    /**
     * @param votingWeight 
     * @param callback 
     * @return
     */
    public Void getVoteByVotingWeight(int votingWeight, AsyncCallBack<Vote> callback);

    /**
     * @param id 
     * @param callback 
     * @return
     */
    public Void getPersonById(int id, AsyncCallback<Person> callback);

    /**
     * @param id 
     * @param callback 
     * @return
     */
    public Void getGroupById(int id, AsyncCallback<Group> callback);

    /**
     * @param id 
     * @param callback 
     * @return
     */
    public Void getSurveyById(Int id, AsyncCallback<Survey> callback);

    /**
     * @param id 
     * @param callback 
     * @return
     */
    public Void getVoteById(int id, AsyncCallback<Vote> callback);

    /**
     * @param id 
     * @param callback 
     * @return
     */
    public Void getSurveyEntryId(int id, AsyncCallback<SurveyEntry> callback);

    /**
     * @param personFK 
     * @param callback 
     * @return
     */
    public Void getGroupByPersonFK(int personFK, AsyncCallback<Vector<Group>> callback);

    /**
     * @param groupFK 
     * @param callback 
     * @return
     */
    public Void getSurveyByGroupFK(int groupFK, AsyncCallback<Vector<Survey>> callback);

    /**
     * @param personFK 
     * @param callback 
     * @return
     */
    public Void getSurveyByPersonFK(int personFK, AsyncCallback<Vector<Survey>> callback);

    /**
     * @param personFK 
     * @param callback 
     * @return
     */
    public Void getVoteByPersonFK(int personFK, AsyncCallback<Vector<Vote>> callback);

    /**
     * @param surveyEntryFK 
     * @param callback 
     * @return
     */
    public Void getVoteBySurveyEntryFK(int surveyEntryFK, AsyncCallback<Vector<SurveyEntry>> callback);

    /**
     * @param surveyFK 
     * @param callback 
     * @return
     */
    public Void getSurveyEntryBySurveyFK(int surveyFK, AsyncCallback<Vector<SurveyEntry>> callback);

}