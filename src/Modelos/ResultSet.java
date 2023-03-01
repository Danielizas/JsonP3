package Modelos;

import java.util.List;

public class ResultSet {
    private String totalResultsAvailable;
    private int totalResultsReturned;
    private int firstResultPosition;
    private List<Result> Result;


    public ResultSet(String totalResultsAvailable, int totalResultsReturned, int firstResultPosition, List<Modelos.Result> result) {
        this.totalResultsAvailable = totalResultsAvailable;
        this.totalResultsReturned = totalResultsReturned;
        this.firstResultPosition = firstResultPosition;
        Result = result;
    }

    public String getTotalResultsAvailable() {
        return totalResultsAvailable;
    }

    public void setTotalResultsAvailable(String totalResultsAvailable) {
        this.totalResultsAvailable = totalResultsAvailable;
    }

    public int getTotalResultsReturned() {
        return totalResultsReturned;
    }

    public void setTotalResultsReturned(int totalResultsReturned) {
        this.totalResultsReturned = totalResultsReturned;
    }

    public int getFirstResultPosition() {
        return firstResultPosition;
    }

    public void setFirstResultPosition(int firstResultPosition) {
        this.firstResultPosition = firstResultPosition;
    }

    public List<Modelos.Result> getResult() {
        return Result;
    }

    public void setResult(List<Modelos.Result> result) {
        Result = result;
    }
}
