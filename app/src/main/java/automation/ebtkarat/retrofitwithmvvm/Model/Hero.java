package automation.ebtkarat.retrofitwithmvvm.Model;

/**
 * Created by Antnna on 08-Feb-19.
 */

public class Hero {
    private String name,realName,team,firstappeance,createdby,publisher,imageURL,bio;

    public Hero(String name, String realName, String team, String firstappeance, String createdby, String publisher, String imageURL, String bio) {
        this.name = name;
        this.realName = realName;
        this.team = team;
        this.firstappeance = firstappeance;
        this.createdby = createdby;
        this.publisher = publisher;
        this.imageURL = imageURL;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getFirstappeance() {
        return firstappeance;
    }

    public void setFirstappeance(String firstappeance) {
        this.firstappeance = firstappeance;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
