package org.bridgelabz;
/* Author:Renu
 * Date:18/11/21 Time:9:00AM
 * Statement:Program for the add hotel reservation system
 */
//creating a class name Hotel
public class Hotel {
    private String name;                //creating a attribute
    private int regularWeekdayRate;
    private int regularWeekendRate;
    private int rewardsWeekdayRate;
    private int rewardsWeekendRate;
    private int rating;
    //Creating a constructor

    public Hotel(String name, int regularWeekdayRate, int regularWeekendRate, int rewardsWeekdayRate,
                 int rewardsWeekendRate, int rating) {
        this.name = name;
        this.regularWeekdayRate = regularWeekdayRate;
        this.regularWeekendRate = regularWeekendRate;
        this.rewardsWeekdayRate = rewardsWeekdayRate;
        this.rewardsWeekendRate = rewardsWeekendRate;
        this.rating = rating;
    }
    //Getter method

    public String getName() {
        return name;
    }

    //Setter method
    public void setName(String name) {
        this.name = name;
    }

    public int getRegularWeekdayRate() {
        return regularWeekdayRate;
    }

    public void setRegularWeekdayRate(int regularWeekdayRate) {
        this.regularWeekdayRate = regularWeekdayRate;
    }

    //Getter and setter method
    public int getRegularWeekendRate() {
        return regularWeekendRate;
    }

    public void setRegularWeekendRate(int regularWeekendRate) {
        this.regularWeekendRate = regularWeekendRate;
    }
    //Getter and setter method

    public int getRewardsWeekdayRate() {
        return rewardsWeekdayRate;
    }

    public void setRewardsWeekdayRate(int rewardsWeekdayRate) {
        this.rewardsWeekdayRate = rewardsWeekdayRate;
    }
    //Getter and setter method
    public int getRewardsWeekendRate() {
        return rewardsWeekendRate;
    }

    public void setRewardsWeekendRate(int rewardsWeekendRate) {
        this.rewardsWeekendRate = rewardsWeekendRate;
    }
    //Getter and setter method
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
