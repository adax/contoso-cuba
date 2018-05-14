package contoso.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|title")
@Table(name = "CONTOSO_COURSE")
@Entity(name = "contoso$Course")
public class Course extends StandardEntity {
    private static final long serialVersionUID = 3744261806519910469L;

    @Column(name = "TITLE")
    protected String title;

    @Column(name = "CREDITS")
    protected Integer credits;

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Integer getCredits() {
        return credits;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


}