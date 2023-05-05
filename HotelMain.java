package com.bridgelabz.workshop2;

/*A hotel chain operating in Miami wishes to offer room reservation services over the internet. They
        have three hotels in Miami: Lakewood, Bridgewood and Ridgewood. Each hotel has separate
        weekday and weekend (Saturday and Sunday) rates. There are special rates for rewards customer
        as a part of loyalty program. Each hotel has a rating assigned to it.
        Lakewood with a rating of 3 has weekday rates as 110$ for regular customer and 80$ for rewards
        customer. The weekend rates are 90 for regular customer and 80 for a rewards customer.
        Bridgewood with a rating of 4 has weekday rates as 160$ for regular customer and 110$ for
        rewards customer. The weekend rates are 60 for regular customer and 50 for a rewards customer.
        Ridgewood with a rating of 5 has weekday rates as 220$ for regular customer and 100$ for rewards
        customer. The weekend rates are 150 for regular customer and 40 for a rewards customer.
        Can you write a program to help an online customer find the cheapest hotel?*/



import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HotelMain {
    public static void main(String[] args) throws Exception{
        Hotel lakewood = new Hotel("Lakewood",3,110,80,90,80);
        Hotel bridgewood = new Hotel("Bridgewood",4,160,110,60,50);
        Hotel ridgewood = new Hotel("Ridgewood",5,220,100,150,40);

        //System.out.println(lakewood);

        //adding hotel objects in list
        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(lakewood);
        hotelList.add(bridgewood);
        hotelList.add(ridgewood);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date range:");
        System.out.print("FROM:");
        String fromDate = sc.next();
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(fromDate);
        //System.out.println(date1);

        System.out.print("To:");
        String toDate = sc.next();
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(toDate);
        //System.out.println(date2);


        Calendar c1 = Calendar.getInstance();
        c1.setTime(date2);
        if ((c1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)  || (c1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
            System.out.println("WEEKEND PRICE");
            //Predicate ref = o -> (c1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)  || (c1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY);
            List l10 = hotelList.stream().map(Hotel::getWeekendRateForRegularCustomer).reduce((x,y)->x<y?x:y).stream().toList();
            System.out.println(l10);
        } else {
            System.out.println("WEEKDAY");
            System.out.println(hotelList.stream().map(Hotel::getWeekendRateForRewardCustomer).reduce((x,y)-> x<y?x:y));
        }
    }
}
