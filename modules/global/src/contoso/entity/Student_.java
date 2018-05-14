package contoso.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|firstMidName,lastName")
@Table(name = "CONTOSO_STUDENT_")
@Entity(name = "contoso$Student_")
public class Student_ extends StandardEntity {
    private static final long serialVersionUID = -8590271579774413822L;

    @Column(name = "LAST_NAME", length = 50)
    protected String lastName;

    @Column(name = "FIRST_MID_NAME", length = 50)
    protected String firstMidName;

    @Temporal(TemporalType.DATE)
    @Column(name = "ENROLLMENT_DATE")
    protected Date enrollmentDate;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstMidName(String firstMidName) {
        this.firstMidName = firstMidName;
    }

    public String getFirstMidName() {
        return firstMidName;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }


}