package day35_Encapulation.scrumTeamTask;

import day36_Inheritance.ScrumTask.Developer;
import day36_Inheritance.ScrumTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private String PO,BA,SM;

    private ArrayList<Tester> testersList = new ArrayList<>();

    public ArrayList<Developer> devopsList = new ArrayList<>();

    int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {
        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public ArrayList<Tester> getTestersList() {
        return testersList;
    }

    public void setTestersList(ArrayList<Tester> testersList) {
        this.testersList = testersList;
    }

    public ArrayList<Developer> getDevopsList() {
        return devopsList;
    }

    public void setDevopsList(ArrayList<Developer> devopsList) {
        this.devopsList = devopsList;
    }

    public int getDaysOfSprint() {
        return daysOfSprint;
    }

    public void setDaysOfSprint(int daysOfSprint) {
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }

    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }
/*
 public void removeTester(int employeeID){
        testersList.removeIf(p -> p.getEmployeeID(employeeID)==employeeID);
    }

    public void removeDeveloper(int employeeID){
        devopsList.removeIf(p -> p.getEmployeeID(employeeID)==employeeID);
    }
 */


    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }

}
