/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolocaldate;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Advice
 */
public class DemoLocalDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.getDayOfWeek());
        
        LocalDate day199 = LocalDate.ofYearDay(2020, 199);
        System.out.println("Day 199 of 2020 is " + day199);
        
        LocalDate WorldCup2021 = LocalDate.of(2021, Month.JUNE, 12);
        System.out.println(today.until(WorldCup2021, ChronoUnit.DAYS));
        
        LocalDate Birthdate = LocalDate.of(1997, Month.DECEMBER, 4);
        System.out.printf("อายุ %d ปี %d เดือน %d วัน", 
                            Birthdate.until(today).getYears(),
                            Birthdate.until(today).getMonths(),
                            Birthdate.until(today).getDays());
    }
    
}
