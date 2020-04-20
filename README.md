# Covid-19-Library
This is a java library for getting coronavirus statistics from this website : worldometers.info/coronavirus/

**Extra :** [Click here](https://sajjadamin.com/covid19/) to  download covid 19 statistics tracking android app which is mady by using this library.
### Installation
##### Android
- Download JAR files
- Goto your android project's structure > Dependency > ADD Jar Dependency. Then add **covid-19.jar** and **jsoup-1.13.1.jar** on your project
##### Others Java project
- Download and add all 3 jar files on your project.
### Uses
You can get two types of data.
- JSON as String
- Object as ArrayList
#### Example :
Get data from array objects
```
CoronaVirus cv = new CoronaVirus();
ArrayList<DataList> list = cv.getDataList();
for (int i = 0; i < list.size(); i++) {
    DataList data = list.get(i);
    String country = data.getCountryName();
    String infected = data.getTotalCases();
    String newInfected = data.getNewCases();
    String deaths = data.getTotalDeaths();
    String newDeaths = data.getNewDeaths();
    String recovered = data.getTotalRecovered();
    String infectedExists = data.getActiveCases();
    String tested = data.getTested();
    String str = "Country : " + country + "\nTotal Cases : " + infected
            + "\nNew Cases : " + newInfected + "\nTotal Death : " + deaths
            + "\nNew Death : " + newDeaths + "\nTotal Recovered : " + recovered
            + "\nActive Cases : " + infectedExists + "\nSerious Cases : "+serious
            + "\nTested : "+tested+"\n\n";
}
```
Get JSON array
```
CoronaVirus cv = new CoronaVirus();
String json = cv.getJsonStatistics();
```
It will return json array like
```
[{"serious_cases":"1,399","country":"China","total_cases":"81,218","total_deaths":"3,281","new_cases":"47","new_deaths":"4","total_recovered":"73,650","active_cases":"4,287"},{"serious_cases":"3,393","country":"Italy","total_cases":"69,176","total_deaths":"6,820","new_cases":"0","new_deaths":"0","total_recovered":"8,326","active_cases":"54,030"},{"serious_cases":"1,175","country":"USA","total_cases":"54,968","total_deaths":"784","new_cases":"87","new_deaths":"4","total_recovered":"379","active_cases":"53,805"}]......
```
