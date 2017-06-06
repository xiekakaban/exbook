package com.st.exbook.entity;

import com.st.exbook.util.GenerateId;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created by e604845 on 6/6/2017.
 */
@MappedSuperclass
public class AbstractMapEntity {
    @Id
    protected String id;

    public AbstractMapEntity() {
        this.setId(GenerateId.generate());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
