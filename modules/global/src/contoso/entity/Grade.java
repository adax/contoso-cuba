package contoso.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Grade implements EnumClass<String> {

    A("A"),
    B("B"),
    C("C"),
    D("D"),
    F("F");

    private String id;

    Grade(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Grade fromId(String id) {
        for (Grade at : Grade.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}