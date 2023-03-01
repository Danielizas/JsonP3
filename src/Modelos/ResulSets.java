package Modelos;

import java.util.List;

public class ResulSets {
    private List<ResultSet> ResultSet;

    public ResulSets(List<Modelos.ResultSet> resultSet) {
        ResultSet = resultSet;
    }

    public List<ResultSet> getResultSet() {
        return ResultSet;
    }

    public void setResultSet(List<ResultSet> resultSet) {
        this.ResultSet = resultSet;
    }
}
