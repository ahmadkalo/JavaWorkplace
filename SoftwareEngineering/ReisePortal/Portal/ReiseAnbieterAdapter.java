package Portal;

import Reiseanbieter.QueryObject;
import Reiseanbieter.QueryResult;
import Reiseanbieter.ReiseAnbieter;

public class ReiseAnbieterAdapter {
    private ReiseAnbieter system;

    public SuchErgebnis transformiereAuftrag(SuchAuftrag suchauftrag) {
        QueryObject queryObject = this.transformiereInput(suchauftrag);
        QueryResult queryResult = system.executeQuery(queryObject );
        SuchErgebnis suchErgebnis = this.transformiereOutput( queryResult );
        return suchErgebnis;
    }
    private QueryObject transformiereInput(SuchAuftrag suchauftrag ) {
        QueryObject queryObjectTransformiert = new QueryObject();
        return queryObjectTransformiert;
    }
    private SuchErgebnis transformiereOutput(QueryResult queryresult  ) {
        SuchErgebnis suchErgebnisTransformiert = new SuchErgebnis();
        return suchErgebnisTransformiert;
    }
}