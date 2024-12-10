package com.example.custom_spinner2;

public class country
{
    int flag;
    String countryname ;
    String capital ;
    int populationsize ;


    public country(int flag, String countryname, String capital, int populationsize)
    {
        this.countryname =countryname ;
        this.capital = capital ;
        this.populationsize = populationsize;
        this.flag = flag ;
    }



    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulationsize() {
        return populationsize;
    }

    public void setPopulationsize(int populationsize) {
        this.populationsize = populationsize;
    }
    public country ()
    {
        countryname= "";
        capital  = "" ;
        populationsize = 0 ;
        flag = 0 ;
    }
    @Override
    public String toString()
    {
        return "country{" + "flag=" + flag + ", countryname='" + countryname + '\'' + ", capital='" + capital + '\'' + ", populationsize=" + populationsize + '}';
    }

}
