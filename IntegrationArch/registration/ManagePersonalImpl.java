import com.mongodb.client.*;
import org.bson.Document;
import java.util.*;

public class ManagePersonalImpl implements ManagePersonal {

    private final MongoCollection<Document> salesmenCollection;

    public ManagePersonalImpl() {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase("companyDB");
        this.salesmenCollection = database.getCollection("salesmen");
    }

    @Override
    public void createSalesMan(SalesMan record) {
        Document doc = new Document("sid", record.getSid())
                .append("name", record.getName())
                .append("department", record.getDepartment())
                .append("baseSalary", record.getBaseSalary())
                .append("records", new ArrayList<Document>());
        salesmenCollection.insertOne(doc);
    }

    @Override
    public SalesMan readSalesMan(int sid) {
        Document query = new Document("sid", sid);
        Document result = salesmenCollection.find(query).first();
        if (result == null) return null;

        return new SalesMan(
                result.getInteger("sid"),
                result.getString("name"),
                result.getString("department"),
                result.getDouble("baseSalary")
        );
    }

    @Override
    public void addSocialPerformanceRecord(SocialPerformanceRecord record, SalesMan salesMan) {
        Document newRecord = new Document("year", record.getYear())
                .append("socialScore", record.getSocialScore())
                .append("comments", record.getComments());

        salesmenCollection.updateOne(
                new Document("sid", salesMan.getSid()),
                new Document("$push", new Document("records", newRecord))
        );
    }

    @Override
    public List<SalesMan> readAllSalesMen() {
        List<SalesMan> list = new ArrayList<>();
        for (Document doc : salesmenCollection.find()) {
            list.add(new SalesMan(
                    doc.getInteger("sid"),
                    doc.getString("name"),
                    doc.getString("department"),
                    doc.getDouble("baseSalary")
            ));
        }
        return list;
    }

    // ... Update, Delete etc. analog ergänzen
}
