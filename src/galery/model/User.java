package galery.model;

/**
 * Created by masaoud on 17/11/2017.
 */
/**
 * Created by masaoud on 17/11/2017.
 */
public class User {
    private int id;
    private String name;
    private String family;
    private String userName;
    private String password;
    private int statId;
    private  int question1Id;
    private  int question2Id;
    private String answer1;
    private String answer2;

    public User() {
    }

    public User(int id, String name, String family, String userName, String password, int statId, int question1Id, int question2Id, String answer1, String answer2) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.userName = userName;
        this.password = password;
        this.statId = statId;
        this.question1Id = question1Id;
        this.question2Id = question2Id;
        this.answer1 = answer1;
        this.answer2 = answer2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatId() {
        return statId;
    }

    public void setStatId(int statId) {
        this.statId = statId;
    }

    public int getQuestion1Id() {
        return question1Id;
    }

    public void setQuestion1Id(int question1Id) {
        this.question1Id = question1Id;
    }

    public int getQuestion2Id() {
        return question2Id;
    }

    public void setQuestion2Id(int question2Id) {
        this.question2Id = question2Id;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }
}
