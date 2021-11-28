package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This deletes a city to the list if the city exists
     * @param city
     *      if the city does not exist then a exception will be thrown.
     */
    public void delete(City city)
    {
        if(!cities.contains(city))
        {
            throw new IllegalArgumentException();
        }
        cities.delete(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This returns the size of the list of the cities
     * @return
     *      Return the list size.
     */
    public int sizeofcity()
    {
        List<City> list = cities;
        return list.size();
    }
}
