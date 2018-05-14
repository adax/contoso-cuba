package contoso.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

@NamePattern("%s %s|course,student")
@Table(name = "CONTOSO_ENROLLMENT")
@Entity(name = "contoso$Enrollment")
public class Enrollment extends StandardEntity {
    private static final long serialVersionUID = -7514178869457046056L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COURSE_ID")
    protected Course course;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STUDENT_ID")
    protected Student_ student;

    @Column(name = "GRADE")
    protected String grade;

    public Student_ getStudent() {
        return student;
    }

    public void setStudent(Student_ student) {
        this.student = student;
    }


    public void setGrade(Grade grade) {
        this.grade = grade == null ? null : grade.getId();
    }

    public Grade getGrade() {
        return grade == null ? null : Grade.fromId(grade);
    }


    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }


}