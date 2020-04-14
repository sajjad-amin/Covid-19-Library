package com.sajjadamin.covid19;

import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
/**
 *
 * @author Sajjad Amin
 */
public class CoronaVirus {
    private ArrayList<DataList> list = new ArrayList<>();
    public String getJsonStatistics() throws IOException{
        String html = Jsoup.connect("https://worldometers.info/coronavirus/").get().html();
        Document document = Jsoup.parse(html);
        Element tbody = document.getElementById("main_table_countries_today").getElementsByTag("tbody").first();
        JSONArray jarray = new JSONArray();
        for (int i = 0; i < tbody.getElementsByTag("tr").size(); i++) {
            Element tr = tbody.getElementsByTag("tr").get(i);
            String country,total_cases,new_cases,total_deaths,new_deaths,total_recovered,active_cases,serious_cases;
                country = tr.getElementsByTag("td").get(0).text();
                total_cases = tr.getElementsByTag("td").get(1).text();
                new_cases = tr.getElementsByTag("td").get(2).text();
                total_deaths = tr.getElementsByTag("td").get(3).text();
                new_deaths = tr.getElementsByTag("td").get(4).text();
                total_recovered = tr.getElementsByTag("td").get(5).text();
                active_cases = tr.getElementsByTag("td").get(6).text();
                serious_cases = tr.getElementsByTag("td").get(7).text();
                if(total_cases.equals("") || total_cases.toLowerCase().equals("n/a")) total_cases = "0";
                if(new_cases.equals("") || new_cases.toLowerCase().equals("n/a")) new_cases = "0";
                if(total_deaths.equals("") || total_deaths.toLowerCase().equals("n/a")) total_deaths = "0";
                if(new_deaths.equals("") || new_deaths.toLowerCase().equals("n/a")) new_deaths = "0";
                if(total_recovered.equals("") || total_recovered.toLowerCase().equals("n/a")) total_recovered = "0";
                if(active_cases.equals("") || active_cases.toLowerCase().equals("n/a")) active_cases = "0";
                if(serious_cases.equals("") || serious_cases.toLowerCase().equals("n/a")) serious_cases = "0";
                JSONObject jobject = new JSONObject();
                jobject.put("country", country);
                jobject.put("total_cases", total_cases);
                jobject.put("new_cases", new_cases.replace("+", ""));
                jobject.put("total_deaths", total_deaths);
                jobject.put("new_deaths", new_deaths.replace("+", ""));
                jobject.put("total_recovered", total_recovered);
                jobject.put("active_cases", active_cases);
                jobject.put("serious_cases", serious_cases);
                jarray.put(jobject);
        }
        return jarray.toString();
    }
    public ArrayList<DataList> getDataList() throws IOException{
        String html = Jsoup.connect("https://worldometers.info/coronavirus/").get().html();
        Document document = Jsoup.parse(html);
        Element tbody = document.getElementById("main_table_countries_today").getElementsByTag("tbody").first();
        for (int i = 0; i < tbody.getElementsByTag("tr").size(); i++) {
            Element tr = tbody.getElementsByTag("tr").get(i);
            String country,total_cases,new_cases,total_deaths,new_deaths,total_recovered,active_cases,serious_cases;
                country = tr.getElementsByTag("td").get(0).text();
                total_cases = tr.getElementsByTag("td").get(1).text();
                new_cases = tr.getElementsByTag("td").get(2).text();
                total_deaths = tr.getElementsByTag("td").get(3).text();
                new_deaths = tr.getElementsByTag("td").get(4).text();
                total_recovered = tr.getElementsByTag("td").get(5).text();
                active_cases = tr.getElementsByTag("td").get(6).text();
                serious_cases = tr.getElementsByTag("td").get(7).text();
                if(total_cases.equals("") || total_cases.toLowerCase().equals("n/a")) total_cases = "0";
                if(new_cases.equals("") || new_cases.toLowerCase().equals("n/a")) new_cases = "0";
                if(total_deaths.equals("") || total_deaths.toLowerCase().equals("n/a")) total_deaths = "0";
                if(new_deaths.equals("") || new_deaths.toLowerCase().equals("n/a")) new_deaths = "0";
                if(total_recovered.equals("") || total_recovered.toLowerCase().equals("n/a")) total_recovered = "0";
                if(active_cases.equals("") || active_cases.toLowerCase().equals("n/a")) active_cases = "0";
                if(serious_cases.equals("") || serious_cases.toLowerCase().equals("n/a")) serious_cases = "0";
                list.add(new DataList(country,total_cases,new_cases.replace("+", ""),total_deaths,new_deaths.replace("+", ""),total_recovered,active_cases,serious_cases));
        }
        return list;
    }
}
