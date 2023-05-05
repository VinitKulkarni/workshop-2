package com.bridgelabz.workshop2;

public class Hotel {

    String hotelName;
    int ratings;
    int weekDaysRateForRegularCustomer;
    int weekDaysRateForRewardsCustomer;
    int weekendRateForRegularCustomer;
    int weekendRateForRewardCustomer;

    public Hotel(String hotelName, int ratings, int weekDaysRateForRegularCustomer, int weekDaysRateForRewardsCustomer,
                 int weekendRateForRegularCustomer, int weekendRateForRewardCustomer) {
        this.hotelName = hotelName;
        this.ratings = ratings;
        this.weekDaysRateForRegularCustomer = weekDaysRateForRegularCustomer;
        this.weekDaysRateForRewardsCustomer = weekDaysRateForRewardsCustomer;
        this.weekendRateForRegularCustomer = weekendRateForRegularCustomer;
        this.weekendRateForRewardCustomer = weekendRateForRewardCustomer;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getRatings() {
        return ratings;
    }

    public int getWeekDaysRateForRegularCustomer() {
        return weekDaysRateForRegularCustomer;
    }

    public int getWeekDaysRateForRewardsCustomer() {
        return weekDaysRateForRewardsCustomer;
    }

    public int getWeekendRateForRegularCustomer() {
        return weekendRateForRegularCustomer;
    }

    public int getWeekendRateForRewardCustomer() {
        return weekendRateForRewardCustomer;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", ratings=" + ratings +
                ", weekDaysRateForRegularCustomer=" + weekDaysRateForRegularCustomer +
                ", weekDaysRateForRewardsCustomer=" + weekDaysRateForRewardsCustomer +
                ", weekendRateForRegularCustomer=" + weekendRateForRegularCustomer +
                ", weekendRateForRewardCustomer=" + weekendRateForRewardCustomer +
                '}';
    }
}
