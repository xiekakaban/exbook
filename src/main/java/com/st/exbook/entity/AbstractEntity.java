package com.st.exbook.entity;

import com.st.exbook.util.GenerateId;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created by e604845 on 5/15/2017.
 */
@MappedSuperclass
public abstract class AbstractEntity {


    @Id
    protected String id;

    @Column(name="create_time")
    protected Date createTime;

    @Column(name="last_modify_time")
    protected Date lastModifyTime;

    public AbstractEntity() {
        this.setId(GenerateId.generate());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
