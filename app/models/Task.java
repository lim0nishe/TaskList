package models;

import java.util.*;
import javax.persistence.*;
import java.sql.Date;
import play.db.jpa.*;

@Entity

// annotation for the table name in the database
@Table(name="Tasks")
public class Task extends Model {

    public String name;
    public String description;
    public Date startDate;
    public Date endDate;

    public Task(String name, String description, String startDate, String endDate) {
        this.name = name;
        this.description = description;
        this.startDate = Date.valueOf(startDate);
        this.endDate = Date.valueOf(endDate);
    }
}