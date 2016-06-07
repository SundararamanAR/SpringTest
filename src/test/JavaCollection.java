package test;

import java.util.*;

public class JavaCollection {
   List countryList;
   Set  countrySet;
   Map  countryMap;
   Properties countryProp;

   // a setter method to set List
   public void setCountryList(List countryList) {
      this.countryList = countryList;
   }
   
   // prints and returns all the elements of the list.
   public List getCountryList() {
      System.out.println("List Elements :"  + countryList);
      return countryList;
   }

   // a setter method to set Set
   public void setCountrySet(Set countrySet) {
      this.countrySet = countrySet;
   }

   // prints and returns all the elements of the Set.
   public Set getCountrySet() {
      System.out.println("Set Elements :"  + countrySet);
      return countrySet;
   }

   // a setter method to set Map
   public void setCountryMap(Map countryMap) {
      this.countryMap = countryMap;
   }
   
   // prints and returns all the elements of the Map.
   public Map getCountryMap() {
      System.out.println("Map Elements :"  + countryMap);
      return countryMap;
   }

   // a setter method to set Property
   public void setCountryProp(Properties countryProp) {
      this.countryProp = countryProp;
   }
   
   // prints and returns all the elements of the Property.
   public Properties getCountryProp() {
      System.out.println("Property Elements :"  + countryProp);
      return countryProp;
   }
}
